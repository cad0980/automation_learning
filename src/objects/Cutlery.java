package objects;
public class Cutlery{
    String Material;
    String Size;
    String Type;
    double weight;
    String Purpose;

    void cutlery (String obj, String material, String purpose){
        System.out.println(Type + " - " + Material + " - " + Purpose);
    }
}
class Cutlerydemo {
    public static void main(String[] args) {

        Cutlery C1 = new Cutlery();

        C1.Material = "Steel";
        C1.Type = "Serving Spoon";
        C1.weight = 1;
        C1.Purpose = "Serve food";
        C1.cutlery(" ", " ", " ");

        Cutlery C2 = new Cutlery();
        C2.Material = "Plastic";
        C2.Type = "Eating spoon";
        C2.weight = 0.7;
        C2.Purpose = "To eat food";
        C2.cutlery(" ", " ", " ");

        Cutlery C3 = new Cutlery();
        C3.Material = "Wooden";
        C3.Type = "Cooking spoon";
        C3.weight = 0.6;
        C3.Purpose = "To cook food with";
        C3.cutlery(" "," ", " " );
    }
}