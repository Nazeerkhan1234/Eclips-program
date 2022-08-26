package com.inputOutputStream;
import java.io.*;  
public class DataOutputStreamExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");  
        DataOutputStream data = new DataOutputStream(file); 
        
        data.writeInt(90);
        data.writeChar('a');
        
        data.flush();  
        data.close();  
        System.out.println("it is running very well");  
    }  
}  

