class MyAgeException extends Exception {

    MyAgeException(String message) {
        super(message);
    }
}

public class AllEXceptionHandliesInthisCode{
    static void checkAge(int age) throws MyAgeException {

        if (age < 18) {

            // throw → manually throws an exception
            throw new MyAgeException("Age must be 18 or above");
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        int age = 15;

        // try → contains code that may cause an exception
        try {

            System.out.println("Checking age...");

            checkAge(age);

            System.out.println("This line will not execute if exception occurs");
        }

        // catch → catches and handles the exception
        catch (MyAgeException e) {

            System.out.println("Exception caught: " + e.getMessage());
        }

        // finally → executes at the end
        finally {

            System.out.println("Age checking completed");
        }

        System.out.println("Program continues...");
    }
}