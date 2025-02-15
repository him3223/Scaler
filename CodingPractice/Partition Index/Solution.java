import java.util.Arrays;
public class Solution {
        public static int partition(int[] arr) {
        int len = arr.length;
        int pivot = arr[len-1]; // pivot is the last element
        int left = 0;  // start from the beginning
        int right = len - 2; // right pointer just before the pivot
        int temp;
    
        while (left <= right) {
            // Move left pointer to the right while the element is less than the pivot
            while (left <= right && arr[left] < pivot) {
                left++;
            }
        
            // Move right pointer to the left while the element is greater than the pivot
            while (left <= right && arr[right] > pivot) {
                right--;
            }
        
            if (left <= right) {
                // Swap the elements at left and right
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    
        // After partitioning, place the pivot in the correct position
        temp = arr[left];
        arr[left] = arr[len-1];
        arr[len-1] = temp;
    
        return left; // Return the index where the pivot is placed
    }
    public static void main(String[] args) {
        int[] arr = {6,0,2,4,5};
        System.out.println(partition(arr)); 
    }
}