import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Biscuit {
	private String name;
	private String type;
	private int price;
	public String getName() {return name;}
	public String getType() {return type;}
	public int getPrice() {return price;}
	public Biscuit(String name, String type, int price) {
		this.name=name;
		this.type=type;
		this.price=price;
	}
	@Override
	public String toString() {
		return name +" " + type +" "+ price;
	}
}

public class MyPractice {
	public static void main(String[] args) {
		List<Biscuit> bis = Arrays.asList(
			new Biscuit("Parle","Sweet",10),
			new Biscuit("Burbon","Cream Sweet",10),
			new Biscuit("50-50","Namkeen",10),
			new Biscuit("Sunfeast","Sweet",10),
			new Biscuit("Snacks","Namkeen",10)
		);

		bis.stream().filter(e -> e.getType().equals("Sweet")).forEach(System.out::println);
	}
}