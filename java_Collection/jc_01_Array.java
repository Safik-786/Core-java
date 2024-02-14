import java.util.*;


public class jc_01_Array


{
    public static void main(String[] args)
    {
//        Object creation of ArrayList class
        ArrayList<String> fruits = new ArrayList<String>();

//      Element Insertion in an  array
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("guava");
        fruits.add(1, "grapes");
        fruits.add(5, "strawberry");
        System.out.println("total inserted fruits are.....");
        System.out.println(fruits);
        System.out.println("array is empty or not  :"+fruits.isEmpty());

        System.out.println("array size is......");
        System.out.println("size of fruit array =" + fruits.size());
//        traversion

//        for (String str:fruits)
//        {
//            System.out.print(str+"    ");
//        }
//        System.out.println();


//      Element Deletion in an array

        System.out.println("after deleting index 1......");
        fruits.remove(1);
        System.out.println(fruits);
        System.out.println("after removing mango..... ");
        fruits.remove("mango");
        System.out.println(fruits);



        System.out.println("arter replacing index 1 fruit with banana.....");
        fruits.set(1, "banana");                  // replace fruits in an array
        System.out.println(fruits);

        System.out.println("accessing index 2 fruit.....");
        System.out.println("Particular fruits is " + fruits.get(2));        //to print or access a particular fruits

        System.out.println("clearing all object from array....");
//        fruits.clear();                   //  if we want to delete all the array element at a time
        fruits.removeAll(fruits);
        System.out.println(fruits);



//        .............INTEGER.............
        System.out.println();
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(65);
        num.add(87);
        num.add(123);
        num.add(76);
        num.add(98);
        num.add(45);
        System.out.println(num);
        System.out.println("num size is ...= " +num.size());
        System.out.println("after removing index 2 element......");
        num.remove(2);
        System.out.println(num);
       // System.out.println("remove all element from array num......");
       // num.removeAll(num);
       // System.out.println(num);                // num.clear();   it is more efficient
       // System.out.println(num.isEmpty());        //  check array is empty or not

//        copy element from 1 array to another

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.addAll(num);
        System.out.println("after copying element from arrayy num.....");
        System.out.println(num2);
//        reverse array element
        System.out.println("after reversing num 2 array......");
        Collections.reverse(num2);
        System.out.println(num2);
//        sorting
        System.out.println("after sorting num2 array list is");
        Collections.sort(num2);
        System.out.println(num2);

    }
}
