package objects;
public class Tablet{
    String Brand;
    int Ramspace;
    int memory;
    double weight;
    double Height;

    void email (String to, String content){
        System.out.println(Brand + " - " + to + " - " + content);
    }
}
class Tabletdemo {
    public static void main (String [] args){

        Tablet T1 = new Tablet();

        T1.Brand = "iPad";
        T1.memory=256;
        T1.weight=14.1;
        T1.Ramspace=16;

        Tablet T2 = new Tablet();
        T2.Brand = "Sony Vaio";
        T2.memory=512;
        T2.weight=12.7;
        T2.Ramspace=8;

        Tablet T3 = new Tablet();
        T3.Brand="Lenovo";
        T3.memory=256;
        T3.weight=14.3;
        T3.Ramspace=16;
        T3.email("Chinmay", "Please use Netflix for streaming");


    }
}