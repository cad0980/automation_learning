package conditional_statement;

public class SwitchDemo {
    public static void main(String[] args) {
        // monthNumber - 1
        // MonthName - January

        //1 - 12
        //13 -24
        int monthNumber = 14;
        String monthName = "";
        switch (monthNumber){
            case 1:
            case 13:
               monthName = "January";
               break;
            case 2:
            case 14:
                monthName = "Feb";
                break;
            case 3:
            case 15:
                monthName = "Mar";
                break;
            default:
                monthName = "sad";
        }
        System.out.println(monthName);
    }
}
