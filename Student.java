public class Student extends Person {
    private String stu_id;
    private double gpa;

    public Student(String name, int age, boolean alive, String ssn, String stu_id, double gpa) {
        super(name, age, ssn, alive);
        this.stu_id = stu_id;
        this.gpa = gpa;
    }

    // Copy constructor with null checks
    public Student(Student other) {
        super(other); // Call the superclass copy constructor
        if (other != null) {
            this.stu_id = other.stu_id;
            this.gpa = other.gpa;
        } else {
            System.out.println("Error!! Invalid Student Class");
        }
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student Info:\n" +
                super.toString() + "\n" +
                "Student ID: " + stu_id + "\n" +
                "GPA: " + gpa;
    }
}
