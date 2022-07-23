
public class Pattern1 {

	public static void main(String[] args) {

//		  1. Write a Java program that will print a pattern as shown below? 
//		  A 
//		  A B 
//		  A B C
//		  A B C D
//		  A B C D E	
		

	int alphabet = 65;
	for(int i=0; i<5; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print((char)(alphabet + j )+" ");
		}
	System.out.println();
}
	}

}
