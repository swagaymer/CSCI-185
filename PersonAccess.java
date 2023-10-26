public class PersonAccess{
}
class Person{

    private String name;
    private int age;
    private String ssn;
    private boolean alive;

    //loaded constructor
    Person(String n, int a, String ssn, boolean value){
        this.name=n;
        this.age=a;
        this.ssn=ssn;
        this.alive=value;
    }
    //copy constructor
    Person(Person other){
        if(other == null || other.name.equals("") && other.age<=0 && other.ssn.equals("") && other.alive == false){
            System.out.println("Error!! Invalid Class");
            System.exit(0);
        }
        this.name= other.name;
        this.age=other.age;
        this.ssn=other.ssn;
        this.alive=other.alive;
    }
    //no args constructor
    Person(){}

    //set & get pairs
    public void setName(String n){
        this.name=n;}
    public String getName(){
        return this.name;}

    public void setAge(int a){
        this.age=a;}
    public int getAge(){
        return this.age;}

    public void setSSN(String ssn){
        this.ssn=ssn;}
    public String getSSN(){
        return this.ssn;}

    public void setAlive(boolean a){
        this.alive=a;}
    public boolean getAlive(){
        return this.alive;}


    //to String method
    public String toString(){
        String output="";
        output+="Information for Each Person: \n";
        output+="Name: "+this.getName() +"\n";
        output+="Age: "+this.getAge() +"\n";
        output+="Social Security Number: "+this.getSSN() +"\n";
        return output;
    }
}