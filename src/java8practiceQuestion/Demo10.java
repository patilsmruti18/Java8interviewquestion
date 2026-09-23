package java8practiceQuestion;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Demo10 {


    public static void main(String[] args) {

        int[] first = {5, 2, 8, 2};
        int[] second = {1, 7, 3, 5};

        int[] result =
                IntStream.concat(
                                Arrays.stream(first),
                                Arrays.stream(second)
                        )
                        .distinct()
                        .sorted()
                        .toArray();

        System.out.println(Arrays.toString(result));
    }
}


