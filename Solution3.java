import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    //program to find students whose names start with “A” for special gifts
    public static void main(String[] args) {
        // Create a list of student names
        List<String> students = new ArrayList<>();
        students.add("Anisha");
        students.add("Ashwini");
        students.add("Harini");
        students.add("Shamita");
        students.add("Amrutha");
        students.add("Saranya");
        students.add("Anusha");

        //filter students whose names start with A
        List<String> studentsWithANames = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        //Print the result
        System.out.println("Students with names starts in A:");
        for (String student : studentsWithANames) {
            System.out.println(student);
        }
    }
}
