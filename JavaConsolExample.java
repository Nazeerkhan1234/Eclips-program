package com.inputOutputStream;

import java.io.Console;

class JavaConsolExample {
	public static void main(String args[]) {
		 String str;
	        Console con = System.console();
	        if(con == null) 
	        {
	            System.out.print("No console available");
	            return;
	        }
	        str = con.readLine("Enter your name: ");
	        con.printf("Here is your name: %s\n", str);
	  
	}
}