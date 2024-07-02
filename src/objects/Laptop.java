package objects;
public class Laptop{
    String Brand;
    int Ramspace;
    int memory;
    double weight;

    void email (String to, String content){
        System.out.println(Brand + " - " + to + " - " + content);
    }
}

// MyNameIsKhan - class and interface
//myNameIsKhan - method, varibales ,
class Laptopdemo {
    public static void main (String [] args){

        Laptop L1 = new Laptop();

                L1.Brand = "Mac Book";
            L1.memory=256;
            L1.weight=14.1;
            L1.Ramspace=16;

            Laptop L2 = new Laptop();
            L2.Brand = "Sony Vaio";
            L2.memory=512;
            L2.weight=12.7;
            L2.Ramspace=8;

            Laptop L3 = new Laptop();
            L3.Brand="Lenovo";
            L3.memory=256;
            L3.weight=14.3;
            L3.Ramspace=16;
            L2.email("Chinmay", "Please see me");


    }
}