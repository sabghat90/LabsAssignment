package Lab03;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;

    private int day;
    private int month;
    private int year;

    private int ageInYear;

    private double heightInInch;
    private double weightInPounds;

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

    public double getHeartRate (int year) {
        ageInYear = year - 2020;
        return 220 - ageInYear;
    }


    public double getBMI (double heightInInch, double weightInPounds) {
        return  ( weightInPounds * 703 ) / heightInInch * heightInInch;
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
        return "\nHealthProfile{" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", gender ='" + gender + '\'' +
                ", Date of birth ='" + day + "/" + month + "/" + year + '\'' +
                ", heightInInch ='" + heightInInch + '\'' +
                ", weightInPounds ='" + weightInPounds + '\'' +
                ", Age in year ='" + ageInYear + '\'' +
                ", BMI ='" + getBMI(heightInInch,weightInPounds) + '\'' +
                ", Max Heart Rate ='" + getHeartRate(year) + '\'' +
                '}';
    }
}
