import java.util.*;
public class Solution5 {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int xor = 0;
    	int x = 0;
    	int y = 0;
    	int num = 0;
    	int len = A.size();
    	for (int a=0; a<len; a++) {
    		xor^=A.get(a);
    	}
    	int setbit = xor & -xor;
    	for (int a=0; a<len; a++) {
    		num = A.get(a);
    		if ((num & setbit) != 0) x^=num;
    		else y^=num;
    	}
    	result.add(x);
    	result.add(y);
    	return result;
    }
	public static void main(String[] args) {
    	// Integer[] arr = new Integer[] {5,6,7,3,2,5,6,7};
    	Integer[] arr = new Integer[] {1, 2, 3, 1, 2, 4};
    	ArrayList<Integer> A  = new ArrayList<>(Arrays.asList(arr));
    	System.out.println(solve(A));
	}

}