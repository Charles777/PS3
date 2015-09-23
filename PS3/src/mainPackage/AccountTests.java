package mainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AccountTests {

	Account c;

	@Before
	public void setUp() throws Exception {
	c = new Account(1122, 20000);
	c.setAnnualInterestRate(.045);
	
	
	}

	@After
	public void tearDown() throws Exception {
	c = null;
	}
	
	
	@Test
	public final void testStandard() throws InsufficientFundsException{
		c.withdraw(2500);
		c.deposit(3000);
		System.out.println("Account Number: " + c.getId());
		System.out.println("Balance: $" + c.getBalance());
		System.out.println("Interest Rate: " + c.getAnnualInterestRate());
		System.out.println("Monthly Interest: $" + c.getBalance()*c.getAnnualInterestRate()/12);
		System.out.println("Date Created: " + c.getDateCreated());
	}
	
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		c.setBalance(0);
		c.deposit(500.00);
		assertEquals("deposit failed",(long)c.getBalance(),(long)500.00);
        c.withdraw(900);
	}

	@Test
	public final void testDeposit() {
		int x = 0;
		double initial = c.getBalance();
		while (x < 20) {
			c.deposit(10000);
			x++;
		}
		assertEquals("deposits failed",(long)c.getBalance(),(long)(initial + (20 * 10000)));
		
	}

}
