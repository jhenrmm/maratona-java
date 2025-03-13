package javacore.Minterface.test;

import javacore.Minterface.dominio.DataBaseLoader;
import javacore.Minterface.dominio.DataLoader;
import javacore.Minterface.dominio.FileLoader;

import java.util.Objects;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxSize();
        DataBaseLoader.retrieveMaxDataSize();;
    }
}
