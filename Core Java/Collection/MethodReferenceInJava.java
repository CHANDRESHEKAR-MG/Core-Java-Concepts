import java.util.*;
//import java.stream.Stream;
public class MethodReferenceInJava{
    public static void main(String[]args){
        List<String> names=Arrays.asList("Chandu","Somanna","Maranna","Kempanna");
        List<String> uppNames = names.stream()
            // .map(name->name.toUpperCase())
            //or
            .map(String::toUpperCase)
             .toList();
             uppNames.forEach(i->System.out.println(i));
             //or
             uppNames.forEach(System.out::println);
         System.out.println(uppNames);
    }
}

// import java.util.*;

// public class MethodReferenceInJava {
//     public static void main(String[] args) {

//         List<String> names = Arrays.asList(
//             "Chandu", "Somanna", "Maranna", "Kempanna"
//         );

//         List<String> uppNames = names.stream()
//                 .map(name -> name.toUpperCase())
//                 .toList();

//         System.out.println(uppNames);
//     }
// }

