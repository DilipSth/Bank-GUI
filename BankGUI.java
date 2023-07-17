/**
 * Write a description of class registration_form here.
 *
 * @author (22067670 Dilip Shrestha)
 * @version (5.1.0a)
 */
import javax.swing.*;
import java.util.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    //  Declaring all the components
    ArrayList<BankCard> bCards = new ArrayList<BankCard>();
    private JFrame frame;
    private JPanel panel;
    private JPanel panel1;

    //  Components for Debit Card
    private JLabel title, issuerBank, l_CardID, clientName, withdrawalAmount, dateOfWithdrawal, bankAccount, balanceAmount, pinNumber, pinNumberD,cardID_D,cardID_C;
    private JTextField issuerBank1, cardID, clientName1, withdrawalAmount1, dateOfWithdrawal1, bankAccount1, balanceAmount1, pinNumber1, pinNumberDC, cardID_DC,cardID_CC;
    private JButton addDebit, clear, display, withdraw;
    private JComboBox d_Day, m_Month, y_Year;

    //  Components for Credit Card
    private JLabel creditCard, issuerBank2, cvcNumber, clientName3, interestRate, cardID1, bankAccount2, balanceAmount2, expirationDate,
    creditLimit, gracePeriod;
    private JTextField issuerBank3, cvcNumber1, clientName4, interestRate1, cardID2, bankAccount3, balanceAmount3, creditLimit1, gracePeriod1;  
    private JButton cancelCard, addCreditCard, setCreditLimit, clear1, display1;   
    private JComboBox d_Day1, m_Month1, y_Year1;

    public BankGUI(){
        //  Changing the font 
        Font  h1  = new Font("Times New Roman",Font.BOLD,20);
        Font  h2  = new Font("Times New Roman",Font.BOLD,15);

        //  Jframe
        frame = new JFrame("Bank GUI");
        frame.setLayout(null);
        frame.setBounds(50,35,900,900);

        //  Start of the 1 JPanel
        //  Declaring the Debit Card componets

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,50,803,379);
        panel.setBackground(new Color(255,227,174));
        //  Frame 1 Visible
        frame.add(panel);

        //  Title of the Frame
        title = new JLabel();
        title.setText("Dilip Bank");
        title.setBounds(403,10,250,20);
        title.setFont(h1);
        frame.add(title);

        //  Issuer Bank
        issuerBank = new JLabel("Issuer Bank");
        issuerBank.setBounds(50,45,78,20);
        issuerBank.setFont(h2);
        panel.add(issuerBank);

        issuerBank1 = new JTextField();
        issuerBank1.setBounds(150,45,150,20);
        panel.add(issuerBank1);

        //  Card ID
        l_CardID = new JLabel("Card ID");
        l_CardID.setBounds(60,80,60,20);
        l_CardID.setFont(h2);
        panel.add(l_CardID);

        cardID = new JTextField();
        cardID.setBounds(150,80,150,20);
        panel.add(cardID);

        //  Client Name
        clientName = new JLabel("Client Name");
        clientName.setBounds(48,115,90,20);
        clientName.setFont(h2);
        panel.add(clientName);

        clientName1 = new JTextField();
        clientName1.setBounds(150,115,150,20);
        panel.add(clientName1);

        //  Card ID
        cardID_D = new JLabel("Card ID");
        cardID_D.setBounds(55,200,90,20);
        cardID_D.setFont(h2);
        panel.add(cardID_D);

        cardID_DC = new JTextField();
        cardID_DC.setBounds(180,200,150,20);
        panel.add(cardID_DC);

        //  Withdrawal Amount
        withdrawalAmount = new JLabel("Withdrawal Amount");
        withdrawalAmount.setBounds(25,240,150,20);
        withdrawalAmount.setFont(h2);
        panel.add(withdrawalAmount);

        withdrawalAmount1 = new JTextField();
        withdrawalAmount1.setBounds(180,240,100,20);
        panel.add(withdrawalAmount1);

        //  Date of Withdrawal
        dateOfWithdrawal = new JLabel("Date of Withdrawal");
        dateOfWithdrawal.setBounds(26,280,150,20);
        dateOfWithdrawal.setFont(h2);
        panel.add(dateOfWithdrawal);

        //  Generating Day Loop
        Integer[] day = new Integer[31];
        for (int i=0;i<31;i++)
        {
            day[i]=i+1;
        }
        d_Day = new JComboBox(day);
        d_Day.setBounds(180,280,70,20);
        panel.add(d_Day);

        //  Generating Month Loop
        String[] month = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        m_Month = new JComboBox(month);
        m_Month.setBounds(250,280,80,20);
        panel.add(m_Month);

        //  Generating Year Loop
        int start=2023;
        Integer[] year = new Integer[123];
        for (int j=0;j<123;j++)
        {
            year[j]=start;
            start--;

        }
        y_Year = new JComboBox(year);
        y_Year.setBounds(330,280,90,20);
        panel.add(y_Year);

        // Pin Number
        pinNumberD = new JLabel("Pin Number");
        pinNumberD.setBounds(50,320,80,20);
        pinNumberD.setFont(h2);
        panel.add(pinNumberD);

        pinNumberDC = new JTextField();
        pinNumberDC.setBounds(180,320,150,20);
        panel.add(pinNumberDC);

        //  Bank Account
        bankAccount = new JLabel("Bank Account");
        bankAccount.setBounds(480,45,110,20);
        bankAccount.setFont(h2);
        panel.add(bankAccount);

        bankAccount1 = new JTextField();
        bankAccount1.setBounds(600,45,150,20);
        panel.add(bankAccount1);

        //  Balance Amount
        balanceAmount = new JLabel("Balance Amount");
        balanceAmount.setBounds(470,80,110,20);
        balanceAmount.setFont(h2);
        panel.add(balanceAmount);

        balanceAmount1 = new JTextField();
        balanceAmount1.setBounds(600,80,150,20);
        panel.add(balanceAmount1);

        //  Pin Number
        pinNumber = new JLabel("Pin Number");
        pinNumber.setBounds(485,115,110,20);
        pinNumber.setFont(h2);
        panel.add(pinNumber);

        pinNumber1 = new JTextField();
        pinNumber1.setBounds(600,115,150,20);
        panel.add(pinNumber1);

        //  Add Debit Card Button
        addDebit=new JButton("Add Debit Card");
        addDebit.setBorder(null);
        addDebit.setOpaque(true);
        Color addDebitcolor = new Color(57, 230, 0);
        addDebit.setBackground(addDebitcolor);
        addDebit.setBounds(615,175,120,20);
        panel.add(addDebit);
        addDebit.addActionListener(this);

        //  Clear Button
        clear=new JButton("Clear");
        clear.setBorder(null);
        clear.setOpaque(true);
        Color clearcolor = new Color(255, 51, 51);
        clear.setBackground(clearcolor);
        clear.setBounds(470,330,90,20);
        panel.add(clear);
        clear.addActionListener(this);

        //  Display Button
        display=new JButton("Display");
        display.setBorder(null);
        display.setOpaque(true);
        Color displaycolor = new Color(255, 255, 0);
        display.setBackground(displaycolor);
        display.setBounds(580,330,90,20);
        panel.add(display);
        display.addActionListener(this);

        //  Withdraw Button
        withdraw=new JButton("Withdraw");
        withdraw.setBorder(null);
        withdraw.setOpaque(true);
        Color withdrawcolor = new Color(0, 255, 0);
        withdraw.setBackground(withdrawcolor);
        withdraw.setBounds(690,330,90,20);
        panel.add(withdraw);
        withdraw.addActionListener(this);

        //                                                                     Start of the 2 Panel 
        // Declaring the Credit Card componets

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(50,450,803,379);
        panel1.setBackground(new Color(255,227,174));

        creditCard = new JLabel("Credit Card");
        creditCard.setBounds(360,10,250,20);
        creditCard.setFont(h2);
        panel1.add(creditCard);

        //  Issuer Bank
        issuerBank2 = new JLabel("Issuer Bank");
        issuerBank2.setBounds(50,50,78,20);
        issuerBank2.setFont(h2);
        panel1.add(issuerBank2);

        issuerBank3 = new JTextField();
        issuerBank3.setBounds(150,50,150,20);
        panel1.add(issuerBank3);

        //  CVC Number
        cvcNumber = new JLabel("CVC Number");
        cvcNumber.setBounds(45,80,150,20);
        cvcNumber.setFont(h2);
        panel1.add(cvcNumber);

        cvcNumber1 = new JTextField();
        cvcNumber1.setBounds(150,80,150,20);
        panel1.add(cvcNumber1);

        //  Client Name
        clientName3 = new JLabel("Client Name"); 
        clientName3.setBounds(50,110,100,20);
        clientName3.setFont(h2);
        panel1.add(clientName3);

        clientName4 = new JTextField();
        clientName4.setBounds(150,110,150,20);
        panel1.add(clientName4);

        //  Intrest Rate
        interestRate = new JLabel("Interest Rate");
        interestRate.setBounds(47,140,100,20);
        interestRate.setFont(h2);
        panel1.add(interestRate);

        interestRate1 = new JTextField();
        interestRate1.setBounds(150,140,150,20);
        panel1.add(interestRate1);

        //  Card ID
        cardID1 = new JLabel("Card ID");
        cardID1.setBounds(480,50,110,20);
        cardID1.setFont(h2);
        panel1.add(cardID1);

        cardID2 = new JTextField();
        cardID2.setBounds(590,50,150,20);
        panel1.add(cardID2);

        //  Bank Account
        bankAccount2 = new JLabel("Bank Account");
        bankAccount2.setBounds(460,80,110,20);
        bankAccount2.setFont(h2);
        panel1.add(bankAccount2);

        bankAccount3 = new JTextField();
        bankAccount3.setBounds(590,80,150,20);
        panel1.add(bankAccount3);

        //  Balance Amount
        balanceAmount2 = new JLabel("Balance Amount");
        balanceAmount2.setBounds(453,110,110,20);
        balanceAmount2.setFont(h2);
        panel1.add(balanceAmount2);

        balanceAmount3 = new JTextField();
        balanceAmount3.setBounds(590,110,150,20);
        panel1.add(balanceAmount3);

        //  Expiration Date
        expirationDate = new JLabel("Expiration Date");
        expirationDate.setBounds(455,145,150,20);
        expirationDate.setFont(h2);
        panel1.add(expirationDate);

        //  Generating Day Loop
        Integer[] day1 = new Integer[31];
        for (int i=0;i<31;i++)
        {
            day1[i]=i+1;
        }
        d_Day1 = new JComboBox(day1);
        d_Day1.setBounds(585,150,60,20);
        panel1.add(d_Day1);

        //  Generating Month Loop
        String[] month1 = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        m_Month1 = new JComboBox(month1);
        m_Month1.setBounds(640,150,80,20);
        panel1.add(m_Month1);

        //  Generating Year Loop
        int start1=2023;
        Integer[] year1 = new Integer[123];
        for (int j=0;j<123;j++)
        {
            year1[j]=start1;
            start1--;

        }
        y_Year1 = new JComboBox(year1);
        y_Year1.setBounds(715,150,90,20);
        panel1.add(y_Year1);

        //  Cancel Card Button
        cancelCard=new JButton("Cancel Card");
        cancelCard.setBorder(null);
        cancelCard.setOpaque(true);
        Color cancelCardcolor = new Color(255, 51, 51);
        cancelCard.setBackground(cancelCardcolor);
        cancelCard.setBounds(525,200,120,20);
        panel1.add(cancelCard);
        cancelCard.addActionListener(this);

        //  Add Credit Card Button
        addCreditCard=new JButton("Add Credit Card");
        addCreditCard.setBorder(null);
        addCreditCard.setOpaque(true);
        Color addCreditCardcolor = new Color(57, 230, 0);
        addCreditCard.setBackground(addCreditCardcolor);
        addCreditCard.setBounds(665,200,120,20);
        panel1.add(addCreditCard);
        addCreditCard.addActionListener(this);

        //  Card ID
        cardID_C = new JLabel("Card ID");
        cardID_C.setBounds(62,230,90,20);
        cardID_C.setFont(h2);
        panel1.add(cardID_C);

        cardID_CC = new JTextField();
        cardID_CC.setBounds(150,230,150,20);
        panel1.add(cardID_CC);

        //  Credit Limit
        creditLimit = new JLabel("Credit Limit");
        creditLimit.setBounds(50,260,100,20);
        creditLimit.setFont(h2);
        panel1.add(creditLimit);

        creditLimit1 = new JTextField();
        creditLimit1.setBounds(150,260,150,20);
        panel1.add(creditLimit1);

        //  Grace Period
        gracePeriod = new JLabel("Grace Period");
        gracePeriod.setBounds(47,290,100,20);
        gracePeriod.setFont(h2);
        panel1.add(gracePeriod);

        gracePeriod1 = new JTextField();
        gracePeriod1.setBounds(150,290,150,20);
        panel1.add(gracePeriod1);

        //  Set Credit Limit Button
        setCreditLimit=new JButton("Set Credit Limit");
        setCreditLimit.setBorder(null);
        setCreditLimit.setOpaque(true);
        Color setCreditLimitcolor = new Color(57, 230, 0);
        setCreditLimit.setBackground(setCreditLimitcolor);
        setCreditLimit.setBounds(300,340,120,20);
        panel1.add(setCreditLimit);
        setCreditLimit.addActionListener(this);

        //  Clear Button
        clear1=new JButton("Clear");
        clear1.setBorder(null);
        clear1.setOpaque(true);
        Color clearcolor1 = new Color(255, 51, 51);
        clear1.setBackground(clearcolor1);
        clear1.setBounds(550,340,90,20);
        panel1.add(clear1);
        clear1.addActionListener(this);

        //  Display Button
        display1=new JButton("Display");
        display1.setBorder(null);
        display1.setOpaque(true);
        Color displaycolor1 = new Color(255, 255, 0);
        display1.setBackground(displaycolor1);
        display1.setBounds(660,340,90,20);
        panel1.add(display1);
        display1.addActionListener(this);

        //  Frame 2 Visible
        frame.add(panel1);
        frame.setVisible(true);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == clear){
            // Reseting the textfield
            issuerBank1.setText("");
            cardID.setText("");
            clientName1.setText("");
            withdrawalAmount1.setText("");
            bankAccount1.setText("");
            balanceAmount1.setText("");
            pinNumber1.setText("");
            cardID_DC.setText("");
            pinNumberDC.setText("");

            d_Day.setSelectedIndex(0);
            m_Month.setSelectedIndex(0);
            y_Year.setSelectedIndex(0);
        }
            // Dbit Card
        if(e.getSource() == addDebit){
            if(issuerBank1.getText().isEmpty() || clientName1.getText().isEmpty() || pinNumber.getText().isEmpty() || 
            cardID.getText().isEmpty() || bankAccount1.getText().isEmpty() || balanceAmount1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Please provide all the information given in the form", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            } else{
                try{
                    int l_CardID = Integer.parseInt(cardID.getText());
                    int pinNumber = Integer.parseInt(pinNumber1.getText());
                    double balanceAmount = Integer.parseInt(balanceAmount1.getText());

                    String bankAccount = bankAccount1.getText();
                    String issuerBank = issuerBank1.getText();
                    String clientName = clientName1.getText();

                    String totalValues = "Client Name: "+clientName+" \nIssuer Bank: "+issuerBank+" \nCard ID: "+l_CardID+" \nBank Account: "
                        +bankAccount+" \nBalance Amount: "+balanceAmount+" \nPin Number: "+pinNumber;
                    // Using loop through array list
                    boolean Already = true;
                    for(BankCard dCards : bCards){
                        if(dCards instanceof DebitCard){
                            DebitCard d_obj= (DebitCard) dCards;
                            if(d_obj.getCardID() == l_CardID){
                                Already = false;
                            }
                        }
                    }
                    if(Already == true){
                        // Creating a objecting of DebitCard and giving parameter value
                        DebitCard DC = new DebitCard(balanceAmount, l_CardID, bankAccount, issuerBank, clientName, pinNumber);
                        bCards.add(DC);

                        // Given message will print if it's true
                        JOptionPane.showMessageDialog(panel, "Debit Card has been added successfully. \n"+totalValues);
                    } else{
                        JOptionPane.showMessageDialog(panel, "Debit Card has been already added.");
                    }
                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, 
                        "Please give intger to Card ID, Pin Number and Balance Amount and Letter in Bank Account, Issuer Bank, Client Name", 
                        "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if(e.getSource() == withdraw){
            if(withdrawalAmount1.getText().isEmpty() || pinNumberDC.getText().isEmpty() || cardID_DC.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(panel, "Please provide all information to Withdraw Money", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int cardID_D = Integer.parseInt(cardID_DC.getText());
                    int pinNumberD = Integer.parseInt(pinNumberDC.getText());
                    int withdrawalAmount = Integer.parseInt(withdrawalAmount1.getText());

                    String dateOfWithdrawal= d_Day.getSelectedItem()+ " " + m_Month.getSelectedItem()+ " " + y_Year.getSelectedItem();

                    String values = "Card ID: "+ cardID_D+ " \nPin Number"+ pinNumberD+ "\nWithdrawal Amount"+ withdrawalAmount + "Date of Withdrawal"+ dateOfWithdrawal;
                    for(BankCard dCards : bCards){
                        //Using the if condation and check the BankCArd class's value are Debit card values or and not
                        if(dCards instanceof DebitCard){
                            DebitCard d_obj= (DebitCard) dCards;
                            if(d_obj.getCardID() == cardID_D){
                                 if(d_obj.getPinNumber() == pinNumberD){
                                     if(d_obj.getBalanceAmount() >= withdrawalAmount){
                                    d_obj.Withdraw(withdrawalAmount, dateOfWithdrawal, pinNumberD);
                                    JOptionPane.showMessageDialog(panel, "Your money has withdraw");
                                }
                                else{
                                    JOptionPane.showMessageDialog(panel, "You don't have enough money to withdraw");
                                }
                                
                            }
                            else{
                                JOptionPane.showMessageDialog(panel, "Your pin number didn't match");
                            }
                            }
                            else{
                                JOptionPane.showMessageDialog(panel, "Your Card ID didn't match");
                            }
                        }
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Please provide only integers in Card Id , Pin Number and Withdrawal Amount", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Display button
        if(e.getSource() == display){
            String bankAccount = bankAccount1.getText();
            String issuerBank = issuerBank1.getText();
            String clientName = clientName1.getText();
            String dateOfWithdrawal= d_Day.getSelectedItem()+ " " + m_Month.getSelectedItem()+ " " + y_Year.getSelectedItem();

            if(issuerBank1.getText().isEmpty() || clientName1.getText().isEmpty() || pinNumber.getText().isEmpty() || 
            cardID.getText().isEmpty() || bankAccount1.getText().isEmpty() || balanceAmount1.getText().isEmpty()){
                JOptionPane.showMessageDialog(panel, "The fields is Empty !!");
            }
            else{
                try{
                    int l_CardID = Integer.parseInt(cardID.getText());
                    int pinNumber = Integer.parseInt(pinNumber1.getText());
                    double balanceAmount = Integer.parseInt(balanceAmount1.getText());

                    for(BankCard dCards : bCards){
                        if(dCards instanceof DebitCard){
                            DebitCard d_obj = (DebitCard) dCards;
                            d_obj.display();

                            String totalValues = "Client Name: "+clientName+" \nIssuer Bank: "+issuerBank+" \nCard ID: "+l_CardID+" \nBank Account: "
                                +bankAccount+" \nBalance Amount: "+balanceAmount+" \nPin Number: "+pinNumber + "Withdrawal Amount"+ d_obj.getWithdrawalAmount() + "Date of Withdrawal"+ dateOfWithdrawal;
                            JOptionPane.showMessageDialog(panel, "Debit Card\n" + totalValues);
                        }
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel, "Please provide only integers in Card Id , Pin Number and Balance Amount, Pin Number and Withdrawal Amount", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //  Credit Card Buttons
        //  Add Credit Card
        if(e.getSource() == addCreditCard){
            if(issuerBank3.getText().isEmpty() || cvcNumber1.getText().isEmpty() || clientName4.getText().isEmpty() || 
            interestRate1.getText().isEmpty() ||cardID2.getText().isEmpty() || bankAccount3.getText().isEmpty() || 
            balanceAmount3.getText().isEmpty()){
                JOptionPane.showMessageDialog(panel1, "Please provide all the information given in the form", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);

            }else {
                try{
                    int balanceAmount2 = Integer.parseInt(balanceAmount3.getText());
                    int cvcNumber = Integer.parseInt(cvcNumber1.getText());
                    int interestRate = Integer.parseInt(interestRate1.getText());
                    int cardID1 = Integer.parseInt(cardID2.getText());

                    String issuerBank2 = issuerBank3.getText();
                    String clientName3 = clientName4.getText();
                    String bankAccount2 = bankAccount3.getText();
                    String expirationDate = d_Day1.getSelectedItem()+ " " + m_Month1.getSelectedItem()+ " " + y_Year1.getSelectedItem();

                    // Sum of all String Values
                    String sumValues = "Client Name: "+clientName3+" \nIssuer Bank: "+issuerBank2+" \nCard ID: "+cardID1+" \nBank Account: "
                        +bankAccount2+" \nBalance Amount: "+balanceAmount2+" \nCVC Number: "+cvcNumber+" \nInterest Rate: "+ interestRate;

                    boolean already = true; // Initialize the boolean veriable already is true
                    for(BankCard cCards : bCards){
                        if(cCards instanceof CreditCard){
                            CreditCard c_obj= (CreditCard) cCards;
                            if(c_obj.getCardID() == cardID1){
                                already = false;
                            }
                        }
                    }
                    if(already = true)
                    {
                        CreditCard CC = new CreditCard(cardID1,clientName3,issuerBank2,bankAccount2,balanceAmount2,cvcNumber,interestRate,expirationDate); 
                        bCards.add(CC);

                        // Given message will print if it's true
                        JOptionPane.showMessageDialog(panel1, "Credit Card has been added successfully. \n"+sumValues);
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel1, "Invalid !! Please input the correct values.");
                }
            }
        }
        
        // Set Credit button
        if(e.getSource() == setCreditLimit){
            if(cardID_CC.getText().isEmpty() ||
            gracePeriod1.getText().isEmpty() ||
            creditLimit1.getText().isEmpty() 
            ){
                JOptionPane.showMessageDialog(frame, "Please provide all information to Set the Credit Limit", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int cardID_C = Integer.parseInt(cardID_CC.getText());
                    int gracePeriod = Integer.parseInt(gracePeriod1.getText());
                    int creditLimit = Integer.parseInt(creditLimit1.getText());

                    String CValues = "Card Id: "+cardID2+" \nGrace Period: "+gracePeriod1+" \nCredit Limit: "+creditLimit1;

                    for(BankCard cCards : bCards){
                        if(cCards instanceof CreditCard)
                        {
                            CreditCard c_obj = (CreditCard) cCards;
                            if(c_obj.getCardID() == cardID_C)
                            {
                                if(creditLimit <= (c_obj.getBalanceAmount()*2.5))
                                {
                                    c_obj.setCreditLimit(creditLimit, gracePeriod);
                                    JOptionPane.showMessageDialog(frame, "Credit Limit has been set Successfully.");

                                }
                            }else{
                                JOptionPane.showMessageDialog(frame, "Card don't exist.");

                            }
                        }
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame, "Please provide only integers in Card Id, Balance Amount, Cvc Number, Interest Rate", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


        //     Display button
        if(e.getSource() == display1){
            if(cardID2.getText().isEmpty() || clientName4.getText().isEmpty() || issuerBank3.getText().isEmpty() || bankAccount3.getText().isEmpty() ||
            balanceAmount3.getText().isEmpty() || cvcNumber1.getText().isEmpty() || interestRate1.getText().isEmpty()){
                JOptionPane.showMessageDialog(panel1, "The fields is Empty !!");
            }
            else{
                try{
                    int cardID1 = Integer.parseInt(cardID2.getText());
                    int balanceAmount2 = Integer.parseInt(balanceAmount3.getText());
                    int interestRate = Integer.parseInt(interestRate1.getText());
                    int cvcNumber = Integer.parseInt(cvcNumber1.getText());
                    int creditLimit = Integer.parseInt(creditLimit1.getText());
                    int cardID_C = Integer.parseInt(cardID_CC.getText());
                    int gracePeriod = Integer.parseInt(gracePeriod1.getText());

                    String bankAccount2 = bankAccount3.getText();
                    String issuerBank2 = issuerBank3.getText();
                    String clientName3 = clientName4.getText();
                    String expirationDate= d_Day1.getSelectedItem()+ " " + m_Month1.getSelectedItem()+ " " + y_Year1.getSelectedItem();

                    for(BankCard cCards : bCards){
                        if(cCards instanceof CreditCard){
                            CreditCard c_obj = (CreditCard) cCards;
                            c_obj.display();

                            String total = "Client Name: "+clientName3+" \nIssuer Bank: "+issuerBank2+" \nCard ID: "+cardID1+" \nBank Account: "
                                +bankAccount2+" \nBalance Amount: "+balanceAmount2 + "Expiration Date"+ expirationDate + "Credit Limit" + creditLimit +
                                "Card ID" + cardID_C + "Grace Period" + gracePeriod;
                            JOptionPane.showMessageDialog(panel1, "Credit Card\n" + total);
                        }
                    }
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel1, "Please provide the correct information in the given field", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //      Cancel Credit Card
        if(e.getSource() == cancelCard){
            if(issuerBank3.getText().isEmpty() || cardID2.getText().isEmpty() || clientName3.getText().isEmpty() || bankAccount3.getText().isEmpty() ||
            balanceAmount3.getText().isEmpty() || cvcNumber1.getText().isEmpty() || interestRate1.getText().isEmpty()
            ){
                JOptionPane.showMessageDialog(panel1, "Please provide all the right information", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
            try{
                int cardID1 = Integer.parseInt(cardID2.getText());

                for(BankCard cCards : bCards){
                    if(cCards instanceof CreditCard){
                        CreditCard c_obj = (CreditCard) cCards;
                        if(c_obj.getCardID() == cardID1)
                        {
                            c_obj.cancelCreditCard();
                            JOptionPane.showMessageDialog(panel1, "Credit Card has been cancelled");

                        }else{
                            JOptionPane.showMessageDialog(panel1, "Credit Card hasn't been cancelled");
                        }
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(panel1, "Please provide only integers in Card Id, Balance Amount, Cvc Number, Interest Rate", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

        //  Clear
        if(e.getSource() == clear1){
            // Reseting the Textfeild of the Credit Card            
            issuerBank3.setText("");
            cvcNumber1.setText("");
            clientName4.setText("");
            interestRate1.setText("");
            cardID2.setText("");
            cardID_CC.setText("");
            bankAccount3.setText("");
            balanceAmount3.setText("");
            creditLimit1.setText("");
            gracePeriod1.setText("");

            d_Day1.setSelectedIndex(0);
            m_Month1.setSelectedIndex(0);
            y_Year1.setSelectedIndex(0);
        }
    }
    
    public static void main (String[] args) {
    new BankGUI();
    }
}