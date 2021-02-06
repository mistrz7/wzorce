package pl.smilu.fasada;

public class CzynnosciImpl implements Czynnosci
{

    @Override
    public void idzDoPiwnicy()
    {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void wyjmijRower() {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void wyjdzNaPrzejazdzke() {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void jedz() {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void wrocDoDomu() {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void schowajRower() {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void napijSieElektrolitow() {
        pokaz( Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    private static void pokaz(String tekst)
    {
        System.out.println(tekst);
    }
}
