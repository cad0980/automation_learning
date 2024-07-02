package loopdemo;

public class Factor1{
    public static void main(String[] args) {
        int num = 24;
        System.out.print("Factors of the number are ");
        for(int i=1; i<=num;i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    }