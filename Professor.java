public class Professor extends Teacher {

    private String Speciality;
    private String research_area;
    private String rank;
    private boolean tenured;

    Professor(String id, int salary,int numYrs, String spec,String area, String rank, boolean t){
        super(id,salary,numYrs);
        this.Speciality=spec;
        this.research_area=area;
        this.rank=rank;
        this.tenured=t;
    }

    Professor(){}

    Professor(Professor other){
        if(other==null || other.Speciality.equals("") && other.research_area.equals("") && other.rank.equals("") && other.tenured==false){
            System.out.println("Error");
            System.exit(0);
        }
        super(other.getId(), other.getSalary(), other.getYears());
        this.Speciality= other.Speciality;;
        this.rank=other.rank;
        this.tenured=other.tenured;
        this.research_area=other.research_area;

    }

    //get and set methods
    public void setRank(String r){
        this.rank=r;
    }
    public String getRank(){
        return this.rank;
    }

    public void setArea(String a){
        this.research_area=a;
    }
    public String getArea(){
        return this.research_area;
    }

    public void setSpec(String s){
        this.Speciality=s;
    }
    public String getSpec(){
        return this.Speciality;
    }

    public void setTenured(boolean t){
        this.tenured=t;
    }

    public boolean getTenured(){
        return this.tenured;
    }

    public String toString(){
        String output=super.toString();
        output+="Professor Information\n";
        output+="Speciality: "+this.getSpec() +"\n";
        output+="Research Area: "+this.getArea() +"\n";
        output+="Rank: "+this.getRank() +"\n";

        return output;
    }

}
