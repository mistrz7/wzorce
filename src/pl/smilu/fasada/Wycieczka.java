package pl.smilu.fasada;

public class Wycieczka {

    Czynnosci czynnosci;

    public Wycieczka()
    {
        czynnosci=new CzynnosciImpl();
    }

    public void jedziemy()
    {
        czynnosci.idzDoPiwnicy();
        czynnosci.wyjmijRower();
        czynnosci.wyjdzNaPrzejazdzke();
        czynnosci.jedz();
        czynnosci.wrocDoDomu();
        czynnosci.schowajRower();
        czynnosci.napijSieElektrolitow();
    }
}