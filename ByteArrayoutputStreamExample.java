package com.inputOutputStream;
import java.io.*;  
public class ByteArrayoutputStreamExample {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");    
      FileOutputStream fout2=new FileOutputStream("C:\\Users\\Nazeer\\Desktop\\hello.txt");    
        

      ByteArrayOutputStream bout1=new ByteArrayOutputStream();   
      ByteArrayOutputStream bout2=new ByteArrayOutputStream();   
      bout1.write(65);
      bout2.write(66);
      
      bout1.writeTo(fout1);    
      bout2.writeTo(fout2);    
        

      bout1.flush();    
      bout1.close();   
      
      bout2.flush();    
      bout2.close();   
      System.out.println("it is running very well");   
     }    
    }   

