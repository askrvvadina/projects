import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 18, 9};

        int total = 0;
        for (int num : arr) {
            total += num;
        }
        System.out.println("Sum: " + total);

        double avg = (double) total / arr.length;
        System.out.println("Average: " + avg);

        int smallest = Arrays.stream(arr).min().getAsInt();
        System.out.println("Smallest: " + smallest);

        int largest = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest: " + largest);
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void runner(String[] args) {
        String word = "ata";
        int number = 12321;

        System.out.println("Word Palindrome: " + isPalindrome(word));

        System.out.println("Number Palindrome: " + isPalindrome(String.valueOf(number)));
    }
}