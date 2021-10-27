package prog.fizzbuzz;

import prog.fizzbuzz.impl.NumbersImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        NumbersImpl numbersImpl = new NumbersImpl();

        int rangeStart = 1;
        int rangeEnd = 100;
        List<Integer> numbers = IntStream.rangeClosed(rangeStart, rangeEnd).boxed().collect(Collectors.toList());

        System.out.println("==================FIZZ OR BUZZ==================");
        numbersImpl.determineFizzOrBuzz(numbers);

        System.out.println("================== SQUARE FIZZ BUZZ NUMBERS==================");
        numbersImpl.squareFizzBuzzNumbers(numbers);
    }
}
