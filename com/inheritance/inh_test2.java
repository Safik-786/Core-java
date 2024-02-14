package com.inheritance;

 class Animal
{
    public  String name;
    public int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    void  nameAnimal (){
        System.out.println("my name is "+this.name);
    }

}
class  dog extends Animal{


     dog(String name, int age) {
        super(name, age);

    }

    void breed(){
         System.out.println("i am german serfer. and my age is "+this.age);
     }
     void height(){
         System.out.println("my height is 2 meter");
     }
}
class demo{
    public static void main(String[] args) {
        dog rocky = new dog("safik", 18);
        rocky.nameAnimal();
        rocky.breed();



        //      here we observe  that constructor of animal class, and dog class is also executed,
        //      but we cant call the all method of the

    }
}
