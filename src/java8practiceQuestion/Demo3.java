package java8practiceQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {

    public static void main(String[] args) {

        String str = "Java";

        Map<String, Long> result =
                Arrays.stream(str.split(""))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(result);
    }
}
