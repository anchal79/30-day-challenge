
import java.util.*;
public class ans {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println("Missing number: " + findMissingNumber(arr, n)); // Output: 3
    }
}
