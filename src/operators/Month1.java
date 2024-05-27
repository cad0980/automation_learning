package operators;

public class Month1 {
    public static void main(String[] args) {

        int month = 1;
        // for 21 days
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days is 31");
                break;
// case for 30 days

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days is 30");
                break;

                // for 28 days
            case 2:
                System.out.println("Number of days is 28");
                break;

            default:
                System.out.println("Invalid Month");
                break;


        }
    }
    }
