package com.inheritance;

class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class inh_1 {
    public static void main(String[] args) {
        // Problem 1
        Circle objC = new Circle(12);
        double b=objC.area();
        System.out.println("area is="+ b);
        Cylinder1 obj = new Cylinder1(12,4);
        obj.volume();
    }
}
