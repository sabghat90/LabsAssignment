package Lab07;

public class UnderGraduate extends Student{
   private double testScore;

    public UnderGraduate(double testScore, String studentNo, String studentName, Date dateOfBirth, int meritPoints) {
        super(studentNo, studentName, dateOfBirth, meritPoints);
        this.testScore = testScore;
    }
    public double calculateMerit()
    {
        return meritPoints + testScore;
    }   
    
    @Override
    public String toString() {
        return super.toString()+ String.format(",%s: %.2f", "calculateMerit",calculateMerit());
}
}