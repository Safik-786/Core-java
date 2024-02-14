package Exception_tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class throws_keyword
{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\ytsaf\\Desktop\\safik.txt");
//  statement
    }
    void saveFile()  throws FileNotFoundException
    {
        String text="this is demo tut";
        FileOutputStream fos =new FileOutputStream("C:\\Users\\ytsaf\\Desktop\\safik.txt");
        ;
        ;
//     statements   ;
    }
}
class  Test34{
    public static void main(String[] args) throws FileNotFoundException
    {
        throws_keyword tk =new throws_keyword();
//        try {
//            tk.readFile();
//            tk.saveFile();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        tk.readFile();
        tk.saveFile();
        System.out.println("safik mahammad");
    }
}
