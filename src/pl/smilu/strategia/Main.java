package pl.smilu.strategia;

class Main
{
    public static void main(String args[])
    {
        System.out.println("start");

        AktywnoscFaktory.getAktywnosc(AktywnoscFaktory.aktywnosciEnum.RZUT).get().aktywnosc();
        AktywnoscFaktory.getAktywnosc(AktywnoscFaktory.aktywnosciEnum.CROSS_OVER).get().aktywnosc();

        System.out.println("koniec");
    }
}
