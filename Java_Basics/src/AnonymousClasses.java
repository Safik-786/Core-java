interface DemoAnonymous{
    int x= 45;
    void math();
    void math2();

}
//class AnonymousDemo implements DemoAnonymous {
//    public void math2() {
//        System.out.println("Math2");
//    }
//
//    public void math() {
//        System.out.println("Math");
//    }
//
//    public void display() {
//        System.out.println("hello....");
//    }
//}
class Lambda
{
    public static void main(String[] args) {
//        AnonymousDemo and= new AnonymousDemo();
//        and.display();
//        and.math2();
//        and.math();

//            ABIOVE 4 LINE IMPLIMENT ANONYMOUSLY
        DemoAnonymous dnm= new DemoAnonymous() {
            @Override
            public void math() {
                System.out.println("Math");
            }

            @Override
            public void math2() {
                System.out.println("math2");
            }
        };
        dnm.math2();
        dnm.math();


    }

}
