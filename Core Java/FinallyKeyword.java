// finally is the third important part of exception handling, along with try and catch.
// 1. What is finally?
// The finally block contains code that you want to execute whether an exception occurs or not.
// try {
//     // risky code
// }
// catch (Exception e) {
//     // handle exception
// }
// finally {
//     // always execute
// }

// try → attempt the code
// catch → handle the problem
// finally → do this at the end anyway

class MyAgeException extends Exception {

    MyAgeException(String message) {
        super(message);
    }
}



class FinallyKeyword{
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            j=18/i;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally{  //finally can execute after try catch block it will execute if exceptio happen or not
            System.out.println("Bye....");
        }

        try {
            int a = 10;
            int b = 2;

            System.out.println(a / b);
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}