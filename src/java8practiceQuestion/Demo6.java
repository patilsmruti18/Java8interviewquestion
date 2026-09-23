package java8practiceQuestion;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {

    public static void main(String[] args) {

        List<String> languages =
                Arrays.asList("Java", "Python", "C++","DSA");

        String result =
                languages.stream()
                        .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(result);
    }
}


