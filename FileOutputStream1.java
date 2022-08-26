package com.inputOutputStream;

import java.io.FileOutputStream;

public class FileOutputStream1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("it is running very well");

			// FileOutputStream fout=new
			// FileOutputStream("C:\\Users\\Nazeer\\Desktop\\hello.txt");

//          fout.write(65);    
//          fout.close();    

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}
