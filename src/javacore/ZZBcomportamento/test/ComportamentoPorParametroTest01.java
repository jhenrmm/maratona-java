package javacore.ZZBcomportamento.test;

import javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List <Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println("=================");
        System.out.println(filterByYearBefore(cars, 2020));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor){
        List<Car> colorCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                colorCars.add(car);
            }
        }
        return colorCars;
    }
    private static List<Car> filterByYearBefore(List<Car> cars, int year){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
