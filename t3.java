import java.util.Scanner;

public class ArrayDifference {
    public static int getDifference(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        if (length < 1) {
            System.out.println("Array length must be at least 1.");
            return;
        }

        int[] nums = new int[length];
        System.out.println("Enter " + length + " integers:");

        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        int difference = getDifference(nums);

        System.out.println("Difference between largest and smallest values: " + difference);
    }
}
