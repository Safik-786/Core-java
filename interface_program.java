interface abcd
{
    void show();
}
interface b
{
    void disp();
}
class multiple implements abcd,b
{
    @Override
    public void show()
    {
        System.out.println("interface a ");
    }
    @Override
    public void disp()
    {
        System.out.println("interface  b");
    }

    public static void main(String[] args)
    {
        multiple m= new multiple();
        m.show();
        m.disp();
    }
}
