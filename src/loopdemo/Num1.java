package loopdemo;

public class Num1 {
    public static void main(String[] args) {
        System.out.println("Number divisible by 3: ");
        for (int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Number divisible by 5: ");
        for (int i=1; i<=100; i++){
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
                        }
        System.out.println();
        System.out.println("Number divisible by 3 and 5: ");
        for (int i=1; i<=100; i++){
            if(i%3 == 0 & i%5==0){
                System.out.print(i+ ", ");

            }
        }

            }

    }