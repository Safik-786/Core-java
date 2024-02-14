//push()=it insert element at the front of the list.
//pop()=it remove and return first element of the list.

import java.util.LinkedList;

public class jc_09_push_pop_LL
{
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("a");
        name.add("r");
        name.add("f");
        name.add("g");
        name.add("k");
        name.push("kj");
        name.push("uyr");
        System.out.println(name);
        System.out.println(name.pop());
        System.out.println("after pop operation list: "+name);
    }
}
