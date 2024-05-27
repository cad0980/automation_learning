package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        // AND or OR
        // AND = when both condition satisfy - & (bitwise), && (Logical)
        // OR = any condition satisfy - | (bitwise), || (Logical)

        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        // student age criteria 31 to 40 - exam date 25th May
        // student age criteria 18 - 30 - exam date 20th May



        int age = 23;
        if(age >= 18 && age <= 30){
            System.out.println("Exam Date  - 20thMay");
        }
        if(age > 30 & age <= 40){
            System.out.println("Exam Date - 25th May");
        }

        int b1 = -10;
        int b2 = 10;
        System.out.println(b2);
        System.out.println(b1>>>2);
        System.out.println(b1>>>30);
        System.out.println(b1>>>32);




    }
}
