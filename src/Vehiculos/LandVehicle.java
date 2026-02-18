package Vehiculos;

public class LandVehicle extends Vehicle{

    public LandVehicle(String name){
        super(name);
    }

    public void drive(){
        System.out.println("rodando");
    }
}
