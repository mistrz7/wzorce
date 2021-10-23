package pl.smilu.budowniczy2;

public class Rower
{
    private String typ;
    private Integer rozmiar;
    private String kolor;

    public static RowerBuilder builder()
    {
        return new RowerBuilder();
    }

    public String getTyp()
    {
        return typ;
    }

    public void setTyp(String typ)
    {
        this.typ = typ;
    }

    public Integer getRozmiar()
    {
        return rozmiar;
    }

    public void setRozmiar(Integer rozmiar)
    {
        this.rozmiar = rozmiar;
    }

    public String getKolor()
    {
        return kolor;
    }

    public void setKolor(String kolor)
    {
        this.kolor = kolor;
    }

    @Override
    public String toString()
    {
        return "Rower{" +
                "typ='" + typ + '\'' +
                ", rozmiar=" + rozmiar +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
