package javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String name = "Takamura";

    void print(String param){
        final String lastName = "Mamoru";
        class LocalClass {
            public void printLocal(){
                System.out.println(param);
                System.out.println(name+" "+lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print("Champ");
    }
}
