
package Lab07;

public class PostGraduate extends Student{
    private double GPA;

    public PostGraduate(double GPA, String studentNo, String studentName, Date dateOfBirth, int meritPoints) {
        super(studentNo, studentName, dateOfBirth, meritPoints);
        this.GPA = GPA;
    }
    public double calculateMerit()
    {
        return meritPoints + GPA;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(",%s: %.2f", "calculateMerit",calculateMerit());
    }
    
}
