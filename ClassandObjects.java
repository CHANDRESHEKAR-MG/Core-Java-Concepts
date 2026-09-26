class A {
    A(){
        System.out.println("Objected created  in class A");
    }
    void show (){
        System.out.println("A class objects");
    }
}
class B {
    B(){
        System.out.println("Objected created in B class ");
    }
    void show (){
        System.out.println("B class objects");
    }
}
public class ClassandObjects{
    public static void main (String[] args){

        //A obj = new A (); 
        A obj; //reference  varaible obj
        obj=new A();  // objected created
        obj.show(); //method called using object
        // new kwyword is used to create object
        new B(); //here also object was created but there is no reference variable 
        //  new B(); this will print message inside the connstructer b class
        new B().show();//method is called using the objected created in class B but withod reference varible
        // new B().show();   // this will prinnt message inside the constructor and inside method 
        //but in refernce variable called it only once 
        // new B().show(); every time when you call this a new object will created but in reference varible class created a ojects only one time by using that refernce variable we can call differebt methods
        
    
    }
}