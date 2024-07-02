package conditional_statement;

import java.util.Scanner;

public class Weekday1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int day = scan.nextInt();
        System.out.println(dayname(day));

    }
        public static String dayname(int day){
        String dayname ="";
        switch(day){
            case 1: dayname="Monday";break;
            case 2: dayname="Tuesday";break;
            case 3: dayname="Wednesday";break;
            case 4: dayname="Thursday";break;
            case 5: dayname="Friday"; break;
            case 6: dayname="Saturday";break;
            case 7: dayname="Sunday";break;
            default: dayname="Invalid Day";
        }

        return dayname;
    }
}