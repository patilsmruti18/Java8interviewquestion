package java8practiceQuestion;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Demo5 {

    public static void main(String[] args) {

            List<Double> numbers =
                    Arrays.asList(12.5, 45.2, 8.5, 90.1);

            numbers.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
        }
    }

