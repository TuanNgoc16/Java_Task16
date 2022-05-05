public class FullTime extends  Employee{
    private int hours;
    public FullTime ( String Name, double Salary,int hours){
        super(Name,Salary);
        this.hours= hours;
    }
    public int getHours () {
        return hours * 2000;
    }
    @Override
    public String toString() {
        return "FullTime{" +
                "hours=" + hours + super.toString()
                         ;
    }
}
