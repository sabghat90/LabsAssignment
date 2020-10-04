package Lab10;

public class Withdrawal extends Transaction {

    private int amount;
    private Keypad keypad;
    private CashDispenser cashDispenser;

    // constant corresponding to menu option to cancel
    private final static int CANCELED = 6;

    public Withdrawal(int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase, Keypad atmKeypad,
            CashDispenser atmCashDispenser) {
        super(userAccountNumber, atmScreen, atmBankDatabase);

        keypad = atmKeypad;
        cashDispenser = atmCashDispenser;
    }

    @Override
    public void execute() {
        boolean cashDispensed = false;
        double availableBalance;

        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // loop until cash is dispensed or the user cancels
        do {
            amount = displayMenuOfAmounts();

            if (amount != CANCELED) {
                availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

                if (amount <= availableBalance) {
                    if (cashDispenser.isSufficientCashAvailable(amount)) {
                        bankDatabase.debit(getAccountNumber(), amount);
                        cashDispenser.dispenseCash(amount);
                        cashDispensed = true;
                        screen.displayMessageLine("\nYour cash has been"
                                + " dispensed. Please take your cash now.");
                    } else
                        screen.displayMessageLine("\nInsufficient cash available in the ATM."
                                + "\n\nPlease choose a smaller amount.");
                } else {
                    screen.displayMessageLine("\nInsufficient funds in your account."
                            + "\n\nPlease choose a smaller amount.");
                }
            } else {
                screen.displayMessageLine("\nCanceling transaction...");
                return; // return to main menu because user canceled
            }
        } while (!cashDispensed);
    }

    // display a menu of withdrawal amounts and the option to cancel;
    // return the chosen amount or 0 if the user chooses to cancel
    private int displayMenuOfAmounts() {
        int userChoice = 0;

        Screen screen = getScreen();

        // array of amounts to correspond to menu numbers
        int[] amounts = { 0, 20, 40, 60, 100, 200 };

        while (userChoice == 0) {
            screen.displayMessageLine("\nWithdrawal Menu:");
            screen.displayMessageLine("1 - $20");
            screen.displayMessageLine("2 - $40");
            screen.displayMessageLine("3 - $60");
            screen.displayMessageLine("4 - $100");
            screen.displayMessageLine("5 - $200");
            screen.displayMessageLine("6 - Cancel transaction");
            screen.displayMessage("\nChoose a withdrawal amount: ");

            int input = keypad.getInput();

            // determine how to proceed based on the input value
            switch (input) {
            case 1: // if the user chose a withdrawal amount
            case 2: // (i.e., chose option 1, 2, 3, 4 or 5), return the
            case 3: // corresponding amount from amounts array
            case 4:
            case 5:
                userChoice = amounts[input];
                break;
            case CANCELED:
                userChoice = CANCELED;
                break;
            default: // the user did not enter a value from 1-6
                screen.displayMessageLine("\nInvalid selection. Try again.");
            }
        }

        return userChoice;
    }
}
