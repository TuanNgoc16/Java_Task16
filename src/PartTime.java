public class PartTime extends Employee {
    private int Day;
    public PartTime (String Name, double Salary ,int Day) {
        super(Name,Salary);
        this.Day=Day;
    }
    public int getPartTime (){
        return Day * 90000;

    }
    @Override
    public String toString() {
        return "PartTime{" +
                "Day=" + Day +  super.toString()
                ;
    }
}

