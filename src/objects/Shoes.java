package objects;
public class Shoes{
    String Brand;
    double Size;
    String Sport;
    double weight;
    String Purpose;

    void shoes (String obj, String material, String purpose){
        System.out.println(Brand + " - " + Sport + " - " + Purpose);
    }
}
class Shoesdemo {
    public static void main(String[] args) {

        Shoes S1 = new Shoes();

        S1.Brand = "Addidas";
        S1.Size =9.5;
        S1.Sport = "Tennis";
        S1.Purpose = "Shoes used specifically to play on grass court";
        S1.shoes(" ", " ", " ");

        Shoes S2 = new Shoes();
        S2.Brand = "Addidas";
        S2.Size = 10;
        S2.Sport = "Tennis";
        S2.Purpose = "Shoes specifically used to play on hart court";
        S2.shoes(" ", " ", " ");

        Shoes S3 = new Shoes();
        S3.Brand = "Nike";
        S3.Size = 14;
        S3.Sport = "Basketball";
        S3.Purpose = "Shoes to play basketball indoors";
        S3.shoes(" "," ", " " );

        Shoes S4 = new Shoes();
        S4.Brand = "Puma";
        S4.Size=10.5;
        S4.Sport="Cricket";
        S4.Purpose="Shoes used by bowlers specifically";
        S4.shoes(" ", " ", " ");

        Shoes S5 = new Shoes();
        S5.Brand = "Addidas";
        S5.Size=9;
        S5.Sport="Cricket";
        S5.Purpose="Shoes used by Batsmen";
        S5.shoes(" ", " ", " ");
    }
}