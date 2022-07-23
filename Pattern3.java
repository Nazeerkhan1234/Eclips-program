import java.util.*;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scn.nextInt();
		int alphabet = 65;
		int star = 1;
		int space = number - 1;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			
			star++;
			space--;
			System.out.println();
		}

	}

}
