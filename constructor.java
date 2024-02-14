class abc
{
  int a;String b;
  abc(int x,String y)
  {
      a=x;
      b=y;
      System.out.println(a+" "+b);
  }
  abc(abc ref)
  {
      a= ref.a;
      b= ref.b;
      System.out.println(a+" "+b);
  }
}
class constructor
{
    public static void main(String[] args)
    {
        abc r=new abc(20,"safik" );
        abc r2=new abc(r);
    }
}
