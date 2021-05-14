package restaurant_s;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.tools.Diagnostic;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Restaurants {

	private JFrame frame;
	private JTextField ckbg;
	private JTextField ckbgm;
	private JTextField chb;
	private JTextField textField_4;
	private JTextField qntd;
	private JTextField curr;

	double Nigerian_Naira = 302.96;
	double US_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_Peso = 71.74;
	double Indonesian_Rupiah = 20746.75;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		menu.setBounds(26, 98, 612, 265);
		frame.getContentPane().add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(39, 20, 208, 30);
		menu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(39, 65, 208, 30);
		menu.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(39, 106, 208, 30);
		menu.add(lblNewLabel_1_2);
		
		ckbg = new JTextField();
		ckbg.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		ckbg.setHorizontalAlignment(SwingConstants.RIGHT);
		ckbg.setBounds(287, 20, 208, 30);
		menu.add(ckbg);
		ckbg.setColumns(10);
		
		ckbgm = new JTextField();
		ckbgm.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		ckbgm.setHorizontalAlignment(SwingConstants.RIGHT);
		ckbgm.setColumns(10);
		ckbgm.setBounds(287, 65, 208, 30);
		menu.add(ckbgm);
		
		chb = new JTextField();
		chb.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		chb.setHorizontalAlignment(SwingConstants.RIGHT);
		chb.setColumns(10);
		chb.setBounds(287, 110, 208, 30);
		menu.add(chb);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Drink");
		lblNewLabel_1_2_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_2_2.setBounds(39, 150, 176, 35);
		menu.add(lblNewLabel_1_2_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Coca Cola", "Coke", "Coffe", "Ice Tea", "Ice Coffee", "Orange"}));
		comboBox.setBounds(39, 187, 138, 30);
		menu.add(comboBox);
		
		JCheckBox homedeli = new JCheckBox("Home Delivery");
		homedeli.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		homedeli.setBounds(39, 217, 148, 30);
		menu.add(homedeli);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Quantity");
		lblNewLabel_1_2_2_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_2_2_1.setBounds(287, 150, 176, 35);
		menu.add(lblNewLabel_1_2_2_1);
		
		qntd = new JTextField();
		qntd.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		qntd.setHorizontalAlignment(SwingConstants.RIGHT);
		qntd.setColumns(10);
		qntd.setBounds(287, 182, 208, 30);
		menu.add(qntd);
		
		JCheckBox checktax = new JCheckBox("Tax");
		checktax.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		checktax.setBounds(287, 217, 148, 30);
		menu.add(checktax);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 150, 455, 2);
		menu.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1.setBounds(648, 98, 321, 265);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		comboBox_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		comboBox_1.setBounds(91, 34, 138, 30);
		panel_1.add(comboBox_1);
		
		curr = new JTextField();
		curr.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		curr.setHorizontalAlignment(SwingConstants.RIGHT);
		curr.setColumns(10);
		curr.setBounds(58, 85, 203, 30);
		panel_1.add(curr);
		
		JLabel afcon = new JLabel("");
		afcon.setHorizontalAlignment(SwingConstants.RIGHT);
		afcon.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		afcon.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		afcon.setBounds(58, 136, 203, 27);
		panel_1.add(afcon);
		
		JButton convertbtn = new JButton("Convert");
		convertbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double British_Pound = Double.parseDouble(curr.getText());
				if (comboBox_1.getSelectedItem().equals("Nigeria")) {
					String cConvert1 = String.format("N %.2f", British_Pound*Nigerian_Naira);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("USA")) {
					String cConvert1 = String.format("$ %.2f", British_Pound*US_Dollar);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("Kenyan")) {
					String cConvert1 = String.format("KS %.2f", British_Pound*Kenyan_Shilling);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("Canada")) {
					String cConvert1 = String.format("C$ %.2f", British_Pound*Canadian_Dollar);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("Brazil")) {
					String cConvert1 = String.format("Bra %.2f", British_Pound*Brazilian_Real);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("India")) {
					String cConvert1 = String.format("INR %.2f", British_Pound*Indian_Rupee);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("Philippine")) {
					String cConvert1 = String.format("PHP %.2f", British_Pound*Philippine_Peso);
					afcon.setText(cConvert1);
				}
				if (comboBox_1.getSelectedItem().equals("Indonesia")) {
					String cConvert1 = String.format("IDR %.2f", British_Pound*Indian_Rupee);
					afcon.setText(cConvert1);
				}
			}
		});
		convertbtn.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		convertbtn.setBounds(58, 197, 90, 30);
		panel_1.add(convertbtn);
		
		JButton closebtn = new JButton("Close");
		closebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.setSelectedItem("Choose one");
				afcon.setText(null);
				curr.setText(null);
			}
		});
		closebtn.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		closebtn.setBounds(171, 197, 90, 30);
		panel_1.add(closebtn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_2.setBounds(26, 373, 612, 137);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of Drinks");
		lblNewLabel_1_3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(23, 10, 176, 34);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(23, 50, 176, 34);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_2_1.setBounds(23, 90, 176, 35);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel cod = new JLabel("");
		cod.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		cod.setHorizontalAlignment(SwingConstants.RIGHT);
		cod.setBounds(286, 10, 203, 27);
		cod.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.add(cod);
		
		JLabel com = new JLabel("");
		com.setHorizontalAlignment(SwingConstants.RIGHT);
		com.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		com.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		com.setBounds(286, 50, 203, 27);
		panel_2.add(com);
		
		JLabel code = new JLabel("");
		code.setHorizontalAlignment(SwingConstants.RIGHT);
		code.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		code.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		code.setBounds(286, 90, 203, 27);
		panel_2.add(code);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1_1.setBounds(648, 373, 321, 137);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tax");
		lblNewLabel_1_3_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_3_1.setBounds(21, 10, 77, 34);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_1_1_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(21, 50, 77, 34);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total");
		lblNewLabel_1_2_1_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel_1_2_1_1.setBounds(21, 90, 77, 35);
		panel_1_1.add(lblNewLabel_1_2_1_1);
		
		JLabel tax = new JLabel("");
		tax.setHorizontalAlignment(SwingConstants.RIGHT);
		tax.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		tax.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tax.setBounds(130, 10, 170, 27);
		panel_1_1.add(tax);
		
		JLabel subtotal = new JLabel("");
		subtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		subtotal.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		subtotal.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		subtotal.setBounds(130, 50, 170, 27);
		panel_1_1.add(subtotal);
		
		JLabel total = new JLabel("");
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		total.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		total.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		total.setBounds(130, 90, 170, 27);
		panel_1_1.add(total);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1_2.setBounds(978, 98, 346, 412);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 20, 299, 371);
		panel_1_2.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea receipt = new JTextArea();
		receipt.setFont(new Font("Mongolian Baiti", Font.BOLD, 13));
		receipt.setBounds(10, 10, 274, 324);
		panel_3.add(receipt);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_4, null);
		panel_4.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(17, 13, 262, 50);
		panel_4.add(textField_4);
		
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(17, 73, 62, 45);
		panel_4.add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(88, 73, 55, 45);
		panel_4.add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(152, 73, 59, 45);
		panel_4.add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(220, 73, 59, 45);
		panel_4.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(220, 128, 59, 45);
		panel_4.add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(152, 128, 59, 45);
		panel_4.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(88, 128, 55, 45);
		panel_4.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(17, 128, 62, 45);
		panel_4.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(17, 183, 62, 45);
		panel_4.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(88, 183, 55, 45);
		panel_4.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(152, 183, 59, 45);
		panel_4.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(220, 183, 59, 45);
		panel_4.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(220, 238, 59, 45);
		panel_4.add(btnDiv);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(152, 238, 59, 45);
		panel_4.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(88, 238, 55, 45);
		panel_4.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(17, 238, 62, 45);
		panel_4.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(17, 289, 62, 45);
		panel_4.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(88, 289, 55, 45);
		panel_4.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(152, 289, 59, 45);
		panel_4.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(220, 289, 59, 45);
		panel_4.add(btnEqual);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel_1_3.setBounds(26, 520, 1298, 104);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Meal
				double ChicBurger = Double.parseDouble(ckbg.getText());
				double iChicBurger = 2.39;
				double Burger;
				Burger = iChicBurger*ChicBurger;
				String pMeal = String.format("%.2f", Burger);
				com.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(ckbgm.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = ChicBurgerMeal*iChicBurgerMeal;
				String cbMeal = String.format("%.2f", BurgerMeal+Burger);
				com.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(chb.getText());
				double iCheeseBurger = 3.39;
				double CheeseBurgerMeal = CheeseBurger*iCheeseBurger;
				String cheese = String.format("%.2f", CheeseBurgerMeal+BurgerMeal+Burger);
				com.setText(cheese);
				
				//Delivery
				double iDelivery = 3.39;
				if (homedeli.isSelected()) {
					String pDelivery = String.format("%.2f", iDelivery);
					code.setText(pDelivery);
				}else {
					code.setText("0");
				}
				
				//Drinks
				double Drinks = Double.parseDouble(qntd.getText());
				double Tea = 1.2*Drinks;
				double Ice_tea = 0.9*Drinks;
				double Coffee = 2.5*Drinks;
				double Ice_Coffee = 1.1*Drinks;
				double Cola = 2.1*Drinks;
				double Coke = 1.6*Drinks;
				double Orange = 1.7*Drinks;
				double Apple_Juice = 1.99*Drinks;
				
				if (comboBox.getSelectedItem().equals("Apple Juice")) {
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					cod.setText(cApple_Juice);
				}
				if (comboBox.getSelectedItem().equals("Tea")) {
					String cTea = String.format("%.2f", Tea);
					cod.setText(cTea);
				}
				if (comboBox.getSelectedItem().equals("Ice Tea")) {
					String cIce_Tea = String.format("%.2f", Ice_tea);
					cod.setText(cIce_Tea);
				}
				if (comboBox.getSelectedItem().equals("Coke")) {
					String cCoke = String.format("%.2f", Coke);
					cod.setText(cCoke);
				}
				if (comboBox.getSelectedItem().equals("Coca Cola")) {
					String cCola = String.format("%.2f", Cola);
					cod.setText(cCola);
				}
				if (comboBox.getSelectedItem().equals("Orange")) {
					String cOrange = String.format("%.2f", Orange);
					cod.setText(cOrange);
				}
				if (comboBox.getSelectedItem().equals("Coffee")) {
					String cCoffee = String.format("%.2f", Coffee);
					cod.setText(cCoffee);
				}
				if (comboBox.getSelectedItem().equals("Ice Coffee")) {
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					cod.setText(cIce_Coffee);
				}
				if (comboBox.getSelectedItem().equals("Select a drink")) {
					cod.setText("0");
				}
				
				//Tax
				double cTotal1 = Double.parseDouble(cod.getText());
				double cTotal2 = Double.parseDouble(com.getText());
				double cTotal3 = Double.parseDouble(code.getText());
				double alltax = (cTotal1+cTotal2+cTotal3)/100;
				if (checktax.isSelected()) {
					String itax = String.format("%.2f", alltax);
					tax.setText(itax);
				}
				
				//Total
				double cTotal4 = Double.parseDouble(tax.getText());
				
				double subTotal = cTotal1+cTotal2+cTotal3;
				String isubTotal= String.format("£ %.2f", subTotal);
				subtotal.setText(isubTotal);
				
				double allTotal = subTotal+cTotal4;
				String iTotal = String.format("£ %.2f", allTotal);
				total.setText(iTotal);
				
				String taxf = String.format("£ %.2f", cTotal4);
				tax.setText(taxf);
				
			}
		});
		btnTotal.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnTotal.setBounds(283, 38, 90, 30);
		panel_1_3.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double qty1 = Double.parseDouble(ckbg.getText());
				double qty2 = Double.parseDouble(ckbgm.getText());
				double qty3 = Double.parseDouble(chb.getText());
				
				receipt.append("--------------------------------------------------------------------");
				receipt.append("\n    Restaurant Management Systems\n\n"+
						" Chicken Burger:\t\t"+qty1+
						"\n Chicken Burger Meal:\t\t"+qty2+
						"\n Cheese Burger:\t\t"+qty3+
						"\n\n   Thanks for using Job Estimator\n");
			}
		});
		btnReceipt.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnReceipt.setBounds(492, 38, 90, 30);
		panel_1_3.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				code.setText(null);
				subtotal.setText(null);
				total.setText(null);
				tax.setText(null);
				curr.setText(null);
				cod.setText(null);
				com.setText(null);
				ckbg.setText(null);
				ckbgm.setText(null);
				chb.setText(null);
				qntd.setText(null);
				afcon.setText(null);
				comboBox.setSelectedItem("Select a drink");
				comboBox_1.setSelectedItem("Choose one");
				homedeli.setSelected(false);
				checktax.setSelected(false);
				receipt.setText(null);
			}
		});
		btnReset.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnReset.setBounds(674, 38, 90, 30);
		panel_1_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnExit.setBounds(881, 38, 90, 30);
		panel_1_3.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Loan Management Systems");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 70));
		lblNewLabel.setBounds(285, 0, 788, 78);
		frame.getContentPane().add(lblNewLabel);
	}
}
