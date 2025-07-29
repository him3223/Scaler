import java.util.*;
public class OtherPractice {
	public static void main(String[] args) {
		List<Integer> nums = List.of(98,7,2,34,19,2,2,3,3,3,6);
		// nums.stream().sorted().forEach(System.out::println);
		// nums.stream().distinct().forEach(System.out::println);
		long count = nums.stream().distinct().count();
		System.out.println(count);
	}
}