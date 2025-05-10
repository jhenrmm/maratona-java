package javacore.ZZHPadroesdeProjeto.test;

import javacore.ZZHPadroesdeProjeto.dominio.AirCraftSingletonEnum;

public class AirCraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEnum.INSTANCE.hashCode());
        AirCraftSingletonEnum airCraft = AirCraftSingletonEnum.INSTANCE;
        System.out.println(airCraft.bookSeat(seat));
    }
}
