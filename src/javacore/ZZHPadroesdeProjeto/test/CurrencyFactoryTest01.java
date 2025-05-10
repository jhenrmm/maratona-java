package javacore.ZZHPadroesdeProjeto.test;

import javacore.ZZHPadroesdeProjeto.dominio.Country;
import javacore.ZZHPadroesdeProjeto.dominio.Currency;
import javacore.ZZHPadroesdeProjeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency.getSymbol());
    }
}
