class Strings{
    public static void main (String[] args) {
        
        String str1 = "Hello";
        String str2 = "World";
        str1="java "+str1;
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        System.out.println(str3.length());// gives the length of the string
        System.out.println(str3.isEmpty());// checks if the string is empty or not
        System.out.println(str3.toUpperCase());// converts the string to upper case
        System.out.println(str3.toLowerCase());// converts the string to lower case
        System.out.println(str3.charAt(0));// gives the character at the specified index
        System.out.println(str3.contains("Hello"));// checks if the string contains the specified sequence
        System.out.println(str3.indexOf("o"));// gives the index of the first occurrence of the specified character
        System.out.println(str3.substring(5, 10 ));// gives the substring starting from the specified index
        String str4 = "   java Hello World   "; 
        System.out.println(str4.trim());    // removes the leading and trailing spaces
        System.out.println(str3.equals(str4));
        System.out.println(str3.equals(str4.trim()));

        str3="java Heyy java hello Hello World";


        System.out.println(str3.equalsIgnoreCase(str4));// compares the string with the specified string ignoring the case
        System.out.println(str3.replace("Hello", "Java"));// replaces the specified character with the specified character
        System.out.println(str3.replaceAll("Hello", "Java"));// replaces all the 
        // occurrences of the specified character with the specified character
        System.out.println(str3.replaceFirst("Hello", "Java"));// replaces the first occurrence 
        // of the specified character with the specified character
        System.out.println(str3.startsWith("java"));// checks if the string starts with the
        // specified character
        System.out.println(str3.endsWith("World"));// checks if the string ends with the
        // specified character
       int result = compareString(str3, str4);// compares the two strings lexicographically
       System.out.println(result);
       System.out.println(lastIndexOf(str3, "java"));// gives the index of the last occurrence of the specified character

    }

    public static int compareString(String strA, String strB){// compares the two strings lexicographically 

        return strA.compareTo(strB);// returns a negative integer, zero, or a positive integer as the specified string is greater than,
        //  equal to, or less than the specified string
    }

    public static int lastIndexOf(String str, String target){
        return str.lastIndexOf(target);
    }
}