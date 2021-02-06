package pl.smilu.budowniczy;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("start");
        Rower rowerAdama = Rower.create("kolarka", 28, "czerwona");
        Rower rowerEwy = Rower.create("kolarka", "czerwona");

        System.out.println("Rower Adama="+rowerAdama.toString());
        System.out.println("Rower Ewy="+rowerEwy.toString());

        System.out.println("koniec");
    }
}
