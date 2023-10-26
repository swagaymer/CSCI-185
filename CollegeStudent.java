class College_Student extends Student {
    private String major;
    private String grade;

    public College_Student(String name, int age, boolean alive, String ssn, String stu_id, double gpa, String major, String grade) {
        super(name, age, alive, ssn, stu_id, gpa);
        this.major = major;
        this.grade = grade;
    }

    // Copy constructor with null checks
    public College_Student(College_Student other) {
        super(other); // Call the superclass copy constructor
        if (other != null) {
            this.major = other.major;
            this.grade = other.grade;
        } else {
            System.out.println("Error!! Invalid College_Student Class");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return "College Student Info:\n" +
                super.toString() + "\n" +
                "Major: " + major + "\n" +
                "Grade: " + grade;
    }
}