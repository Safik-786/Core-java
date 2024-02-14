package com.inheritance;

class Rectangle
{
    public int length;
    public int bredth;
    public double x;
     Rectangle(int l,int b) {
        this.length=l;
        this.bredth=b;
    }
    public double Area()
    {
        double x=this.bredth*this.length;
        return  x;
    }
}
class cuboid extends Rectangle
{
    public int height;
//    it just assign values
    cuboid(int h,int l, int b) {
        super(l, b);
        this.height=h;
    }

    public double cube()
    {
        return this.height*this.length*this.bredth;
    }
}
public class inh_2
{
    public static void main(String[] args) {
        Rectangle cr = new Rectangle(5,4);
        double b =cr.Area();
        System.out.println("area is "+ b);
        cuboid c = new cuboid(5,5,4);
        double t=c.cube();
        System.out.println("its cube is " +t);
    }
}
