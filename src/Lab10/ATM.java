package Lab10;

public class ATM {
    private boolean userAuthenticated; //returns true if user is authenticated, false otherwise
    private int currentAccountNumber; //active user's account number
    
    private Screen screen; //ATM has a screen
    private Keypad keypad; //ATM has a keypad
    private CashDispenser cashDispenser; //ATM has a CashDispenser
    private DepositSlot depositSlot; //ATM has a deposit slot
    private BankDatabase bankDatabase; //ATM has access to the account information database
    
    //constant values to show the options in main menu
    
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
    
    //no argument ATM constructor
    public ATM(){
        userAuthenticated = false; //should be false by default at the start
        currentAccountNumber = 0; //default value is 0
        screen = new Screen(); //Screen object
        keypad = new Keypad(); //Keypad object
        cashDispenser = new CashDispenser(); //create cash dispenser object
        depositSlot = new DepositSlot(); //create deposit slot object
        bankDatabase = new BankDatabase(); //create account info database
    }
    
    //run method to start the ATM and keep it running
    public void run()
    {
        //While loop to keep the atm running. the screen displays a welcome message
        //and performs transactions
        while (true)
        {
            //loop while the user is not authenticated
            while(!userAuthenticated)
            {
                screen.displayMessageLine("\nWelcome!");
                authenticateUser(); // method call to authenticate user
            }//end while
            
            performTransactions();//perform the transactions once the user is authenticated
            userAuthenticated = false; //reset once the transactions have been performed. ready to start a new ATM session
            currentAccountNumber = 0;//reset for next ATM session
            screen.displayMessageLine("\nThank You! Have a good day"); //can be modified to print time specific response
        }//end while
    }//end method run
    //method for authenticating user in the database
    private void authenticateUser()//helpt method
    {
        screen.displayMessage("\nPlease enter your account number: ");
        int accountNumber = keypad.getInput();//input account number
        screen.displayMessage("\nEnter your PIN: "); //prompt for pin
        int pin = keypad.getInput(); //input PIN
        
        //set userAuthenticated to the boolean values returned by the database
        userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);
        
        //check whether authentication was successfull
        if(userAuthenticated)
        {
            currentAccountNumber = accountNumber;//save user's account number
        }//end if
        else
            screen.displayMessageLine("Invalid account number or PIN. Please try again.");
    }//end method authenticateUser
    
    //display the main menu and perform transactions
    private void performTransactions()
    {
        Transaction currentTransaction = null; //a local variable to store the type of current transaction
        boolean userExited = false; //User has not exited the ATM
        
        //loop while user has not chosen to exit the sytem
        while(!userExited)
        {
            //show main menu and get user selection
            int mainMenuSelection = displayMainMenu();
            
            //decide how to proceed based on user's menu selection
            switch (mainMenuSelection)
            {
                //user chose to perform one of the three transaciton types
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:
                    
                    //initialize as new object of chosen type
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();//execute transaction
                    break;
                case EXIT://user chose to terminate session
                    screen.displayMessageLine("\nExiting the system...");
                    userExited = true;//this ATM session should end
                    break;
                default://user did not enter an integer from 1-4
                    screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
                    break;
            }//end switch
        }//end while
    }//end method performTransactions
    
    //diaplay the main menu and return an input selection
    private int displayMainMenu()//helper method
    {
        screen.displayMessageLine("\nMain Menu:");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw Cash");
        screen.displayMessageLine("3 - Deposit Funds");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("Enter a choice: ");
        return keypad.getInput();//return user's selection
    }//end method displayMainmenu
    
    //return object of specified Transaction subclass
    private Transaction createTransaction(int type)
    {
        Transaction temp = null; //temporacy transaction variable
        switch(type)
        {
            case BALANCE_INQUIRY://create new BalanceInquiry transaction
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL://create new Withdrawal transaction
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }//end switch
        return temp;//return the newly created object
    }//end method createTransaction
}//end class ATM
