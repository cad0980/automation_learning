package objects;
public class Tools{
    String Type;
    int Capacity;
    String Brand;
    double weight;
    String Purpose;
    String Category;

    void tools (String obj, String category, String purpose){
        System.out.println(Type + " - " + Category + " - " + Purpose);
    }
}
class Toolsdemo {
    public static void main(String[] args) {
    Tools T1 = new Tools();
    T1.Type="Cutter";
    T1.Category="Scissors";
    T1.Purpose="To cut paper";
    T1.tools(" ", " "," ");


    Tools T2 = new Tools();
    T2.Type="Cutter";
    T2.Category="Fabric Scissors";
    T2.Purpose="To cut fabric";
    T2.tools(" ", " ", " ");

    Tools T3 = new Tools();
    T3.Type="Cutter";
    T3.Category="Saw";
    T3.Purpose="To cut wood";
    T3.tools(" ", " ", " ");

    Tools T4 = new Tools();
    T4.Type="Drill";
    T4.Category="Electric";
    T4.Purpose="To drill holes for screws";
    T4.tools(" "," ", " ");

    Tools T5 = new Tools();
    T5.Type="Hammer";
    T5.Category="Steel";
    T5.Purpose="To hammer nails";
    T5.tools(" "," ", " ");



        }
    }
