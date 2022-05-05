public class TestEmployee{

    public static void main(String[] args) {
        FullTime a1 = new FullTime ("Tuan ngoc",122,22);
        System.out.println(a1);
        System.out.println(a1.getHours());

        PartTime a2 = new PartTime( "Tuan ngoc",222,111);
        System.out.println(a2);
        System.out.println(a2.getPartTime());
    }
}
