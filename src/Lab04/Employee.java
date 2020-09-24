package Lab04;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public Employee(String firstName, String lastName, String socialSecurityNumber,
                    double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");
        this.grossSales = grossSales;

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public String toString() {
            return String.format("First Name: %s%nLast Name: %s%nSSN: %s%nGross Sales: %.2f%nCommission Rate: %.2f%n",
                    getFirstName(),getLastName(),getSocialSecurityNumber(),getGrossSales(),getCommissionRate());
        }
}
