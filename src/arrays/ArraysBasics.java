package arrays;

public class ArraysBasics {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nMaximum Element: " + findMax(numbers));
    }

    public static int findMax(int[] arr) {

        int max = arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}