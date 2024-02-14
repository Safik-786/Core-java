public class implementation_of_LL
{
    node head;
    class  node
    {
        String  data;
        node next;
        node(String x)
        {
            data= x;
            next=null;
        }
    }
    public void traverse()
    {
        node n = head;
        while (n != null)
        {
            System.out.println(n.data+ " ");
            n=n.next;
        }
    }
    public node insertFirst(String  data)
    {
        node  new_node= new node(data);
            new_node.next = head;
            head=new_node;
        return head;
    }
    public  node insertLast(String data)
    {
        node new_node= new node(data);
        if(head == null){
            head=new_node;
        }
        node n =head;
        while (n.next != null){
            n= n.next;
        }

        n.next=new_node;

        return head;
    }
//    insert after node
    public node insertIndex(node index ,String data)
    {
        node n = head;
        while (n.next != index )
        {
            n = n.next;
        }
        node new_node =new node(data);
        n.next = new_node;

        return head;
    }
}
class Main{
    public static void main(String[] args) {
        implementation_of_LL i = new implementation_of_LL();
        i.insertFirst("abc ");
        i.insertFirst("abcd ");
        i.insertFirst("abcsd");

        i.traverse();
        System.out.println();
        System.out.println();
        i.insertLast("safik");
        i.insertLast("rahul");

        i.traverse();

//        i.insertIndex(1,"fuck");

    }
}
