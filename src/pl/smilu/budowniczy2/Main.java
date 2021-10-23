package pl.smilu.budowniczy2;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("start");
        Rower czerwonaKolarka=Rower.builder().typ("kolarka").rozmiar(28).kolor("czerwony").build();
        Rower zielonyGoral=Rower.builder().typ("goral").rozmiar(26).kolor("zielony").build();

        System.out.println(czerwonaKolarka);
        System.out.println(zielonyGoral);

        System.out.println("koniec");
    }
}
