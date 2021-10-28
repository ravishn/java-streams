package prog.fizzbuzz;

import prog.fizzbuzz.exception.BlokeException;
import prog.fizzbuzz.impl.CorporateBlokeImpl;
import prog.fizzbuzz.impl.NumbersImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) throws BlokeException {

        NumbersImpl numbersImpl = new NumbersImpl();
        CorporateBlokeImpl corporateBlokeImpl = new CorporateBlokeImpl();

        int rangeStart = 1;
        int rangeEnd = 10;
        List<Integer> numbers = IntStream.rangeClosed(rangeStart, rangeEnd).boxed().collect(Collectors.toList());

        System.out.println("==================FIZZ OR BUZZ==================");
        numbersImpl.determineFizzOrBuzz(numbers);

        System.out.println("==================SQUARE FIZZ BUZZ NUMBERS==================");
        numbersImpl.squareFizzBuzzNumbers(numbers);

        System.out.println("==================CORPORATE BLOKE==================");
        CorporateBlokeImpl corporateBloke = corporateBlokeImpl.setAllBlokeData();
        corporateBlokeImpl.howIsTheBlokeDoing(corporateBloke);
    }
}
