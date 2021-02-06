package pl.smilu.budowniczy;

public class Rower
{
    private String typ;
    private Integer rozmiar;
    private String kolor;

    public Rower(String typ, Integer rozmiar, String kolor) {
        this.typ = typ;
        this.rozmiar = rozmiar;
        this.kolor = kolor;
    }

    public Rower(String typ, String kolor)
    {
        this.typ = typ;
        this.kolor = kolor;
    }

    public static Rower create(String typ, Integer rozmiar, String kolor)
    {
        return new Rower(typ, rozmiar, kolor);
    }

    public static Rower create(String typ, String kolor)
    {
        return new Rower(typ, kolor);
    }

    @Override
    public String toString() {
        return "Rower{" +
                "typ='" + typ + '\'' +
                ", rozmiar=" + rozmiar +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
