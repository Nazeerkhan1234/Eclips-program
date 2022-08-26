package com.inputOutputStream;
import java.io.*;  
public class BufferedinputStreamExample{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();
    System.out.println("   it is running very well");
  }catch(Exception e){
	  System.out.println(e);
	  }    
 }    
}  

