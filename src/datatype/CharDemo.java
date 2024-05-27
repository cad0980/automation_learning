package datatype;

public class CharDemo {
    public static void main(String[] args) {
        // ASCII Code - 1 byte
        // Keyboard button

        char c1 = 'D';
        int m = c1;
        System.out.println(c1);
        System.out.println(m);
        // all charcter are integer by default
         int m1 = 75;
         char j1 = (char)m1;
        System.out.println(j1);






        // Uni code - 2 byte
        // global language
        char b0 = '\u093F';
        char b1 = '\u091A';
        char b2 = '\u0928';
        System.out.println(""+b1 +b0 + b2);

    }
}
