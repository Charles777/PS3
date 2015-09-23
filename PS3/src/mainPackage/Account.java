package mainPackage;
import java.util.Date;

/**
 * @author Owner
 *
 */
public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	/**
	 * No arg constructor defaults to an id and balance of 0. 
	 * The date is still accurate.
	 */
	public Account(){
		
		dateCreated = new Date();

	}
	
	/**
	 * Passing an id and balance allows them to be assigned on initial construction. 
	 * The date is recorded automatically.
	 * @param idin
	 * @param balancein
	 */
	public Account(int idin, double balancein){
		id = idin;
		balance = balancein;
		dateCreated = new Date();	
		
	}
	
	/**
	 * @return this.id
	 */
	public int getId(){
		return this.id;
		
	}
	
	/**
	 * @param idin
	 */
	public void setId(int idin){
		this.id = idin;
		
	}
	
	/**
	 * @param a
	 * @return a.id
	 */
	public static int getId(Account a){
		return a.id;
		
	}
	
	/**
	 * @param a
	 * @param idin
	 */
	public static void setId(Account a, int idin){
		a.id = idin;
		
	}
	
	/**
	 * @return id
	 */
	public double getBalance(){
		return this.balance;
		
	}
	
	/**
	 * @param bal
	 */
	public void setBalance(double bal){
		this.balance = bal;
		
	}
	
	/**
	 * @param a
	 * @return a.balance
	 */
	public static double getBalance(Account a){
		return a.balance;
		
	}
	
	/**
	 * @param a
	 * @param bal
	 */
	public static void setBalance(Account a, double bal){
		a.balance = bal;
		
	}
	
	/**
	 * @return a.annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
		
	}
	
	/**
	 * @param air
	 */
	public void setAnnualInterestRate(double air){
		this.annualInterestRate = air;
		
	}
	
	/**
	 * @param a
	 * @return a.annualInterestRate
	 */
	public static double getAnnualInterestRate(Account a){
		return a.annualInterestRate;
		
	}
	
	/**
	 * @param a
	 * @param air
	 */
	public static void setAnnualInterestRate(Account a, double air){
		a.annualInterestRate = air;
		
	}
	
	/**
	 * @return this.dateCreated
	 */
	public Date getDateCreated(){
		return this.dateCreated;
		
	}
	
	/**
	 * @param a
	 * @return a.dateCreated
	 */
	public static Date getDateCreated(Account a){
		return a.dateCreated;
		
	}
	

	/**
	 * Calculates the monthly interest rate from the annual rate
	 * @return mir the monthly interest rate
	 */
	public double getMonthlyInterestRate(){
		double mir = this.getAnnualInterestRate()/12;
		return mir;
		
	}
	
	/**
	 * @param a
	 * @return mir the monthly interest rate
	 */
	public static double getMonthlyInterestRate(Account a){
		double mir = a.getAnnualInterestRate()/12;
		return mir;
		
	}
	
	/**
	 * Subtracts the given amount from the account balance.
	 * @param amount
	 */
	public void withdraw(double amount) throws InsufficientFundsException 
	{
	      if(amount <= this.balance)
	      {
	    	  this.balance = this.balance - amount;
	      }
	      else
	      {
	         double needs = amount - this.balance;
	         throw new InsufficientFundsException(needs);
	      }
	}
	
	/**
	 * Subtracts the given amount from the account balance.
	 * @param a
	 * @param amount
	 */
	public static void withdraw(Account a, double amount) throws InsufficientFundsException
	{
	      if(amount <= a.balance)
	      {
	    	  a.balance = a.balance - amount;
	      }
	      else
	      {
	         double needs = amount - a.balance;
	         throw new InsufficientFundsException(needs);
	      }
		
	}
	
	/**
	 * Adds the given amount to the account balance.
	 * @param amount
	 */
	public void deposit(double amount){
		this.balance = this.balance + amount;
		
	}
	
	/**
	 * Adds the given amount to the account balance.
	 * @param a
	 * @param amount
	 */
	public static void deposit(Account a, double amount){
		a.balance = a.balance + amount;
		
	}
	
	
	
	
	
}
