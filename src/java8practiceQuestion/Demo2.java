package java8practiceQuestion;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {

        List<String> languages =
                Arrays.asList("Java", "Python", "Java", "C++", "Python");

        List<String> result =
                languages.stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(languages);
        System.out.println(result);
    }
}


