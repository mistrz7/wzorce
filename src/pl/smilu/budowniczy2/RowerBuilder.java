package pl.smilu.budowniczy2;

public class RowerBuilder
{
    private String typ;
    private Integer rozmiar;
    private String kolor;

    public RowerBuilder()
    {
    }

    public RowerBuilder typ(String typ)
    {
        this.typ=typ;
        return this;
    }

    public RowerBuilder rozmiar(Integer rozmiar)
    {
        this.rozmiar=rozmiar;
        return this;
    }

    public RowerBuilder kolor(String kolor)
    {
        this.kolor=kolor;
        return this;
    }

    public Rower build()
    {
        Rower rower=new Rower();
        rower.setTyp(typ);
        rower.setRozmiar(rozmiar);
        rower.setKolor(kolor);

        return rower;
    }
}
