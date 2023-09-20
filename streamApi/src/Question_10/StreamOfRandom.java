package Question_10;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamOfRandom {
    public static void main(String[] args) {
            int numberOfRandomNumbers = 10;
            Random random = new Random();

            IntStream randomStream = random.ints(numberOfRandomNumbers); // Generates an infinite stream of random integers
            randomStream
                    .limit(numberOfRandomNumbers) // Limits the stream to produce only 10 random numbers
                    .forEach(System.out::println); // Print each random number
        }

          

}
