public class bitMan {
	public static void main(String[] args) {
		System.out.println(getBit(5,2));
		System.out.println(setBit(5,1));
		System.out.println(clearBit(5,2));
	}
	public static boolean getBit(int num, int pos) {
		return ((1<<pos) & num) !=0;
	}
	public static int setBit(int num, int pos) {
		return ((1<<pos) | num);
	}
	public static int clearBit(int num, int pos) {
		return (~(1<<pos) & num);
	}
}