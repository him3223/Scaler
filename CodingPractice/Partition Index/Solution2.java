import java.util.Arrays;
public class Solution2 {
    public static int partition(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len-2;
        int pivot = arr[len-1];
        int temp;
        while (left<=right) {
            while(left<=right && arr[left]<pivot)
                left++;
            while(left<=right && arr[right]>pivot)
                right--;
            if(left<=right) {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {6,0,2,4,5};
        System.out.println(partition(arr)); 
    }
}