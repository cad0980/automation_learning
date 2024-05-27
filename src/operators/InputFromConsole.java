package operators;

import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int in = scan.nextInt();
        System.out.println("you entered " + in);
    }
}
