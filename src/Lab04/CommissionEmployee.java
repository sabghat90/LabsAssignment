package Lab04;

public class CommissionEmployee extends Employee {
    double commissionRate;
    double grossSales;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double earnings() {
        return commissionRate * grossSales;
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

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
