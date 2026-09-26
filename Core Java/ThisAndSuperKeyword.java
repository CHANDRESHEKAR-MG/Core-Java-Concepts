
// Super means call the constructor of the super class 
//so write super() orr paramet in super(n) beforee the constructor to executr the constructor on the super class 

// this() keyword first executes the constructer of a same class then parent class
class A  extends Object{  // extends Object{ this deafault in every parent class if you mention or not it will be there only 

 A(){ 
    System.out.println("in const A");
 }
  public A (int n){
        System.out.println("in cost A"+  n);
    }

}

class B extends A{
    public B (){
       // super(); // super() means executes super class constructerfirest then  the child class

       super(5); // means excutes the paramer const  inside the parent class 
        System.out.println("in const B");
    }
     public B (int n){
     //super(n);  // here it will first executes the super class paramerized constructer then excutes on a child class const

       //super(); // this means execute deafault const on parent class then this 

       this(); // this() keyword executes the same class default gitbbconst first next move to the parent class like opposite to the super () keyword

        System.out.println("in cost B"+  n);
    }
}

class ThisAndSuperKeyword{
    public static void main(String[] args){
       // B obj = new B(); // default constructor
       B  obj1 = new B (5);

    }
}
