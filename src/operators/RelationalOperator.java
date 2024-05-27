package operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int age1 = 10;
        int age2 = 20;

        System.out.println(age1 > age2); // false
        System.out.println(age1 < age2); // true
        System.out.println(age1 >= age2); // false
        System.out.println(age1 <= age2); // true
        System.out.println(age1 == age2); // false
        System.out.println(age1 != age2); // true
    }
}
