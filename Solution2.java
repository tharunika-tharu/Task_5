import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    //program to check whether the Strings in the List are empty or not and print the list having non-empty strings
    public static void main(String[] args) {
        //Create a list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        //filter non-empty strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        //print the result
        System.out.println(nonEmptyStrings);
    }
}
