public class Solution {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        getIndex(A,A.size()-1,B,ans);
        Collections.sort(ans);
        return ans;
    }
    public void getIndex(ArrayList<Integer> A, int e, int B,ArrayList<Integer> ans){
        if (e==-1) {
            return;
        }
        getIndex(A,e-1,B,ans);
        if (A.get(e)==B) {
            ans.add(e);
        }
    }
    // public static void main(String[] args) {
    //     ArrayList<Integer> A = new ArrayList<Integer>(new int[] {8, 9, 5, 6, 5, 5});
    //     int B = 5;
    //     System.out.println(allIndices(A,B));
    // }
}
