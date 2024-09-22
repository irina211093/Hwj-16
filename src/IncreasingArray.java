import java.util.Random;

public class IncreasingArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(89) + 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }
        if (isStrictlyIncreasing) {
            System.out.println("The sequence is increasing!");
        } else {
            System.out.println("The sequence is not increasing!");
        }

    }
}
