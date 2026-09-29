// 2 types 
//1) compile time polymorphism - early binding - overloading 
//2)run time polymorphism - late binding  - overiding

class A{
    public void show(){
        System.out.println("in class A");
    }

}
class B extends A{
    public void show(){
        System.out.println("in class B");
    
    }

}
class c extends B{
    public void show(){
        System.out.println("in class c");
    
    }

}
public class Polymorphism{
    public static void main(String[] args) {

        //Dynamic method dispatch 
        // run time plymorphism 
          A obj = new A();//op is in class A
          obj.show();
          obj=new B();
          obj.show();
          obj=new c();
          obj.show();


          //A obj = new B();// op is in class B

          //parent class refernce and subclass object is ok

       //obj.show(); // if parent class have only show methd tehn op is in class A
        // if boh A And B class have same method then sub class overide
    }
}