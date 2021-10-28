package prog.javastreams.practice.impl;

import prog.javastreams.practice.interfaces.Numbers;

import java.util.List;

public class NumbersImpl implements Numbers {

    public void determineFizzOrBuzz(List<Integer> numbers) {

        for (int number : numbers) {

            boolean fizzOrBuzz = false;
            if (number % 3 == 0) {

                System.out.print("Fizz");
                fizzOrBuzz = true;
            }

            if (number % 5 == 0) {

                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {

                System.out.println();
            }
            else {

                System.out.println(number);
            }
        }
    }

    public void squareFizzBuzzNumbers(List<Integer> numbers) {

        for (int number : numbers) {

            if (number % 3 == 0 || number % 5 == 0) {

                System.out.println(Math.pow(number, 2));
            }
        }
    }
}
