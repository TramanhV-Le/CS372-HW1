import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner BMI = new Scanner (System.in); // Asks for user input
		System.out.printf("Enter Weight in pounds: ");
			int weight = BMI.nextInt(); 
		System.out.printf("Enter height in inches: ");
			int height = BMI.nextInt();
		double index = ((weight * 703)/(height * height));
		System.out.printf ("Body Mass Index is: " + index); // Displays the answer for index
		
		if (index >= 30) // Refers to index  to display message
			System.out.printf("BMI values indicates body is Obese. \n");
		else if (index >= 25)
			System.out.printf("BMI values indicates body is Overweight. \n");
		else if (index >= 18.5)
			System.out.printf("BMI values indicates body is Normal. \n");
		else
			System.out.printf("BMI values indicates body is Underweight. \n");
	}

}
