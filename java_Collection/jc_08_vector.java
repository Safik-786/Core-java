/*

--  vector class is an implementation of list interface.
--  Vector is a resizable array which ae similar to Arraylist.
--  Vector Synchronizes each indivisual Operations.
    i.e we can access single thread at a time
--  But in case of Array list method are not synchronised but LIST are synchronised.
--  Vector is less efficient than arrayList.
 */

import java.util.Vector;
public class jc_08_vector
{
    public static void main(String[] args)
    {
        Vector<String> vect1=new Vector<>();
        vect1.add("safik");
        vect1.add("rijuan");
        vect1.add(1,"tukulu");
        System.out.println("vect1:"+vect1);
        Vector<String> vect2=new Vector<>();
        vect2.addAll(vect1);
        System.out.println("vect2="+vect2);

        System.out.println("element value of index 1 of vect1 is "+vect1.get(1) );
//        vect2.remove("tukulu");
//        vect2.remove(0);
        vect2.removeAll(vect2);
        System.out.println("now vect2:"+vect2);
        vect1.set(0,"anshu");
        System.out.println("now vect1:"+vect1);
        System.out.println("size of vect1:  "+vect1.size());




    }
}
