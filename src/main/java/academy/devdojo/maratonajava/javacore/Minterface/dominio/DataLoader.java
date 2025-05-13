package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {
    int MAX_DATASIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Checando as Permissões");
    }

    static void retrieveMaxSize(){
        System.out.println("Dentro da Interface");
    }
}
