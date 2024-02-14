package serialz.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialization
{
    public static void main(String[] args)
    {
        String filename= "C:\\Users\\ytsaf\\Desktop\\dld.txt";
        try {
            FileInputStream fis= new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj=(Student)ois.readObject();
            System.out.println("name is ="+obj.name);
            System.out.println("roll no is ="+obj.roll);
            fis.close();
            ois.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
