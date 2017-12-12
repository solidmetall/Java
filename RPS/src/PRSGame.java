import java.util.Random;

import javax.swing.JOptionPane;


public class PRSGame {

	public static void main(String[] args) {
		
		Integer ComStats = new Integer(0);
		Integer UserStats = new Integer(0);
		Integer Draws = new Integer(0);
		
		while(true)
		{		
			int UserChoice = 0;
				int ComChoice = ComputerSelection();
				
				try
				{
					UserChoice = UserSelection();
				}
				catch(Exception ex)
				{
					System.exit(0);
				}
			
				if(Winner(UserChoice, ComChoice) == 0)
				{
					UserStats = UpdateStat(UserStats);
				}
				else if (Winner(UserChoice, ComChoice) == 1)
				{
					ComStats = UpdateStat(ComStats);
				}
				else if(Winner(UserChoice, ComChoice) == 2)
				{
					Draws = UpdateStat(Draws);
				}
		
				DisplayStats(UserStats, ComStats, Draws, Winner(UserChoice, ComChoice));
			
		}
	}
	public static int ComputerSelection()
	{
		Random RandomNumber = new Random();
		return (RandomNumber.nextInt(3));
	}
	public static int UserSelection()
	{
		String choice = JOptionPane.showInputDialog("Please enter your choice\n0 - Rock\n1 - Paper\n2 - Scissors");
		return Integer.parseInt(choice);
	}
	
	public static int Winner(int User, int Computer)
	{
		int[][] WinMatrix = new int[3][3];
		
		WinMatrix[0][0] = 2;
		WinMatrix[0][1] = 1;
		WinMatrix[0][2] = 0;
		
		WinMatrix[1][0] = 0;
		WinMatrix[1][1] = 2;
		WinMatrix[1][2] = 1;
		
		WinMatrix[2][0] = 1;
		WinMatrix[2][1] = 0;
		WinMatrix[2][2] = 2;
		
		return WinMatrix[Computer][User];
		
/* 	   R P S

	R  2 1 0
	P  0 2 1
	S  1 0 2
	
	R - Rock
	P - Paper
	S - Scissors
	
	Returns 0 if User wins
	Returns 1 if Computer wins
	Returns 2 if Draw
	*/
	}
	
	public static int UpdateStat(int score)
	{
		return score+1;
	}
	 
	public static void DisplayStats(Integer User, Integer Computer, Integer Draw, int win)
	{
		if(win == 0)
		{
			JOptionPane.showMessageDialog(null, "You won!\n\nWin/Loss Stats:\n\nYou won: "+ User+" times\nYou Lost: "+Computer+" times\nDraw: "+Draw+" times");
		}
		else if(win == 1)
		{
			JOptionPane.showMessageDialog(null, "You Lost!\n\nWin/Loss Stats:\n\nYou won: "+ User+" times\nYou Lost: "+Computer+" times\nDraw: "+Draw+" times");
		}
		else if(win == 2)
		{
			JOptionPane.showMessageDialog(null, "Draw!\n\nWin/Loss Stats:\n\nYou won: "+ User+" times\nYou Lost: "+Computer+" times\nDraw: "+Draw+" times");
		}
	}
}
