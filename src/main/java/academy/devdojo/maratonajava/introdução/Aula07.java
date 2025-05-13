package academy.devdojo.maratonajava.introdução;

public class Aula07 {
    public static void main(String[] args) {
        // Padrão de inicialização de cada tipo em uma lista
        // byte, short, int, long, float, double = 0
        //char = '\u0000', ' '
        //boolean = false
        //String = null
        int[] age = new int[3];
        age[0] = 5;
        age[1] = 3;
        age[2] = 1;
        //for (int i = 0; i < 3; i++){
        //    System.out.println(age[i]);
        String[] names = new String[3];
        names[0] = "Pedro";
        names[1] = "Lucas";
        names[2] = "Jorge";
//        for (int name = 0; name < names.length;name++){
//            System.out.println(names[name]);
//        }
        int[] nums2 = new int[]{1,4,2,8,7,6};
        for (int num:nums2){
            System.out.println(num);
        }
    }
}

