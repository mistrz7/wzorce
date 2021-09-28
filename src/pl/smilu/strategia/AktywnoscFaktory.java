package pl.smilu.strategia;

import java.util.HashMap;
import java.util.Optional;

class AktywnoscFaktory
{
    enum aktywnosciEnum{
        RZUT, CROSS_OVER, ALLEY_OOP;
    }

    static HashMap<aktywnosciEnum, Aktywnosc> aktywnosci=new HashMap<>();

    static {
        aktywnosci.put(aktywnosciEnum.RZUT, new Rzut());
        aktywnosci.put(aktywnosciEnum.CROSS_OVER, new CrossOver());
        aktywnosci.put(aktywnosciEnum.ALLEY_OOP, new AlleyOop());
    }

    static Optional<Aktywnosc> getAktywnosc(Enum<aktywnosciEnum> aktywnosc)
    {
        return Optional.ofNullable(aktywnosci.get(aktywnosc));
    }
}
