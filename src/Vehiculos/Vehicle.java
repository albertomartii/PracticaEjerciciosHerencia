package Vehiculos;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println(this.name + "se mueve 10 metros:");
    }
}
