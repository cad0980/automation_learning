package operators;

import java.util.Scanner;

public class Checknumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int m = scan.nextInt();

        String result = (m !=45)?"pass":"fail";
        System.out.println("You"+ result + " the exam.");


    }
}