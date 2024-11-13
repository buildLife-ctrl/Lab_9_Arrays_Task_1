import java.util.Random;

public class DataStatistics {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = 0;
        int sum = 0;
        int average;
        int max;
        int min;

        //prints the random values assigned
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            value += 1;
            num[i] = rand.nextInt(101);
            System.out.println("Value " + value + " | " + num[i]);
            sum += num[i];
        }

        //calculates
        average = sum / 100;
        max = num[0];
        min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        //prints out the calculated stuff
        System.out.println();
        System.out.printf("%-10s %3d", "Sum:", sum);
        System.out.printf("\n%-10s %3d", "Average:", average);
        System.out.printf("\n%-10s %3d", "Maximum:", max);
        System.out.printf("\n%-10s %3d", "Minimum:", min);
    }
}
