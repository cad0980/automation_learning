package objects;

public class Phone {

    String Brand;
    int  Ramspace;
    int memory;
    int chipProcessor;
    double height;
    double weight;


    void messaging (String to, String content){
        System.out.println(Brand + " - " + to + " - " + content);
    }

}

class PhoneDemo{
    public static void main(String[] args) {
        Phone p1 = new Phone();

        int i = 10;

        p1.Brand = "Samsung";
        p1.memory = 4;

        Phone p2 = new Phone();
        p2.Brand = "IPhone";
        p2.memory = 4;

        Phone p3 = new Phone ();
        p3.Brand = "Nokia";
        p3.weight= 4.5;
        p1.messaging("Vaibhav","How r u");

    }
}
