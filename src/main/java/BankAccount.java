
public class BankAccount {
private String Name;
private String PhoneNumber;
private int AccountNumber;
private int AccountBalance;
private String DateCreated;
	public BankAccount() {
		setName("");
		setPhoneNumber("");
		setDateCreated("");
		AccountNumber = -1;
		AccountBalance = -1; 
		
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getDateCreated() {
		return DateCreated;
	}
	public void setDateCreated(String dateCreated) {
		DateCreated = dateCreated;
	}
	//MAKE DEPOSIT
	public void makeDeposit(int Amount) {
		AccountBalance += Amount;
	}
	//MAKE WITHDRAWAL
	public void makeWithdrawal(int Amount) {
		AccountBalance -= Amount;
	}
	public void transferAmount() {
		
	}
	public int calculateZakat(int sum) {
	
		
			int Zakat = (sum*2)/100;
			System.out.println("Zakat Amount is " + Zakat);
			return Zakat;
		
	}
	public void displayAllDeductions() {
		
	}

}
