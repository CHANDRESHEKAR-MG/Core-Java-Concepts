package  Packages;

public class A {
   public  int marks=55; // used anywhere inside different packages class etc 
   private int rollno=89;//  inside same class only
   public static void main(String[] args) {
       c c1 = new c();
      
   }
}


class C extends A{   
   //System.out.println(rollno); // rooll no is private
   System.out.println(marks);
}