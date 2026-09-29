class StringBuilderinjava {
    // StringBuilder is a mutable sequence of characters.
    //  It is used to create and manipulate strings that can be modified after they are created.
    //  It is similar to StringBuffer but it is not synchronized. 
    // It is not thread-safe. It is faster than StringBuffer.
    // StringBuilder is used when we need to make a lot of modifications to a string.
    //Stringbuffer is used when we need to make a lot of modifications to a string in a multi-threaded environment.
    //String builder is used in mainly on dsa and competitive programming because it is faster than stringbuffer and string.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends the specified string to the end of the StringBuilder
        System.out.println(sb); // Output: Hello World

        // StringBuilder methods
         sb.capacity();// gives the capacity of the string buffer
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append(" World");// appends the specified string to the end of the string buffer

        // String str=sb; // stringbuffer cannot be converted to string directly. we need to use toString() method to convert it to string.
        String str=sb.toString();// converts the string buffer to string
        System.out.println(str);

        System.out.println(sb);
        sb.insert(5, " Java");// inserts the specified string at the specified index

        System.out.println(sb);
        sb.replace(5, 10, " C++");// replaces the specified string with the specified string at the specified index

        System.out.println(sb);
        sb.delete(5, 10);// deletes the specified string from the specified index

        System.out.println(sb);
        
        sb.replace(0, 5, "Hello");// replaces the specified string with the specified string at the specified index 

        System.out.println(sb);
        sb.ensureCapacity(1);
        System.out.println(sb.capacity());// gives the capacity of the string buffer
        sb.setLength(5);// sets the length of the string buffer
        System.out.println(sb.length());// gives the length of the string buffer
        sb.trimToSize();// trims the capacity of the string buffer to the current length
        System.out.println(sb.capacity());// gives the capacity of the string buffer

        String sub = sb.substring(0, 5);// extracts a substring from the string buffer
        System.out.println(sub);

        CharSequence seq = sb.subSequence(0, 4);// extracts a subsequence from the string buffer
        System.out.println(seq);

        sb.setCharAt(0, 'h');// sets the character at the specified index
        System.out.println(sb);

        sb.repeat(97, 3); // repeats the character 'a' 3 times
        System.out.println(sb);

        int lastIndex = sb.lastIndexOf(str, 5);// gives the index of the last occurrence of the specified string
        System.out.println(lastIndex);


        sb.reverse();// reverses the string buffer
        System.out.println(sb);
    

        System.out.println("Length of sb: " + sb.length()); // Output: 11
        System.out.println("Uppercase: " + sb.toString().toUpperCase()); // Output: HELLO WORLD
        System.out.println("Lowercase: " + sb.toString().toLowerCase()); // Output: hello world
        System.out.println("Substring (0, 5): " + sb.substring(0, 5)); // Output: Hello
        System.out.println("Index of 'World': " + sb.toString().indexOf("World")); // Output: 6

    }
}
