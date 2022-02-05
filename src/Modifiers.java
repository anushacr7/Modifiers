public class Modifiers {
    public String employeeNAme;
    public int id;
    protected int salary;
    private String password;
    private String details;

     public Modifiers(String EN, int ID, int c) {
        this.employeeNAme = EN;
        this.id = ID;
        this.salary = c;


    }
    String add(String p, int q, int r){
        return p+q+r;
    }



}
