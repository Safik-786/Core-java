import java.io.*;
import java.lang.*;
public class RandomAccess
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile raf = null;
        try
        {
            raf = new RandomAccessFile("C:\\Users\\ytsaf\\Desktop\\safik.txt", "rw");
            raf.seek(11);
            raf.write("Safik".getBytes());
            System.out.println("successful");
//            int i = 0;
//            while ((i = raf.read()) != -1)
//            {
//                System.out.print((char) i);
//            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            if (raf != null)
            {
                raf.close();
            }
        }
    }
}

