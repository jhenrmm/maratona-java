package academy.devdojo.maratonajava.javacore.TResourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle =  ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        bundle = ResourceBundle.getBundle("messages", new Locale("en","US"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

    }
}
