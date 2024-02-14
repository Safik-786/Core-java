
//.............LIFO ORDER................

import java.util.Stack;

public class jc_07_stack
{
    public static void main(String[] args)
    {
        Stack<String> name = new Stack<String>();
        name.push("apple");
        name.push("mango");
        name.push("orange");
        name.push("grapes");
        name.push("pineapple");
        name.push("coconut");
        name.push("strawberry");
        for (String str:name)
        {
            System.out.print(str+"    ");
        }
        System.out.println();

        name.pop();
        name.pop();
        System.out.println(name);
//        peek operation::::::::
        System.out.println("peak element is:"+name.peek());
//        search operation::: it return index position from "top" of the stack.
        System.out.println(name.search("orange"));
//        empty():check whether the stack is empty or not: return true or false
        System.out.println(name.empty());
    }
}
