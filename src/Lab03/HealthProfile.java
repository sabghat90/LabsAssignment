package Lab03;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;

    private int day;
    private int year;
    private int month;

    private double heightInInch;
    private double weightInPounds;

    private double heartRate;
    private double BMI;

    public HealthProfile(String firstName, String lastName, String gender,
                         int day, int month, int year, double heightInInch, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.year = year;
        this.month = month;

        this.heightInInch = heightInInch;
        this.weightInPounds = weightInPounds;
    }

    public void heartRate (int year) {
        int ageInYear = year - 2020;
        heartRate = 220 - ageInYear;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void BMI (double heightInInch, double weightInPounds) {
        BMI = ( weightInPounds * 703 ) / heightInInch * heightInInch;
    }

    public double getBMI () {
        return BMI;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public double getHeightInInch() {
        return heightInInch;
    }

    public void setHeightInInch(double heightInInch) {
        this.heightInInch = heightInInch;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "HealthProfile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", Date of birth='" + day + "/" + month + "/" + year +
                ", heightInInch=" + heightInInch +
                ", weightInPounds=" + weightInPounds +
                ", BMI= " + getBMI() +
                ", Max Heart Rate= " + getHeartRate() +
                '}';
    }
}
