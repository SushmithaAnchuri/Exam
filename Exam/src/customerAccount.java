import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class customerAccount implements BankServices {

	public String name;
	public String mailId;
	public long mobileNo;
	public String accountType;
	public double balance;
	public int accNo;
	
	int accNo1 = ThreadLocalRandom.current().nextInt(); 
	public customerAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customerAccount(String name, String mailId, int mobileNo, String accountType, double balance) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
		this.accountType = accountType;
		this.balance = balance;
		this.accNo=accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int accountNumber()
	{
		Random r=new Random();
		int accNo=r.nextInt();
		return accNo;
	}
	
	@Override
	public double deposits(double amount) {
		this.balance+=amount;
		return this.balance;
	}
	@Override
	public double withdraw(double amount) throws Exception {
		if (this.balance - amount <= 0) {
			throw new Exception("Insufficient funds to carry transaction # "+accNo);
					} else {
						this.balance -= amount;
					}
					return this.balance;
	}	
	
	@Override
	public double balanceEnquiry(double amount) {
		return this.balance;
	}
	
}
