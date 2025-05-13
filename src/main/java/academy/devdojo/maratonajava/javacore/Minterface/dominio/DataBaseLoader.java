package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando Dados do Banco de Dados");
    }
    @Override
    public void remove() {
        System.out.println("Removendo Dados do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissões no Banco de Dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da Classe DataBaseLoader");
    }
}
