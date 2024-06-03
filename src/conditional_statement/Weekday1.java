package conditional_statement;
public class Weekday1 {
    public static void main(String[] args) {
        int daynum =2;
        String dayname="";
        switch(daynum){
            case 1: dayname="Monday";break;
            case 2: dayname="Tuesday";break;
            case 3: dayname="Wednesday";break;
            case 4: dayname="Thursday";break;
            case 5: dayname="Friday"; break;
            case 6: dayname="Saturday";break;
            case 7: dayname="Sunday";break;
            default: dayname="Invalid Day";
        }
        System.out.println(dayname);
    }
}