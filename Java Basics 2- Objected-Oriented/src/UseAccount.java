import static java.lang.System.out;

public class UseAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Basic use of Objected generate from class Account
		
		// Account myAccount;
		// Account yourAccount;
		 Account myAccount = new Account();
		 Account yourAccount = new Account();
		 //Using accesor methods
		 myAccount.setName("Barry Burd");
		 myAccount.setAddress("222 Cyberspace Lane");
		 myAccount.setBalance(24.02);
		 yourAccount.setName("Jane Q. Public");
		 yourAccount.setAddress("111 Consumer Street");
		 yourAccount.setBalance(55.63);
		 out.print(myAccount.getName());
		 out.print(" (");
		 out.print(myAccount.getAddress());
		 out.print(") has $");
		 out.print(myAccount.getBalance());
		 out.println();
		 out.print(yourAccount.getName());
		 out.print(" (");
		 out.print(yourAccount.getAddress());
		 out.print(") has $");
		 out.print(yourAccount.getBalance());
		 //Using getInterest method and quick note on font***
		 /*
		 myAccount.name = "Barry Burd";
		 myAccount.address = "222 Cyberspace Lane";
		 myAccount.balance = 24.02;
		 yourAccount.name = "Jane Q. Public";
		 yourAccount.address = "111 Consumer Street";
		 yourAccount.balance = 55.63;
		 //Calling method from Account.java
		 myAccount.display();
		 out.print(" plus $");
		 out.print(myAccount.getInterest(5.00));
		 out.println(" interest ");
		 
		 yourAccount.display();
		 //Calling method from Account.java
		 double yourInterestRate = 5.00;
		 out.print(" plus $");
		 double yourInterestAmount =
		 yourAccount.getInterest(yourInterestRate);
		 out.print(yourInterestAmount);
		 out.println(" interest ");
		 double myInterest = myAccount.getInterest(5.00);
		 out.printf("$%6.2f\n", myInterest);
		 out.printf("$%5.2f\n", myInterest);
		 out.printf("$%.2f\n", myInterest);
		 out.printf("$%3.2f\n", myInterest);
		 out.printf("$%.3f $%.2f",
		 myInterest, yourInterestAmount);
		 */
		 
		 
		 /*
		 out.print(myAccount.name);
		 out.print(" (");
		 out.print(myAccount.address);
		 out.print(") has $");
		 out.print(myAccount.balance);
		 out.println();
		 out.print(yourAccount.name);
		 out.print(" (");
		 out.print(yourAccount.address);
		 out.print(") has $");
		 out.print(yourAccount.balance);
		 */
	}

}
