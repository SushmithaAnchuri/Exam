import java.util.concurrent.ThreadLocalRandom;

public class KotakBank {

	public static void main(String[] args) {
		
		int accNo = ThreadLocalRandom.current().nextInt();   
	    int accNo1 = ThreadLocalRandom.current().nextInt();
		customerAccount c1=new customerAccount("Harshu","abc@gmail.com",536782997,"savings",10000.0);
		customerAccount c2=new customerAccount("Harshu","janu24@gmail.com",736782997,"saving",20000.0);
		customerAccount c3=new customerAccount("Harshu","anu13@gmail.com",676782997,"savings",30000.0);
		customerAccount c4=new customerAccount("Harshu","cde@gmail.com",986782997,"saving",40000.0);
		
		BankServices bank=c1;
		double result=c1.deposits(5000);
		System.out.println(result);
		
		bank=c2;
		System.out.println(result);
		try {
			result = c2.withdraw(3000);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		c1.getBalance();
		c2.getAccountType();
		System.out.println(c1);
		System.out.println(c2);
	}

}
