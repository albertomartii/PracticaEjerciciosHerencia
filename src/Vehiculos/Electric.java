package Vehiculos;

public interface Electric {
    public default void ChargeBattery(){
        System.out.println("Cargando");
    }
}
