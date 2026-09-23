package java8practiceQuestion;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo8 {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(45, 12, 89, 35, 67, 10);

        int maximum =
                numbers.stream()
                        .max(Comparator.naturalOrder())
                        .get();

        int minimum =
                numbers.stream()
                        .min(Comparator.naturalOrder())
                        .get();

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}


