package conditional_statement;

public class IfSession {
    public static void main(String[] args) {

        // mynameiskhan
        // hungarian notation - MyNameIsKhan - class
        // camel casing - myNameIsKhan - variable, method

        // less then 18 years people are not allowed
        // age factor, person is allowed
        // 0-18 = child
        // 19 -30 = adult
        // 31-45 = Mature
        // more then 45 = old
        int age = 32;
        String ageGroup = "";
           if(age <= 18){
            ageGroup = "Child";
        }else if(age > 18 && age <= 35){
            ageGroup = "Adult";
        }else if(age > 31 && age <= 45){
            ageGroup = "Mature";
        }else {
            ageGroup = "old";
        }
        System.out.println("age Group : " + ageGroup);

           // switch condition - equality
    }
}
