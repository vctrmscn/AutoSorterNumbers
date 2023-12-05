import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the number's array to sort (3-500)");
            int size = input.nextInt();
            if (size > 500 || size < 3) {
                System.out.println("Please put your number inside the range of 3-500");
            } else {
                int[] numbers = new int[size];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = rand.nextInt(5000);
                }
                System.out.println(Arrays.toString(numbers));
                System.out.println("Here's your raw Array:");
                long timeStart = System.currentTimeMillis();
                sortNumbers(numbers);
                System.out.println("Here's your array after being sorted:");
                long timeEnd = System.currentTimeMillis();
                System.out.println(Arrays.toString(numbers));
                System.out.println("It took " + (timeEnd - timeStart) + "ms.");
                break;
            }
        }
    }
    public static void sortNumbers (int[] numbers) {
        for(int i = 0; i < numbers.length -1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tempI = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tempI;
                }
            }
        }
    }
}
