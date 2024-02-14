package serialz.java;

import java.io.*;

public class SerializationDemo
{
    public static void main(String[] args)  throws  Exception
    {
        Student s1 = new Student();
        s1.name="safik";
        s1.roll=23;
        File f = new File("\"C:\\Users\\ytsaf\\Desktop\\dld.txt\"");
        String filename= "C:\\Users\\ytsaf\\Desktop\\dld.txt";
        try {
            FileOutputStream fos= new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("object save in file");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
