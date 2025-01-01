import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class CountPairSum {
    public static int solve(int A, ArrayList<Integer> B) {
        int len = B.size();
        int ans =0;
        int mod = 1000000007;
        int part =0;
        int num =0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int a=0;a<len ;a++ ) {
            num=B.get(a);
            part = A-num;
            if(hm.containsKey(part))
                ans+=hm.get(part);
            if(hm.containsKey(num))
                hm.put(num,hm.get(num)+1);
            else
                hm.put(num, 1);
        }
        return ans%mod;
    }
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2, 1, 2));
        int A =3;
        System.out.println(solve(A,B));
    }
}