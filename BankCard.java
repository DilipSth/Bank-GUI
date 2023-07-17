/**
 * This code defines a class called "BankCard" that has several attributes such as cardID, clientName, issuerBank, bankAccount, and balanceAmount.
 * It also has a constructor that accepts four parameters and assigns the values of the balanceAmount, cardID, bankAccount, and issuerBank 
 * attributes. The class also includes five getter methods (getCardID(), getClintName(), getIssuerBank(), getBankAccount(), getBalanceAmount()) 
 * that return the values of the corresponding attributes. It also has two setter methods setClientName() which assigns the value of clientName, 
 * setBalanceAmount() which assigns the value of balanceAmount. It also has a display() method that displays the output if the clientName is not 
 * assigned it will print "Client name not assigned" otherwise it will display the card ID, client name, issuer bank, bank account, and balance 
 * amount.
 *
 * @author (22067670 Dilip Shrestha)
 * @version (5.1.0a)
 */
public class BankCard
{
    private int cardID; 
    private String clientName;
    private String issuerBank;          //This are the attributes of Bank Card
    private String bankAccount;
    private double balanceAmount;
    
    public BankCard(double balanceAmount, int cardID, String bankAccount, String issuerBank)
    {
        this.cardID = cardID;
        this.clientName = "";
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
    }
        //Getter Methos
    public int getCardID()
    {
        return cardID;  //This is a getter method that return the value of cardID
    }
    public String getClintName()
    {
        return clientName;  //This is a getter method that return the value of clintName
    }
    public String getIssuerBank()
    {
        return issuerBank;  //This is a getter method that return the value of issuerBank
    }
    public String getBankAccount()
    {
        return bankAccount; //This is a getter method that return the value of bankAccount
    }
    public double getBalanceAmount()
    {
        return this.balanceAmount;     //This is a getter method that return the value of balanceAmout
    }
    //Setter Methos
    public void setClientName(String clientName)    //This is a setter method which assign the value of clintName
    {
        this.clientName = clientName;
    }
    public void setBalanceAmount(double balanceAmount)  //This is a setter method which assign the value of balanceAmount
    {
        this.balanceAmount = balanceAmount;
    }
    public void display(){  //This is a method which doesn't return but display the following outputs
        if (clientName == "") { 
            System.out.println("Clint name not assigned");
        }
        
        else {
            System.out.println("Card ID:" + this.cardID);
            System.out.println("Client name: " + this.clientName);
            System.out.println("Issuer bank: " + this.issuerBank);
            System.out.println("Bank account: " + this.bankAccount);
            System.out.println("Balance amount: " + this.balanceAmount);
        }
    }
}