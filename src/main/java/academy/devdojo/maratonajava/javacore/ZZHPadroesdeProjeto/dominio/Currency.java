package academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.dominio;

public interface Currency {
    String getSymbol();
}
class Real implements Currency {

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class USDollar implements Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}
