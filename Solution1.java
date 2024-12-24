import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1 {
    //program to convert a list of Strings into uppercase using map() method
    public static void main(String[] args) {
        //create a stream of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        //convert to list of uppercase strings using map()
        List<String> uppercaseNames = names.map(String::toUpperCase).collect(Collectors.toList());

        //Print the result
        System.out.println("Uppercase Names: " + uppercaseNames);
    }
}
