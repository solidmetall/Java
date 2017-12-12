import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollBar;


public class Restaurant_Bill_GUI {

	private JFrame frmRestaurantBill;
	private JTextField txtMealSubtotal;
	private JTextField txtMealSub;
	private JTextField txtTax;
	private JTextField txtGratuity;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant_Bill_GUI window = new Restaurant_Bill_GUI();
					window.frmRestaurantBill.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant_Bill_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurantBill = new JFrame();
		frmRestaurantBill.getContentPane().setForeground(Color.BLACK);
		frmRestaurantBill.setTitle("Restaurant Bill");
		frmRestaurantBill.setBounds(100, 100, 521, 392);
		frmRestaurantBill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurantBill.getContentPane().setLayout(null);
		
		JLabel lblMealSubtotal = new JLabel("Enter Meal Subtotal:");
		lblMealSubtotal.setBounds(47, 42, 133, 14);
		frmRestaurantBill.getContentPane().add(lblMealSubtotal);
		
		txtMealSubtotal = new JTextField();
		txtMealSubtotal.setBounds(190, 39, 136, 20);
		frmRestaurantBill.getContentPane().add(txtMealSubtotal);
		txtMealSubtotal.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double MealSubTotal = 0, CATax, Gratuity, Total;
				DecimalFormat df = new DecimalFormat("#.##");
				
				MealSubTotal = Double.parseDouble(txtMealSubtotal.getText());
				CATax = MealSubTotal*0.09;
				Gratuity = MealSubTotal*0.15;
				Total = MealSubTotal + CATax + Gratuity;
				//df.format(CATax);
				
				txtMealSub.setText(txtMealSubtotal.getText());
				txtTax.setText(df.format(CATax));
				txtGratuity.setText(df.format(Gratuity));
				txtTotal.setText(df.format(Total));
			}
		});
		btnCalculate.setBounds(361, 38, 89, 23);
		frmRestaurantBill.getContentPane().add(btnCalculate);
		
		JLabel lblNewLabel = new JLabel("Meal Subtotal :");
		lblNewLabel.setBounds(47, 122, 98, 14);
		frmRestaurantBill.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CA Tax (9.00%) :");
		lblNewLabel_1.setBounds(47, 161, 98, 14);
		frmRestaurantBill.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gratuity (15%) :");
		lblNewLabel_2.setBounds(47, 204, 98, 14);
		frmRestaurantBill.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total :");
		lblNewLabel_3.setBounds(47, 235, 98, 14);
		frmRestaurantBill.getContentPane().add(lblNewLabel_3);
		
		txtMealSub = new JTextField();
		txtMealSub.setBackground(SystemColor.control);
		txtMealSub.setEditable(false);
		txtMealSub.setForeground(SystemColor.windowText);
		txtMealSub.setEnabled(false);
		txtMealSub.setBounds(190, 119, 86, 20);
		frmRestaurantBill.getContentPane().add(txtMealSub);
		txtMealSub.setColumns(10);
		
		txtTax = new JTextField();
		txtTax.setBackground(SystemColor.control);
		txtTax.setEditable(false);
		txtTax.setForeground(SystemColor.windowText);
		txtTax.setEnabled(false);
		txtTax.setBounds(190, 158, 86, 20);
		frmRestaurantBill.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtGratuity = new JTextField();
		txtGratuity.setBackground(SystemColor.control);
		txtGratuity.setEditable(false);
		txtGratuity.setForeground(SystemColor.windowText);
		txtGratuity.setEnabled(false);
		txtGratuity.setBounds(190, 201, 86, 20);
		frmRestaurantBill.getContentPane().add(txtGratuity);
		txtGratuity.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBackground(SystemColor.control);
		txtTotal.setEditable(false);
		txtTotal.setForeground(SystemColor.windowText);
		txtTotal.setEnabled(false);
		txtTotal.setBounds(190, 232, 86, 20);
		frmRestaurantBill.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
	}
}
