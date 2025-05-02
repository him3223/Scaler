import java.util.ArrayList;
public class Solution5 {
    static ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
    static ArrayList<Integer> move;
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        solveHanoi(A,1,2,3,moves);
        return moves;
    }
    public static void solveHanoi(int disk, int start, int aux, int des, ArrayList<ArrayList<Integer>> moves) {
        if (disk==1) {
            move= new ArrayList<>();
            move.add(disk);
            move.add(start);
            move.add(des);
            moves.add(move);
            return;
        }
        solveHanoi(disk-1,start,des,aux,moves);
        move= new ArrayList<>();
        move.add(disk);
        move.add(start);
        move.add(des);
        moves.add(move);
        solveHanoi(disk-1,aux,start,des,moves);
    }
    public static void main(String[] args) {
        int numDisks = 3;
        System.out.println(towerOfHanoi(numDisks));
    }
}
