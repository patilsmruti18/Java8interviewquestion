package java8practiceQuestion;
import java.util.Arrays;
import java.util.List;
public class Demo7 {


    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 12, 15, 23, 25, 31);

        numbers.stream()
                .filter(n -> n % 5 == 0)
                .forEach(System.out::println);
    }

}

