package operators;
public class Year {
    public static void main(String[] args) {

        double min = 125.5;
        double c = (0.000694); //conversion of 1 min to day
        double days = min * c;
        double year = days/365;
        System.out.println(min);
        System.out.println(days);
        System.out.println(year);
    }
}