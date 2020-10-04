package Lab06;

public class SavingsAccount {
    private static double AnnualInterestRate=0.04;
    //private String name;
    private double savingsBalance;
   // private double monthlyInterest=0;

    /*public SavingsAccount(String name, double savingsBalance) {
        this.name = name;
        this.savingsBalance = savingsBalance;
    }*/
    public void setSavingsBalance(double savingsBalance)
    {
        this.savingsBalance=savingsBalance;
    }
    public double claculateMonthlyInterest()
    {
       double a;
       a=(AnnualInterestRate*savingsBalance)/12;
       double monthlyInterest=0;
       monthlyInterest=monthlyInterest+a;
       savingsBalance= savingsBalance+monthlyInterest;
       return savingsBalance;
    }
    public static void modifyInterestRate()
    {
      AnnualInterestRate=0.05;  
    }
}
