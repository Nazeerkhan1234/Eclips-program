package com.inputOutputStream;

import java.io.FileInputStream;

public class FileInputStreamExample1 {
	public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");    
            int i=0;
            while((i=fin.read())!=-1){    
            System.out.print((char)i);    
            }
            fin.close();
            System.out.println("  it is running very well");
          }catch(Exception e){
        	  System.out.println(e);
        	  }    
         }
}
