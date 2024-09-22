import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(49) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Модифицированный массив:");
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

