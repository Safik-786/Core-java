// It cant run here ,so we have to run this in CMD PROMPT:

import java.io.*;
import java.util.Scanner;
public class console
{
    public static void main(String[] args)
    {
        String str;
        char ch[];
        Console obj=System.console();
        System.out.println("enter user name:");
        str = obj.readLine();
        System.out.println("enter password:");
        ch=obj.readPassword();                              //program to show password
        System.out.println("USER NAME:"+str);           //String a=String.valueOf(ch);
        System.out.println("PASSWORD:"+ch);             //System.out.println("PASSWORD:"+a);
    }
}
