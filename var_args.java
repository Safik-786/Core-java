class a
{
    int add( int... a)
    {
        int sum=0;
        for (int c : a)
        {
            sum = sum + c;
        }
        System.out.println("sum of numbers ="+sum);
        return 0;
    }
}
class test2
{
    public static void main(String[] args)
    {
        a r = new a();
        r.add();
        r.add(10);
        r.add(10,20);
        r.add(10,20,30);
        r.add(10,20,30,40);

    }
}
