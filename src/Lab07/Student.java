package Lab07;

public class Student {
    private String studentNo;
    private String studentName;
    Date dateOfBirth;
    protected int meritPoints;  // a number between 20 and 200
    private static int numberOfStudents=0;
    public Student()
    {
        studentNo=studentName="not known";
        meritPoints=20;
       this.dateOfBirth=dateOfBirth;
       numberOfStudents++;
    }

    public Student(String studentNo, String studentName, Date dateOfBirth, int meritPoints) {
        if(meritPoints<20 || meritPoints>200)
            throw new IllegalArgumentException("merit points should be between 20 and 200");
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.meritPoints = meritPoints;
        numberOfStudents++;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMeritPoints(int meritPoints) {
        if(meritPoints<20 || meritPoints>200)
            throw new IllegalArgumentException("merit points should be between 20 and 200");
        this.meritPoints = meritPoints;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMeritPoints() {
        return meritPoints;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String toString()
    {
        return String.format("%s: %s, %s: %s, %s: %s, %s: %d","studentNumber",getStudentNo(),"StudentName",
               getStudentName(), "date o f birth",getDateOfBirth(),"merit points",getMeritPoints());
    }
    
}
