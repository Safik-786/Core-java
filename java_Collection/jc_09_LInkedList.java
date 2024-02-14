import java.util.LinkedList;

public class jc_09_LInkedList
{
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
//        element insertion in linked list
        name.add("safik");
        name.add("rijuan");
        name.add("gudu");
        name.add("rahul");
        for (String str:name)
        {
            System.out.print(str+"    ");
        }
        System.out.println();

        name.addFirst("saima");
        name.addLast("saifa");
//        System.out.println(name);
        for (String str:name)
        {
            System.out.print(str+"    ");
        }
        System.out.println();

//        deletion operation in linked list
        name.remove();              //it remove by default from beginning
        for (String str:name)
        {
            System.out.print(str+"    ");
        }
        System.out.println();

        name.remove(2);
        name.removeFirst();
        name.removeLast();
        for (String str:name)
        {
            System.out.print(str+"    ");
        }
        System.out.println();
        name.set(0,"anshuman");
        System.out.println(name);
        System.out.println(name.getLast());

    }
}
