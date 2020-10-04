package Lab10;

public class SavingAccount extends Account {
    private double interestRate;
    
    public SavingAccount(int accountNumber, int pin, double availableBalance, double totalBalance, double interest)
    {
        super(accountNumber, pin, availableBalance, totalBalance);
        
        if(interest <= 0.0 || interest > 1.0)
            throw new IllegalArgumentException("Interste rate should be between 0 and 1");
        this.interestRate = interest;
    }
    
    public void setInterestRate(double interest){
        if(interest <= 0.0 || interest > 1.0)
            throw new IllegalArgumentException("Interste rate should be between 0 and 1");
        this.interestRate = interest;
    }  
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public double calculateInterest()
    {
        return getAvailableBalance()*interestRate;
    }
}
