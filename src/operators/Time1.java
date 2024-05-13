package operators;
public class Time1 {
    public static void main (String [] args){

        int s1 = 86399;

        int h = s1/3600;
        int m = (s1%3600)/60;
        int s = s1%60;


        System.out.println(h + " hours " + m + " minutes " + s + " seconds");
    }

}