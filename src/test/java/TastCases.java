import static org.junit.Assert.*;

import org.junit.Test;

public class TastCases {

	@Test
	public void test1() {
		Customer C = new Customer();
		C.setName("Salar");
		assertEquals(C.getName(),"Salar");
	}
	@Test
	public void test2() {
		Customer C = new Customer();
		C.setPhoneNumber("051 9506781");
		assertEquals(C.getPhoneNumber(),"051 9506781");
	}
	@Test
	public void test3() {
		Customer C = new Customer();
		C.setAddress("F10");
		assertEquals(C.getAddress(),"F10");
	}
	@Test
	public void test4() {
		Customer C = new Customer();
		C.setAccountNumber(123123);
		assertEquals(C.getAccountNumber(),123123);
	}
	@Test
	public void test5() {
		BankAccount B = new BankAccount();
		B.setAccountBalance(500);
		assertEquals(B.getAccountBalance(),500);
	}
	
	@Test
	public void test6() {
		BankAccount B = new BankAccount();
		B.setName("Daniel");
		assertEquals(B.getName(),"Daniel");
	}
	@Test
	public void test7() {
		BankAccount B = new BankAccount();
		B.setAccountNumber(500);
		assertEquals(B.getAccountNumber(),500);
		
	}	
	@SuppressWarnings("deprecation")
	@Test
	public void test8() {
		BankAccount B = new BankAccount();
		int Ans = B.calculateZakat(100000);
		assertEquals(Ans,2000);
	}
	@Test
	public void test9() {
		CheckingsAccount C = new CheckingsAccount();
		C.setAccountBalance(5000);
		C.makeWithdrawal(1000);
		assertEquals(4000,C.getAccountBalance());
	}
	@Test
	public void test10() {
		SavingsAccount S = new SavingsAccount();
		S.setInterestRate(2);
		assertEquals(2,S.getInterestRate(),0.001);
	}
	@Test
	public void test11() {
		SavingsAccount S = new SavingsAccount();
		S.setAccountBalance(1000);
		S.makeWithdrawal(500);
		assertEquals(500,S.getAccountBalance());
	}
	@Test
	public void test12() {
		SavingsAccount S = new SavingsAccount();
		S.setAccountBalance(100);
		S.setInterestRate(2);
		double ans = S.calculateInterest();
		assertEquals(200,ans,0.001);
		
	}
	@Test
	public void test13() {
		BankAccount B = new BankAccount();
		B.setAccountBalance(0);
		B.makeDeposit(10);
		assertEquals(10,B.getAccountBalance());
	}
	@Test
	public void test14() {
		BankAccount B = new BankAccount();
		B.setAccountBalance(10);
		B.makeWithdrawal(10);
		assertEquals(0,B.getAccountBalance());
	}
	@Test
	public void test15() {
		BankAccount B = new BankAccount();
		B.setDateCreated("Monday");
		assertEquals("Monday",B.getDateCreated());
	}
	@Test
	public void test16() {
		BankAccount B = new BankAccount();
		B.setPhoneNumber("Monday");
		assertEquals("Monday",B.getPhoneNumber());
	}
   
}
