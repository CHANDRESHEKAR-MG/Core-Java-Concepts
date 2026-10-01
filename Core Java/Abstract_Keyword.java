//Abstract classs can have multiple abstract methods 
//Abstract class can also have non abstract methods
//Abstract method should be inside tthe abstract class

abstract class car{ // for obstract class objects can't created
    public void drive(){ //method definig
        System.out.println("Car is driving");
    }
    public abstract void Company(); // method declaration
    //abstact method is a method that is declared without an implementation
    //abstract method should be declared inside the abstract class
    //method initialization can be done at subclass level
     public void PlayMusic(){
        System.out.println("Car is playing music");
    }
    public void stop(){
        System.out.println("Car is stopped");
    }
}
     class Fortuner extends car{
       public void Company(){
        //parent class method is declred in sub class
        //parent class have only method defination but not method body so we have to define the method in sub class
        //for that reason we have to use abstract class
            System.out.println("Fortuner is a German company");
        }
    }

public class Abstract_Keyword{
    public static void main(String[] args){
        car myCar = new Fortuner();
        myCar.drive();
        myCar.PlayMusic();
        myCar.stop();
        myCar.Company();
    }
}