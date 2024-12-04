public class CountFactor5{
	public static void main(String[] args) {
		int count = 0;
		int num = 1000;
		int sqrt = (int)Math.sqrt(num);
		for (int a=1; a<=sqrt; a++) {
			if (num%a==0) {
				if (a!=num/a) {
					count++;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}