package com.inheritance;

class sphere
{
    double area(int r)
    {
        return 4*Math.PI*r*r;
    }
    double volume(int r){
        return ((4/3)*Math.PI * r*r*r);
    }
}
public class inh_3
{
    public static void main(String[] args) {
        sphere sp = new sphere();


        System.out.println("area is "+ sp.area(5));
        System.out.println("area is "+sp.volume(6));
    }
}
