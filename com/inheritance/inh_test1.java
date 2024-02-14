package com.inheritance;


class Panthera {
    Panthera() {
        System.out.println("hey i am constructor panthera");
    }
}
class leo extends Panthera{
    leo(){
        System.out.println("hey i am constructor Leo");
    }
}
class test2{
    public static void main(String[] args) {
        Panthera l = new Panthera();          // or will execute 1st one constructor
        System.out.println();

        Panthera l2 = new leo();          // or will execute both constructor
        System.out.println();

        leo l3 = new leo();                 // or will also execute both constructor
    }
}

