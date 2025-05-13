package academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency.getSymbol());
    }
}
