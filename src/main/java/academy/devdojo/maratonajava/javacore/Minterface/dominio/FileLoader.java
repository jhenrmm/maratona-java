package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando Dados do Arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Dados do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissões no Arquivo");
    }
}
