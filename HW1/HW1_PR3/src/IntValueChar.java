
public class IntValueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] values = {'A','B','C','a','b','c','0','1','2','$','*','+','/',' '};
		
		for (int i = 0; i < values.length; i++) // Increments each value
			// Output each value in form of decimal integers
			System.out.printf("Character value %c has the value %d \n", values[i], ((int)values[i])); 
	}
}