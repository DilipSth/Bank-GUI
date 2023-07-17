/**
 * This code defines a class called "CreditCard" that extends from the "BankCard" class. The CreditCard class has several attributes such as 
 * cvcNumber, creditLimit, interestRate, expirationDate, gracePeriod, and isGranted. It also has a constructor that accepts eight parameters and 
 * uses the "super" keyword to call the constructor of the parent class and set the values of the balanceAmount, cardID, bankAccount, and 
 * issuerBank attributes. It also has a setClientName() method inherited from the parent class which is used to set the value of the clientName 
 * attribute. The class also includes six getter methods (getCvcNumber(), getCreditLimit(), getInterestRate(), getExpirationDate(), gracePeriod(),
 * getIsGranted()) that return the values of the corresponding attributes. It also has a setCreditLimit() method which assigns the values of 
 * creditLimit and gracePeriod if creditLimit is less than or equal to 2.5*balanceAmount. It also has a cancelCreditCard() method which cancels 
 * the credit card if certain conditions are met, and a display() method that displays the output if the isGranted attribute is true.
 *
 * @author (22067670 Dilip Shrestha)
 * @version (5.1.0a)
 */
public class CreditCard extends BankCard
{
    private int cvcNumber;
    private double creditLimit;  
    private double interestRate;
    private String expirationDate ;             //This are the attributes of Credit Card
    private int gracePeriod;
    private boolean isGranted;
    
    /*
     * This is a constructor which accept eight parameter
     */
    public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, 
    double interestRate, String expirationDate)  
    {
        super(balanceAmount,cardID,bankAccount,issuerBank);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
        //Getter Methods
        /*
         * There are six getter method: getCvcNumber(), getCreditLimit(), getInterestRate(), getExpirationDate(), gracePeriod(), getIsGranted() 
         * which return the followig attributes 
         */
    public int getCvcNumber() 
    {
        return this.cvcNumber;  //This is a getter method that return the value of cvcNumber
    }
    public double getCreditLimit() 
    {
        return this.creditLimit;    //This is a getter method that return the value of creditLimit
    }
    public double getInterestRate() 
    {
        return this.interestRate;   //This is a getter method that return the value of intrestRate
    }
    public String getExpirationDate() 
    {
        return this.expirationDate; //This is a getter method that return the value of expirationDate
    }
    public int gracePeriod() 
    {
        return this.gracePeriod;    //This is a getter method that return the value of gracePeriod
    }
    public boolean getIsGranted() 
    {
        return this.isGranted;  //This is a getter method that return value of isGranted
    }
        //Setter Methods
    public void setCreditLimit (double creditLimit, int gracePeriod)
    //This is a setter method which assign the value of creditLimit and gracePeriod
    {
        if (creditLimit <= (2.5*super.getBalanceAmount())) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        }
        else {
            System.out.println("Your credit cannot be issued.");
        }
    }
    public void cancelCreditCard() //This is a method for cancelling the creditCard if the given values meet the following condition
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Your Credit Card is not Granted");
    }
    public void display()       //This is a method which doesn't return but display the output if the isGranted is true 
    {
        if(isGranted = true) {
            super.display();
            System.out.println("Your Credit Limit is: " + this.creditLimit);
            System.out.println("Your Grace Period is: " + this.gracePeriod);
            System.out.println("Your Card: " + this.isGranted);
        }
        else {
            super.display();
            System.out.println("Your CVC Number is: " + this.cvcNumber);
            System.out.println("Your Intrest rate is: " + this.interestRate);
            System.out.println("Your Card expiry date is: " + this.expirationDate);
            System.out.println("Your Card is not Granted");
        }
    }
}