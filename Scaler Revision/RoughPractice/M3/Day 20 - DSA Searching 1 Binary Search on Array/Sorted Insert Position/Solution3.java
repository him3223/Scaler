public class Solution3 {
    public static int searchInsert(int[] A, int B) {
        int len = A.length;
        int l = 0;
        int r = len-1;
        int mid = 0;
        while (l<r) {
            mid = (l+r)/2;
            if (A[mid]==B) return mid;
            if (A[mid]<B) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        int B = 5;
        System.out.println(searchInsert(A,B));
    }
}
