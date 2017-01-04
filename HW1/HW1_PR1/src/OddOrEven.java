import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.printf("Please enter an integer: ");
		Scanner num = new Scanner(System.in);
		x = num.nextInt();
		
		if (x%2 != 0) // Using modulus to find whether int is odd or even
			System.out.printf("This number is an odd number. \n");
		else // If it is divisible by 2, then output int as even.
			System.out.printf("This number is an even number. \n");
	}

}
