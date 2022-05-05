public class Employee {
    private String Name;
    private  double Salary;
    public Employee ( String Name, double Salary){
        this.Name=Name;
        this.Salary=Salary;
    }

    @Override
    public String toString() {
        return " ,Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
