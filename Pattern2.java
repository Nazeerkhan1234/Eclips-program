
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A B C D E
//		A B C D
//		A B C
//		A B
//		A

		
		int alphabet = 65;
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print((char)(alphabet + j )+" ");
			}
		System.out.println();
	}
		}

	}


