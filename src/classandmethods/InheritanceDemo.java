package classandmethods;
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    void raiseSalary(double percent){
        salary+=salary*percent/100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString()+
                ", bonus=" + bonus +
                '}';
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Employee e1=new Employee("Harry",35000);
        System.out.println(e1.getSalary());
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());
        Manager m1=new Manager("john",65000,25000);
        System.out.println(m1.getSalary());
        System.out.println(e1);
        System.out.println(m1);
    }
}
