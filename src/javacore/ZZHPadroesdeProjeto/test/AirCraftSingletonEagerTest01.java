package javacore.ZZHPadroesdeProjeto.test;

import javacore.ZZHPadroesdeProjeto.dominio.AirCraftSingletonEager;

public class AirCraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEager.getInstance());
        AirCraftSingletonEager airCraft = AirCraftSingletonEager.getInstance();
        System.out.println(airCraft.bookSeat(seat));
    }
}
