/*
 * Petin Evgeniy
 * CSIT-890
 * Homework #10
 * Chapter 13
 * PC #9 - Dice Simulator
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Dice extends JFrame {

	private JPanel panel;
	private JButton btnRoll;
	private JLabel lblDice1;
	private JLabel lblDice2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice frmMain = new Dice();
	}

	public Dice()
	{
		panel = new JPanel();
		
		lblDice1 = new JLabel();
		lblDice1.setSize(new Dimension(104,104));
		lblDice1.setIcon(new ImageIcon("Die6.png"));
		
		lblDice2 = new JLabel();
		lblDice2.setSize(new Dimension(104,104));
		lblDice2.setIcon(new ImageIcon("Die6.png"));
		
		btnRoll = new JButton("Roll Dice");
		btnRoll.addActionListener(new btnRoll_Click());
		
		panel.add(lblDice1);
		panel.add(lblDice2);
		panel.add(btnRoll);
		
		setTitle("Dice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(panel);
		this.setSize(250, 200);
		this.setLocation(300, 200);
		this.setVisible(true);
	}

	private class btnRoll_Click implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Random RandomNumber = new Random();
			
			Integer num1 = RandomNumber.nextInt(6);
			Integer num2 = RandomNumber.nextInt(6);
			
			while (num1 == 0)
			{
				num1 = RandomNumber.nextInt(6);
			}
			while (num2 == 0)
			{
				num2 = RandomNumber.nextInt(6);
			}
			
			lblDice1.setIcon(new ImageIcon("Die"+num1.toString()+".png"));
			lblDice2.setIcon(new ImageIcon("Die"+num2.toString()+".png"));
		}
		
	}

}
