import static java.lang.System.out;

public class Account {
	private String name;
	private String address;
	private double balance;
	public void display() {
		 out.print(name);
		 out.print(" (");
		 out.print(address);
		 out.print(") has $");
		 out.print(balance);
		 }
	//Returns interest rate 
	public double getInterest(double percentageRate) {
		 return balance * percentageRate / 100.00;
		 }
	public void setName(String n) {
		if (!n.equals("")) {
			 name = n;
			 }
		 }
		 public String getName() {
		 return name;
		 }
		 public void setAddress(String a) {
		 address = a;
		 }
		 public String getAddress() {
		 return address;
		 }
		 public void setBalance(double b) {
		 balance = b;
		 }
		 public double getBalance() {
		 return balance;
		 }
}
