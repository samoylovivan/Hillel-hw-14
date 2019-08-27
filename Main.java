package ivan.samoylov;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
final static int MAX_SIZE_ARR = 10;
final static int RANGE_RANDOM = 60;

    public static void main(String[] args) {
     int[] arr = new int[MAX_SIZE_ARR];
     Random random = new Random();

     for (int i = 0; i < MAX_SIZE_ARR; i++){
         arr[i] = random.nextInt(RANGE_RANDOM);
     }
        double result = IntStream.of(arr).average().getAsDouble();
        System.out.println(result);
    }
}
