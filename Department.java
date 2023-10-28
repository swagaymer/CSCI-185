public class Department {
    private String name;
    private Professor ChairMen;
    private Professor[] faculty;
    private Course[] courses;

    private College_Student [] students;

    Department(String n, Professor name, Professor[] pro, Course[] c, College_Student[] s){
        this.name=n;
        this.ChairMen=new Professor(name);
        this.faculty= new Professor[pro.length];
        for(int i=0;i< pro.length; i++){
            this.faculty[i]=new Professor(pro[i]);
        }
        this.courses=new Course[c.length];
        for(int j=0;j<c.length;j++){
            this.courses[j]=new Course(c[j]);
        }
        this.students= new College_Student[s.length];
        for(int k=0; k<s.length;k++){
            this.students[k]=new College_Student(s[k]);
        }
    }
    Department(){}
    Department(Department other){
        if(other==null || other.name.equals("") && other.ChairMen==null && other.faculty==null && other.courses==null && other.students==null){
            System.out.println("System Error!! Invalid Object");
            System.exit(0);
        }
        this.name=other.name;
        this.ChairMen=new Professor(other.getChair());
        this.faculty= new Professor[other.faculty.length];
        for(int i=0;i< other.faculty.length; i++){
            this.faculty[i]=new Professor(other.faculty[i]);
        }
        this.courses=new Course[other.courses.length];
        for(int j=0;j<other.courses.length;j++){
            this.courses[j]=new Course(other.courses[j]);
        }
        this.students=new College_Student[other.students.length];
        for(int k=0;k<other.students.length;k++){
            this.students[k]=new College_Student(other.students[k]);
        }

    }
    //get & set methods
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setChair(Professor chair){
        this.ChairMen=new Professor(chair);
    }
    public Professor getChair(){
        Professor copy= new Professor(this.ChairMen);
        return copy;
    }

    public void setFaculty(Professor[] fac){
        this.faculty= new Professor[fac.length];
        for(int i=0; i<fac.length;i++){
            this.faculty[i]= new Professor(fac[i]);
        }
    }

    public Professor[] getFaculty(){
        Professor[] f=new Professor[this.faculty.length];
        for(int i=0;i<this.faculty.length;i++){
            f[i]=new Professor(this.faculty[i]);
        }return f;
    }

    public void setCourses(Course[] courses){
        this.courses=new Course[courses.length];
        for(int j=0; j<courses.length;j++){
            this.courses[j]=new Course(courses[j]);
        }
    }

    public Course[] getCourses(){
        Course[] c=new Course[this.courses.length];
        for(int j=0; j<this.courses.length;j++){
            c[j]=new Course(this.courses[j]);
        }return c;
    }

    public void setCollegeStud(College_Student[] s){
        this.students= new College_Student[s.length];
        for(int k=0; k<s.length;k++){
            this.students[k]=new College_Student(s[k]);
        }
    }

    public College_Student[] getCollegeStud(){
        College_Student stud=new College_Student[this.students.length];
        for(int k=0;k<this.students.length;k++){
            stud[k]=new College_Student(this.students[k]);
        }return stud;
    }


    public String toString() {
        String output = "";
        output += "/nUniversity Department Information\n";
        output += "Name of Department: " + this.getName() + "\n";
        output += "Department Chairmen: " + this.getChair() + "\n";
        output += "Faculty of Professors: \n";
        for (int i = 0; i < this.faculty.length; i++) {
            output += "Professor " + (i + 1) + "Information: \n\n" + this.faculty.toString() + "\n";
        }
        output += "Available Courses: \n";
        for (int j = 0; j < this.courses.length; j++) {
            output += "Course " + (j + 1) + "Information \n\n" + this.courses.toString() + "\n";
        }
        output += "Student Population: \n";
        for (int k=0; k<this.students.length; k++){
            output+="Student "+(k+1) +"Information \n\n" +this.students.toString()  +"\n";
        }
        return output;
    }

}
