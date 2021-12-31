package streamproject;

import java.util.stream.Stream;

// printing first 100 prime numbers using parallel stream and sequential stram
public class ParallelStreamExample {
	public static void main(String[] args) {

        int count = (int) Stream.iterate(0, n -> n + 1).limit(100).parallel().filter(ParallelStreamExample::isPrime).count();

        System.out.println("\nTotal prime number from 1 -100 are : " + count);

    }


    private static boolean isPrime(int number) {

        if (number <= 1) return false;    

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}


