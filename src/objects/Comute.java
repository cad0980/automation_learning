package objects;
public class Comute{
    String Type;
    int Capacity;
    String Brand;
    double weight;
    String Purpose;
    String Category;

    void comute (String obj, String category, String purpose){
        System.out.println(Type + " - " + Category + " - " + Purpose);
    }
}
class Comutedemo {
    public static void main(String[] args) {

        Comute C1 = new Comute();
        C1.Type = "Public";
        C1.Brand = "AshokLeyland";
        C1.Capacity = 100;
        C1.Category = "Bus";
        C1.Purpose = "Office commute for employees";
        C1.comute(" ", " ", " ");

        Comute C2 = new Comute();
        C2.Type = "Public";
        C2.Capacity = 3;
        C2.Category = "Auto";
        C2.Purpose = "Public transportation";
        C2.comute(" ", " ", " ");

        Comute C3 = new Comute();
        C3.Type = "Private";
        C3.Capacity = 5;
        C3.Category = "Compact SUV";
        C3.Purpose = "Private car for a family of 4";
        C3.comute(" ", " ", " ");

        Comute C4 = new Comute();
        C4.Type = "Private";
        C4.Capacity = 2;
        C4.Category = "Bike";
        C4.Purpose = "Used for commute by students";
        C4.comute(" ", " ", " ");

        Comute C5 = new Comute();
        C5.Type = "Public";
        C5.Capacity = 308;
        C5.Category = "Plane";
        C5.Purpose = "Used primarily for public commute for domestic and international travel";
        C5.comute(" ", " ", " ");


    }
}