package javacore.ZZHPadroesdeProjeto.test;

import javacore.ZZHPadroesdeProjeto.dominio.Aircraft;

public class AirCraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
