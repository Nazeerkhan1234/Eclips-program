package com.inputOutputStream;
import java.io.*;    
public class DataInputStreamExample {  
  public static void main(String[] args) throws IOException {  
    InputStream input = new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    byte[] arr = new byte[count];  
    inst.read(arr);  
    for (byte bt : arr) {  
      char k = (char) bt;  
      System.out.print(k+" ");  
    }  
  }  
} 
