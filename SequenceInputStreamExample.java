package com.inputOutputStream;

import java.io.*;

class SequenceInputStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello2.txt");
		FileInputStream input2 = new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}
