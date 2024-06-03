package loopdemo;

public class Sum1 {
    public static void main(String[] args) {
        int num = 234;
        int sum = 0;
        while (num != 0){
            sum = sum + num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
    }
       
    /*
        number = 234;
        sum = 0;

        sum = sum + number % 10 ; // 4
        number = number / 10  // 23

         sum = sum + number % 10 ; // 3, , 3+4 = 7
         number  = nuber / 10 = 2

          sum = sum + number % 10 ;  7+2  =9
          number = number / 10 = 0

          sum = sum + number % 10 ; // 0
          number = number / 10; //0

     */