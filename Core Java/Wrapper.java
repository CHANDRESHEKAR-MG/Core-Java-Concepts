public class Wrapper{
    public static void main(String[] args){
        //int-Integer
        //char-Character
        //String-String
        int num=7;
       Integer num1= new Integer(8);
       // [removal] Integer(int) in Integer has been deprecated and marked for removal
     // new Integer(8); in future this will be removed
     Integer num2=9;
     System.out.println(num2);

      System.out.println(num1);



      int i=10; ///primitive  value strotin in a object
      Integer j=new Integer(i);//boxing //storing primitive in a object 
      //boxing
      System.out.println(j);

   
                 //or
                 Integer j1 = i;//AutoBoxing


      System.out.println(j1);

      //getig int value fron object wrapper class 
      Integer j2=22;
      int num4=j2.intValue();
      System.out.println(num4);

      // conversion of string to int using wrapper classs methos

      String str ="12"; // double the string value 12*2=24
      int num5=Integer.parseInt(str);
      System.out.println(str);
      System.out.println(num5);
      System.out.println(num5*2);

     

//Converts String → Integer object.
 //Integer.valueOf()
String s = "100";

Integer x = Integer.valueOf(s);

System.out.println(x);

// Difference
// int a = Integer.parseInt("100");

// Integer b = Integer.valueOf("100");
// Method	Returns
// parseInt()	int
// valueOf()	Integer

//3. Integer.toString()

//Converts int → String.

int x1 = 15;

String s1 = Integer.toString(x1);

System.out.println(s1+"kohli");//to prove by concationation with string 
System.out.println(s1.getClass().getName());//shows the class name string
//int → String


//4. Integer.compare()

//Compares two integers.

int result = Integer.compare(10, 20);

System.out.println(result);

//Output:-1

//Examples:

System.out.println(Integer.compare(20, 10)); // 1
// Integer.compare(10, 10); // 0
// Integer.compare(10, 20); // -1


// 5. Integer.max()

//Returns the larger value.

int x2 = Integer.max(10, 20);

System.out.println(x2);

//Output:20

//6. Integer.min()

//Returns the smaller value.

int x4 = Integer.min(10, 20);
System.out.println(x4);

//Output:10
//7. Integer.sum()

//Adds two integers.

int x6 = Integer.sum(10, 20);

System.out.println(x6);

///8. Integer.toBinaryString()

//converts integer to binary.

String s3 = Integer.toBinaryString(10);

System.out.println(s3);

//Output:1010
//int → binary String
//9. Integer.toHexString()

//Converts integer to hexadecimal.

String s4 = Integer.toHexString(255);

System.out.println(s4);

//Output:ff
//10. Integer.toOctalString()

//Converts integer to octal.

String s6 = Integer.toOctalString(10);

System.out.println(s6);

//Output:12


// Other Wrapper Classes

// The same concept exists for other primitive types.

// Double
// double x = Double.parseDouble("10.5");
// Double y = Double.valueOf("10.5");
// Float
// float x = Float.parseFloat("10.5");
// Float y = Float.valueOf("10.5");
// Long
// long x = Long.parseLong("10000");
// Long y = Long.valueOf("10000");
// Short
// short x = Short.parseShort("100");
// Short y = Short.valueOf("100");
// Byte
// byte x = Byte.parseByte("10");
// Byte y = Byte.valueOf("10");
// Boolean
// boolean x = Boolean.parseBoolean("true");
// Boolean y = Boolean.valueOf("true");
// Character

// Character is slightly different because it doesn't have parseChar().

// For example:

// char c = 'A';

// boolean result = Character.isLetter(c);

// Other useful methods:

// Character.isDigit('5');       // true
// Character.isLetter('A');      // true
// Character.isUpperCase('A');   // true
// Character.isLowerCase('a');   // true
// Character.toUpperCase('a');   // A
// Character.toLowerCase('A');   // a

    }
   
       
}  
   