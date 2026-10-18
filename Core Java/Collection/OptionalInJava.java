import java.util.Optional;
import java .util.*;

public class OptionalInJava {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("chandu","somanna","maranna","kempanna");
        String name1 =names.stream()
        .filter(str->str.contains("a"))
        .findFirst()
        .orElse("notfound");
        System.out.println(name1);





        // ofNullable creates an Optional that can contain a value or be empty.
        String userName = findUserName(1);
        Optional<String> name = Optional.ofNullable(userName);

        // ifPresent runs the action only when a value exists.
        name.ifPresent(value -> System.out.println("User name: " + value));

        // orElse provides a default value when the Optional is empty.
        String displayName = name.orElse("Guest");
        System.out.println("Display name: " + displayName);

        // map transforms a value only when it exists.
        String upperCaseName = name
                .map(String::toUpperCase)
                .orElse("No user found");
        System.out.println("Uppercase name: " + upperCaseName);

        // An empty Optional also safely uses the default from orElse.
        Optional<String> missingName = Optional.ofNullable(findUserName(2));
        System.out.println("Missing user: " + missingName.orElse("Guest"));
    }

    private static String findUserName(int userId) {
        // A real lookup might return null when no matching user exists.
        if (userId == 1) {
            return "Asha";
        }
        return null;
    }
}
