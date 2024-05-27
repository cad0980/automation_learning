public class Session2 {
    public static void main(String[] args) {
        /*
        byte = 1byte
        short = 2 byte = 16 bits
        int = 4 byte
        long = 8 byte

        -128 to 127

        1
        0000010
        1111101
        -126
         */


       int s1 = 128;
       // type casting
       byte b1 = (byte)(s1*3);

        System.out.println(b1);
        

        int i = s1;
        short s2 = (short)i;

    }
}
