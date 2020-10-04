package Lab09;
abstract class Employee implements Payable{
    
    private String id ;
    private String name;
    private String department;
    
    
    public Employee(){        
    }
    
    public Employee(String id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
 
    //constructor with age argument
   
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
    
   
 
    public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getName() + 
            " : " + 
            this.getDepartment() + 
            "]";
    }
 
}