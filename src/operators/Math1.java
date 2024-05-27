package operators;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scan.nextInt();
        System.out.println("Enter the second number : ");
        int b = scan.nextInt();

        int sum = a+b;
        int diff = a-b;
        int product = a*b;
        int avg = (a+b)/2;
        int dist = a-b;
        int largest = a>b?a:b;
        int smallest = a<b?a:b;

        System.out.println("The sum is : "+sum);
        System.out.println("The difference is : "+diff);
        System.out.println("The product is :"+product);
        System.out.println("The average is :"+avg);
        System.out.println("The distance is :"+dist);
        System.out.println("The largest number is : "+largest);
        System.out.println("The smallest number is :"+smallest);

    }
}