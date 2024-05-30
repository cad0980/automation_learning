package loopdemo;

public class Primenum {
    public static void main(String[] args) {
    for(int number=1; number <21; number++) {
        boolean isPrimeNumber = true;
        for (int i = 2; i <= number - 1; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        if (isPrimeNumber == true) {
            System.out.println(number+" is a Prime Number");
        } else {
            System.out.println(number+" is not a Prime Number");
        }
    }
}
}