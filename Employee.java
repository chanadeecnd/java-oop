class Employee {
    // attribute
    private String id;
    private String name;
    private double salary;

    //static attribute
    static int minSalary = 12000;

    //constructor
    public Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    //set attribute
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //get attribute
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayEmployee() {
        System.out.printf("ID = %s%n", this.id);
        System.out.printf("Name = %s%n", this.name);
        System.out.printf("Salary = %.2f%n", this.salary);
    }
}