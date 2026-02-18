package Vehiculos;

public class CatalogoMain {
    public static void main(String[] args) {
        LandVehicle VehiculoTerrestre1 = new LandVehicle("Jeep");
        VehiculoTerrestre1.move();
        VehiculoTerrestre1.drive();

        WaterVehicle VehivuloAcuatico1 = new WaterVehicle("Optimis");
        VehivuloAcuatico1.move();
        VehivuloAcuatico1.sail();

        ElectricCar VehiculoTerrestreElectrico1 = new ElectricCar("Tesla");
        VehiculoTerrestreElectrico1.move();
        VehiculoTerrestreElectrico1.drive();
        VehiculoTerrestreElectrico1.ChargeBattery();

        ElectricBoat VehiculoAcuaticoElectrico1 = new ElectricBoat("Lancha");
        VehiculoAcuaticoElectrico1.move();
        VehiculoAcuaticoElectrico1.sail();
        VehiculoAcuaticoElectrico1.ChargeBattery();

    }
}
