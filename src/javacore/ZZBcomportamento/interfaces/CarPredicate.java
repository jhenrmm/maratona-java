package javacore.ZZBcomportamento.interfaces;

import javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // animais, funções, conciso
    boolean test(Car car);
    // (parametro) -> <(expressão)>
    // (Car car) -> car.getColor().equals("green");
}
