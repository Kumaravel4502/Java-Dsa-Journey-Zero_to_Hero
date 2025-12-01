package CollectionFramework.SoftSauve;

class Employee {
    private int id;
    private String Name;
    private double Salary;


    public Employee(int id, String Name, double Salary) {
        this.id = id;
        this.Name = Name;
        this.Salary = Salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public void display() {
        System.out.println("Id: " + id + ", Name: " + Name + ", Salary: " + Salary);
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee e=new Employee(1,"Kumaravel",50000);
        Employee e2=new Employee(2,"Ramesh",20000);
       e.display();
       e2.display();
    }
}
