package java8practiceQuestion;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Demo9 {

    public static void main(String[] args) {

        int[] first = {5, 2, 8};
        int[] second = {1, 7, 3};

        int[] result =
                IntStream.concat(
                                Arrays.stream(first),
                                Arrays.stream(second)
                        )
                        .sorted()
                        .toArray();

        System.out.println(Arrays.toString(result));
    }
}
