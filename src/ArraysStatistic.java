import java.util.Scanner;

public class ArraysStatistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи кол элементов массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введи элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scanner.close();
    }
}

