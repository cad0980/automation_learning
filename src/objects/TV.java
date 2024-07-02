package objects;
public class TV{
    String Brand;
    int Size;
    String Type;
    double weight;

    void streaming (String app, String content){
        System.out.println(Brand + " - " + app + " - " + content);
    }
}
class TVdemo {
    public static void main (String [] args){

        TV T1 = new TV();

        T1.Brand = "Vizio";
        T1.Type="LED";
        T1.weight=40.5;
        T1.Size=65;

        TV T2 = new TV();
        T2.Brand = "Samsung";
        T2.Type="OLED";
        T2.weight=35.7;
        T2.Size=70;

        TV T3 = new TV();
        T3.Brand="LG";
        T3.Type="4K";
        T3.weight=48.6;
        T3.Size=75;
        T3.streaming("Netflix", "Movies");


    }
}