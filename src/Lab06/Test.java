package Lab06;

public class Test {

    public static void main(String[] args) {
        /*SavingsAccount s1=new SavingsAccount("Muhammad Raza",2000);*/
        
        SavingsAccount s1=new SavingsAccount();
        double n=2500;
        s1.setSavingsBalance(n);
        for(int i=1; i<=12; i++)
        {
        double rzlt=s1.claculateMonthlyInterest();
        System.out.printf("your amount after interest is: %.2f%n",rzlt);
        n=rzlt;
        s1.setSavingsBalance(n);
        }
       /* SavingsAccount.modifyInterestRate();
        SavingsAccount s2=new SavingsAccount("Muhammad Raza",2000);
        System.out.printf("\nyour amount after interest is: %.2f",s2.claculateMonthlyInterest());*/
    }
    
}
