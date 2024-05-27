package operators;

import java.util.Scanner;

public class Largest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scan.nextInt();
        System.out.println("Enter the second number : ");
        int b = scan.nextInt();
        System.out.println("Enter the third number : ");
        int c = scan.nextInt();
        int temp = a>b?a:b;
        int l = c>temp?c:temp;
        System.out.println("The largest number is : "+l);

    }
}