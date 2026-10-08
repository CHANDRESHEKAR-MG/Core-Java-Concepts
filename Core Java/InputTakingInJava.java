// In Java, the most common way to take input from the user is using Scanner.
// 1. Import Scanner
// At the top:
// import java.util.Scanner;
// Then create a Scanner object:
// Scanner sc = new Scanner(System.in);
// Here:

// Scanner → class
// sc → reference variable
// new Scanner(System.in) → creates Scanner object
// System.in → takes input from keyboard

import java.util.Scanner;

class InputTakingInJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Scanner → class
// sc → reference variable
// new Scanner(System.in) → creates Scanner object
// System.in → takes input from keyboard

 System.out.print("Enter your age: ");
        // int age = sc.nextInt();

        // System.out.println("Your age is: " + age);

try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }

        } catch (Exception e) {
            System.out.println("Please enter age as a whole number.");
        }

        System.out.println("float");
        float f = sc.nextFloat();
        System.out.println("float :  "+f);

        System.out.println("doublle");
        double d = sc.nextDouble();
        System.out.println("Double"+"  "+ d);

        System.out.println("Long");
        long l = sc.nextLong();
        System.out.println("long   : "+l);

        System.out.println("Boolean");
        boolean b = sc.nextBoolean();
        System.out.println("bool  :"+b);

        System.out.println("String or single word");
        String name = sc.next();
        System.out.println("Namee=="+name);

        System.out.println("Take a complete sentence");
        String name1 = sc.nextLine();
        System.out.println("Sentemce =="+name1);


      System.out.print("Enter your full name: ");
        String name2 = sc.nextLine();

        System.out.println("Hello " + name2);


    }
}