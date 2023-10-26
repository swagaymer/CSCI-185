class Student extends Person {
    private String stu_id;
    private double gpa;

    public Student(String name, int age, boolean alive, String ssn, String stu_id, double gpa) {
        super(name, age, ssn, alive);
        this.stu_id = stu_id;
        this.gpa = gpa;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student Info: " + super.toString() + " Student ID: " + stu_id + " GPA: " + gpa;
    }
}

class College_Student extends Student {
    private String major;
    private String grade;

    public College_Student(String name, int age, boolean alive, String ssn, String stu_id, double gpa, String major, String grade) {
        super(name, age, alive, ssn, stu_id, gpa);
        this.major = major;
        this.grade = grade;
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
        return "College Student Info: " + super.toString() + " Major: " + major + " Grade: " + grade;
    }
}




