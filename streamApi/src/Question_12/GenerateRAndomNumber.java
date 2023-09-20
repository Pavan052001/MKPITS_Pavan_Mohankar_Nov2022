package Question_12;

import java.util.Random;

public class GenerateRAndomNumber {
    public static void main(String[] args) {
        int numberOfDecimals = 10; // Number of random decimals to generate
        int min = 10; // Minimum value for the range
        int max = 20; // Maximum value for the range

        Random random = new Random();

        for (int i = 0; i < numberOfDecimals; i++) {
            int randomTwoDigitNumber = random.nextInt(max - min + 1) + min;
            System.out.println(randomTwoDigitNumber);
        }
    }
}
//In this code:
//
//        We specify the number of random decimals to generate with numberOfDecimals.
//        We define the range of random decimals using min and max variables.
//        We create a Random object.
//        Inside the loop, we use random.nextDouble() to generate a random double between 0.0 (inclusive) and 1.0 (exclusive), and then we scale it to fit within the specified range using (max - min) * random.nextDouble() + min.
//        We print each random decimal number.
//        You can adjust min, max, and numberOfDecimals to suit your specific requirements for generating random decimal numbers.
//






