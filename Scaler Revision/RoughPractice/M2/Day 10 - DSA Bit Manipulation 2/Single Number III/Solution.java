import java.util.*;
public class Solution {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int len = A.size();
    	int xor = 0;
    	for (int a=0; a<len; a++) {
    		xor^=A.get(a);
    	}
    	int setbit = xor & -xor;
    	int x=0;
    	int y=0;
    	for (int a=0; a<len; a++) {
    		int num = A.get(a);
    		if ((num & setbit) !=0) x^=num;
    		else y^=num;
    	}
    	result.add(x);
    	result.add(y);
    	Collections.sort(result);
    	return result;
    }
	public static void main(String[] args) {
    	Integer[] arr = new Integer[] {5,6,7,3,2,5,6,7};
    	// Integer[] arr = new Integer[] {1,2,3,1,2,4};
    	ArrayList<Integer> A  = new ArrayList<>(Arrays.asList(arr));
    	System.out.println(solve(A));
	}

}