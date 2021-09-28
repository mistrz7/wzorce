package pl.smilu.noIf;


import pl.smilu.noIf.factoryClass.Operation;
import pl.smilu.noIf.factoryClass.OperatorFactory;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("start");

        int a=2;
        int b=3;

        zwykleDodawanie(a, b);
        factoryDodawanie(a, b);

        System.out.println("koniec");
    }

    private static void factoryDodawanie(int a, int b)
    {
        Operation targetOperation = OperatorFactory
                .getOperation("add")
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        int result = targetOperation.apply(a, b);

        System.out.println("faktory dodawanie="+result);
    }

    private static void zwykleDodawanie(int a, int b)
    {
        //z if
        UsingIf usingIf = new UsingIf();
        int result = usingIf.calculate(a, b, "add");
        System.out.println("wynik zwykle="+result);
    }
}
