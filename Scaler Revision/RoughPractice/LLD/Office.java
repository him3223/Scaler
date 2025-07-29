import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Company {
	int salary;
	String culture;
	String domain;
	String HQ;
	String companyName;
	public int getSalary() {return salary;}
	public String getCulture() {return culture;}
	public String getDomain() {return HQ;}
	public String getCompanyName() {return companyName;}
	public Company(int salary, String culture, String domain, String HQ, String companyName) {
		this.salary=salary;
		this.culture=culture;
		this.domain=domain;
		this.HQ=HQ;
		this.companyName=companyName;
	}
	@Override
	public String toString() {
		return companyName + " " + domain + " " + HQ + " " + salary + " " + culture;
	}
}

public class Office {
	public static void main(String[] args) {
		List<Company> office = Arrays.asList(
			new Company(2100000,"Work Life Balance","O.S","Hyderabad","MicroSoft"),
			new Company(200000,"Toxic","Banking","Mumbai","AurionPro"),
			new Company(420000,"Working","BPO","Delhi","Genpact"),
			new Company(350000,"Toxic","Map","Mumbai","T.C.S"),
			new Company(4000000,"Work Life Balance","Search Enginee","Hyderabad","Google"),
			new Company(5000000,"Good","Electronics","Gurgaon","Samsung")
		);

		// office.stream().filter(e -> e.getSalary() < 1000000).forEach(System.out::println);
		// office.stream().filter(e -> e.getCulture().equals("Work Life Balance")).forEach(System.out::println);
	}
}