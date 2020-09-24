package Lab04;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getSocialSecurityNumber() {
        return super.getSocialSecurityNumber();
    }

    @Override
    public double getGrossSales() {
        return super.getGrossSales();
    }

    @Override
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");
        super.setGrossSales(grossSales);
    }

    @Override
    public double getCommissionRate() {
        return super.getCommissionRate();
    }

    @Override
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        super.setCommissionRate(commissionRate);
    }

    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee%n%n%sBase Salary: %.2f%n", super.toString(), getBaseSalary());
    }
}