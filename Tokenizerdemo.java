package tokenizerdemo;

import java.util.*;
import java.io.*;

public class Tokenizerdemo {
    
    public static void main(String[] args) throws Exception
    {
       
        FileInputStream fis=new FileInputStream("Users/dansi/MyJava/Student1.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        
        String data=new String(b);
        
       // String data="name=Vijay address=delhi country=india dept=cse";
        

        StringTokenizer stk=new StringTokenizer(data,"= ");
        
        String s;
        
        while(stk.hasMoreTokens())
        {
           s=stk.nextToken();
           System.out.println(s);
        }    
    }
    
}
