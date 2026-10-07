class Bank {

    static void withdraw(int balance, int amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }
}
// MyException in Java
// MyException usually means a custom exception class created by the programmer.
class MyExceptionChandu extends Exception {

    MyExceptionChandu(String message) {
        super(message);
    }
}

public class ThrowInJava{
//     What is throw?
// throw is used to manually throw an exception.


    public static void main(String[] args) {
        int i=21;
        int j=0;
        int age = 15;

        // if (age < 18) {
        //     throw new ArithmeticException("You are not eligible");
        // }

        // System.out.println("You are eligible");

        // //trow with try catch block
      
        age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("Age is less than 18");
            }

            System.out.println("Eligible");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");

        try {
            j=18/i ;
             if(j==0){
                throw new ArithmeticException("i dont want to print zero");
            }
        } 
        catch (ArithmeticException e) 
        {
            j=18/1;
            System.out.println("thats the default output"+e);
            //System.out.println("Number Canot BE devisible by zero");
           
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong ");
        }
        System.out.println(j);
        System.out.println("HAiiiaaaaa");

        try {
           Bank.withdraw(5000, 7000);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
    }


         age = 15;
        try {
            if (age < 18) {
                throw new MyExceptionChandu("Age must be 18 or above");
            }

            System.out.println("Eligible my exception classs ");
        }
        catch (MyExceptionChandu e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...  my exception");
    }
}