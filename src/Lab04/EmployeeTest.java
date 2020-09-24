package Lab04;

public class EmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jhon","Mack","321-64-6464",5000,0.04);
        System.out.println(commissionEmployee);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("DEE","Mark"
        ,"212-656-64545",4000,0.07,1000);
        System.out.println(basePlusCommissionEmployee);
    }
}
