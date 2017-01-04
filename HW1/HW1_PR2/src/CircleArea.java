import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Please enter a radius: ");
		Scanner num = new Scanner(System.in); // Inputs user answer
		double radius = num.nextDouble();
		double area = Math.PI*(radius * radius); // Uses the PI funtion as portion of equation
		System.out.printf("The area of the cirsle is: " + area);	
	}

}