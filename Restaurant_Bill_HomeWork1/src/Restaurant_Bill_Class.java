import java.text.DecimalFormat;
import java.util.Scanner;


public class Restaurant_Bill_Class {

	public static void main(String[] args) {
		
		double MealSubTotal = 0, CATax, Gratuity, Total;
		//boolean Valid = true;
		//Do not know how to validate users input YET, assuming user inputs correct parsable value
		
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner UserInputScanner = new Scanner(System.in);
		
		System.out.print("Please Enter Meal Subtotal: ");
		MealSubTotal = UserInputScanner.nextDouble();
		UserInputScanner.close();
		
		CATax = MealSubTotal*0.09;
		Gratuity = MealSubTotal*0.15;
		Total = MealSubTotal + CATax + Gratuity;
		
		System.out.println("");
		System.out.println("Meal Subtotal:  $"+ df.format(MealSubTotal));
		System.out.println("CA Tax (9.00%): $"+df.format(CATax));
		System.out.println("Gratuity (15%): $"+df.format(Gratuity));
		System.out.println("Total:          $"+df.format(Total));
	}

}
