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

public class Main {
    public static void main(String[] args) {
        // creating 4 student objects
        Student student1 = new Student("Layla", 19, true, "123-45-6789", "S123", 3.6);
        Student student2 = new Student("Sara", 20, true, "987-65-4321", "S321", 3.8);
        Student student3 = new Student("Ali", 21, true, "100-20-1234", "S246", 3.2);
        Student student4 = new Student("Reem", 22, true, "888-88-8888", "S369", 3.4);

        // printing student details
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}



