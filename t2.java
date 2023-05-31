import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {20, 20, 30, 40, 50, 50, 50};
        int newLength = removeDuplicates(nums);

        System.out.println("Updated array length: " + newLength);
        
        System.out.println("        Updated array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
