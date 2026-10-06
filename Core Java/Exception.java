//types

What is an Exception?

//An exception is an abnormal condition that occurs during program execution and interrupts the normal flow of the program.

//1.Compile time error
//2.Runtime error
//3.logical error

class Exception{
    public static void main(String[] args){
        System.out.printlN()
        //this is Syntactical error or Compile time error  mistakes 
        //mistakes from developer side 

//logiacal error

        //logical error means while calculating some calculations multiple lines of code developer expecting result is actual different from output

//runtime error

//. Runtime Error

//The program successfully compiles, but an error/exception occurs while it is running.

//Example:

int a = 10;
int b = 0;

System.out.println(a / b);

//It compiles, but while running:

//ArithmeticException: / by zero

//Other examples:

int[] arr = {10, 20};
System.out.println(arr[5]);

//→ ArrayIndexOutOfBoundsException

String s = null;
System.out.println(s.length());

//→ NullPointerException

///Key point: Compile succeeds → program starts → problem occurs during execution.


//3. Logical Error

//The program compiles and runs successfully, but produces the wrong output because your logic is incorrect.

//Example:

int a = 10;
int b = 20;

int average = a + b / 2;

System.out.println(average);

//You might expect:15

//But Java calculates:

//10 + (20 / 2)= 20

//The correct logic is:

//int average = (a + b) / 2;

//Output:15

    }
}

// Easy way to remember
//              Errors
//                 |
//        ┌────────┼────────┐
//        ↓        ↓        ↓
//    Compile    Runtime   Logical
//      Time
//        ↓        ↓        ↓
//    Won't run  Crashes   Runs but
//                         wrong answer