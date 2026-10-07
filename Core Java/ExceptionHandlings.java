class ExceptionHandlings {
    
//     1. What is exception handling?
// An exception is an unexpected problem that occurs while a program is running.

//              try
//               ↓
//         risky statement
//               ↓
//        Exception occurs?
//           ↙        ↘
//         NO          YES
//         ↓            ↓
//    continue      stop try
//                      ↓
//                   catch
//                      ↓
//               handle exception
//                      ↓
//               continue after
//               try-catch
        public static void main(String[] args) {

        // 2 types of statements
        int i = 9; // simple
        int j = 0;

        j = 8 / i; // critical

       int nums[]= new int[5];
        // what if i = 0
        i = 0;
        i=2;
          i=0;
// The try block contains the code that might cause an exception.
        String s=null;
        try {  //critical statement in try block 

        System.out.println(s.length());
            j = 8 / i;//Try executing this code. There might be a problem here."
          // System.out.println(nums[1]);
            System.out.println(nums[5]);//Something went Wrong   java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }

//         What is catch?
// The catch block handles the exception if one occurs inside the try block.
        // catch (Exception e) {//exception is a class with e as a reference variable in java
        //     // handle the exception
        //     System.out.println("Something went Wrong   "+e);//e print what type of exception it is 
        // }

        //Multiple actch Blocks
      
        catch(ArithmeticException e) 
        {
            System.out.println("A number canot be devided by zerro ");
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limmit or extend array limit ");
        }


        //if i=0 executes first catch block it terminates or don't look at next exception it will go to next printingg statemnt outsie the exception or catch block

//if you doont know the class of exception write one normal exception class like

//Always Write this Exception class at the endbcz if yopu write this at first it will handle all the exception types then no neede to write furtehr known exception catch blocks so lats is best 
            
        catch(Exception e)
        {
            System.out.println("Something went wrong "+e);//s length is null when try to exeute this catch bloxk will executed


        } 

        System.out.println(j);


    

        System.out.println("haiiii");


//  What happens without try-catch?
// Consider:
// int i = 0;
// int j = 8 / i;
// System.out.println("haiiii");
// Execution:
// 8 / 0
//    ↓
// ArithmeticException
//    ↓
// Program terminates ❌
//    ↓
// "haiiii" doesn't execute
// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero

        
//The try block contains code that may generate an exception,
// while the catch block is used to handle the exception thrown from the try block.
//If an exception occurs, the remaining statements in the try block are skipped and control is transferred to the matching catch block. After the catch block completes,
// execution continues with the statements following the try-catch block.
// The most important thing to remember is:
// try = "This code may cause a problem."
// catch = "If that problem happens, handle it here."
    }
}


