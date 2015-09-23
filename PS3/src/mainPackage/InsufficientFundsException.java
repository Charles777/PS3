package mainPackage;

public class InsufficientFundsException extends Exception
{
   /**
	 * 
	 */
	private static final long serialVersionUID = -2973071757403054772L;
private double amount;
   /**
    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
    * @param amount
    */
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
   
   
}