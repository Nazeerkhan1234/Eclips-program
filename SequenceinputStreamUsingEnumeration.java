package com.inputOutputStream;
import java.io.*;    
import java.util.*;    
class SequenceinputStreamUsingEnumeration{    
public static void main(String args[])throws IOException{    
   
FileInputStream fin=new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello.txt");    
FileInputStream fin2=new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello1.txt");    
FileInputStream fin3=new FileInputStream("C:\\Users\\Nazeer\\Desktop\\hello2.txt");    
        
Vector v=new Vector();    
v.add(fin);    
v.add(fin2);    
v.add(fin3);                 
   
Enumeration e=v.elements();      
    
SequenceInputStream bin=new SequenceInputStream(e);    
int i=0;      
while((i=bin.read())!=-1){    
System.out.print((char)i);    
}     
bin.close();    
fin.close();    
fin2.close();    
}    
}    

