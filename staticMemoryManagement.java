 class Employ {
     int employId;
     String name;
     static String companyName ;

     Employ(int employId, String name) {
         this.employId = employId;
         this.name = name;
     }
     void display(){
         companyName="HCL";
         System.out.println(employId+" "+name+" "+companyName);
     }

     public static void main(String[] args) {
         Employ e1 = new Employ(1,"safik");
         e1.display();

         Employ e2 = new Employ(2,"rahul");
         e2.display();

         Employ e3 = new Employ(3,"gudu");
         e3.display();

         Employ e4 = new Employ(4,"sohel");
         e4.display();

         Employ e5 = new Employ(5,"bablu");
         e5.display();
     }
 }

