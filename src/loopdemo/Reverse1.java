package loopdemo;

public class Reverse1 {
    public static void main(String[] args) {
        int number = 500;
        int reverse = 0;
        //while (number != 0) {
          //  int remainder = number % 10;
            //reverse = reverse * 10 + remainder;
            //number = number / 10;
        for(;number!=0; number=number/10){
            int remainder = number%10;
            reverse=reverse*10 + remainder;

        }
        System.out.println("The reverse of the number is " + reverse);
    }
}
