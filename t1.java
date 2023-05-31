import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort {
    
    public static void alternateSort(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        int[] result = new int[n];
        int left = 0; 
        int right = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right]; 
                right--;
            } else {
                result[i] = arr[left]; 
                left++;
            }
        }
        System.arraycopy(result, 0, arr, 0, n);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " positive integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        alternateSort(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
