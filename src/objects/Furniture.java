package objects;
public class Furniture{
    String Type;
    int Capacity;
    String Brand;
    double weight;
    String Purpose;
    String Category;

    void furniture (String obj, String category, String purpose){
        System.out.println(Type + " - " + Category + " - " + Purpose);
    }
}
class Furnituredemo {
    public static void main(String[] args) {

        Furniture F1 = new Furniture();
        F1.Category = "Bedroom";
        F1.Type = "Wooden";
        F1.Purpose = "Bed to sleep on";
        F1.Capacity = 4;
        F1.furniture(" ", " ", " ");


        Furniture F2 = new Furniture();
        F2.Category = "Bedroom";
        F2.Type = "Wooden";
        F2.Purpose = "Closet to keep the clothes";
        F2.Capacity = 8;
        F2.furniture(" ", " ", " ");

        Furniture F3 = new Furniture();
        F3.Category = "Bedroom";
        F3.Type = "Wooden";
        F3.Purpose = "Dresser for getting ready";
        F3.Capacity = 1;
        F3.furniture(" ", " ", " ");

        Furniture F4 = new Furniture();
        F4.Category = "Living Room";
        F4.Type = "Wooden";
        F4.Purpose = "Sofa to sit";
        F4.Capacity = 3;
        F4.furniture(" ", " ", " ");

        Furniture F5 = new Furniture();
        F5.Category = "Living Room";
        F5.Type = "Wooden";
        F5.Purpose = "Center table for keeping things";
        F5.Capacity = 4;
        F5.furniture(" ", " ", " ");

        Furniture F6 = new Furniture();
        F6.Category = "Dining Room";
        F6.Type = "Wooden";
        F6.Purpose = "Dining table for family lunch and dinner";
        F6.Capacity = 8;
        F6.furniture(" ", " ", " ");

    }
}

