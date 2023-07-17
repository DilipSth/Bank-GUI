/**
 * This code defines a class called "DebitCard" that extends from the "BankCard" class. The DebitCard class has several attributes such as 
 * pinNumber, withdrawalAmount, dateOfWithdrawal, and hasWithdrawn. It also has a constructor that accepts six parameters and uses the "super" 
 * keyword to call the constructor of the parent class and set the values of the balanceAmount, cardID, bankAccount, and issuerBank attributes. 
 * It also has a setClientName() method inherited from the parent class which is used to set the value of the clientName attribute. The class 
 * also includes four getter methods (getPinNumber(), getWithdrawalAmount(), getDateOfWithdrawal(), getHasWithdrawn()) that return the values of 
 * the corresponding attributes. It also has a setWithdrawalAmount() method which assigns the value of withdrawalAmount. It also has a withdraw() 
 * method that checks the pinNumber, withdrawalAmount, and balanceAmount and withdraws the money if the conditions are met otherwise it will print 
 * "You have entered wrong pin number or there is no sufficient balance" It also has a display() method that displays the output if the 
 * hasWithdrawn attribute is true, it will display the withdrawal amount, date of withdrawal, pin number otherwise it will display the balance 
 * amount.
 *
 * @author (22067670 Dilip Shrestha)
 * @version (5.1.0a)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;        //This are the attributes of Debit Card
    private boolean hasWithdrawn;

    public DebitCard(double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {
        super(balanceAmount,cardID,bankAccount,issuerBank); //Calls the constructer of super class
        super.setClientName(clientName);  
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
        //Getter Method
        /*  
         * There are four getter methods: getWithdrawalAmount(), getWithdrawalAmount(), getDateOfWithdrawal(), getHasWithdrawn() which return 
         * the followig attributes
         */
    public int getPinNumber() 
    {
        return pinNumber;   //This is a getter method that return the value of pinNumber
    }
    public int getWithdrawalAmount() 
    {
        return withdrawalAmount;    //This is a getter method that the value of withdrawalAmount
    }
    public String getDateOfWithdrawal() 
    {
        return dateOfWithdrawal;    //This is a getter method that the value of dateOfWithdrawal
    }
    public boolean getHasWithdrawn() 
    {
        return hasWithdrawn;    //This is a getter method that return the value of hasWithdrawn
    }
        //Setter Method
    public void setWithdrawalAmount(int withdrawalAmount) {     //This is a setter method which assign the value of withdrawalAmount
        this.withdrawalAmount = withdrawalAmount;
    }
    //Method to withdraw money from card
    public void Withdraw(int withdrawalAmount, String dateOfWithdrawal,int pinNumber)   
    /*
     * This is a method which checks the three parameter: withdrawalAmount, dateOfWithdrawal and pinNumber and 
     * if the pinNumber, withdrawalAmount and BalanceAmount meet the following condition it will withdraw the money
     */
    {
        if (this.pinNumber == pinNumber && this.withdrawalAmount <= super.getBalanceAmount()) {
            super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
        }
        else {
            System.out.println("You have entered wrong pin number or there is no sufficient balance");
        }
    }
    public void display() { //This is a method which doesn't return but display the output
        super.display(); 
        /*
         * It calls the display() method of parent class and if the condition hasWithdraw is true and 
         * then it will display the following thing
         */
        if (hasWithdrawn == true) {
            System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
            System.out.println("Date Of Withdrawal: " + this.dateOfWithdrawal);
            System.out.println("Pin Number: " + this.pinNumber);
        }
        else {
            System.out.println("Balance Amount :" + super.getBalanceAmount());
        }
    }
}