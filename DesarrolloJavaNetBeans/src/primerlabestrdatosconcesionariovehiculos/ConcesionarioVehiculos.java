/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerlabestrdatosconcesionariovehiculos;

/**
 *
 * @author gran_
 */
import primerlabestrdatosconcesionariovehiculos.Clases.InventarioVehiculos;


public class ConcesionarioVehiculos {

    public static void main(String[] args) {
        InventarioVehiculos inventarioSucursal1 = new InventarioVehiculos();
        inventarioSucursal1.agregarVehiculo("Bugatti");
        inventarioSucursal1.agregarVehiculo("Ferrari");
        inventarioSucursal1.agregarVehiculo("Porsche");
        inventarioSucursal1.agregarVehiculo("Maserati");

        InventarioVehiculos inventarioSucursal2 = new InventarioVehiculos();
        inventarioSucursal2.agregarVehiculo("Alfa Romeo");
        inventarioSucursal2.agregarVehiculo("Mercedes");
        inventarioSucursal2.agregarVehiculo("BMW");
        inventarioSucursal2.agregarVehiculo("Mazda");

        inventarioSucursal1.contarVehiculos();
        inventarioSucursal1.mostrarVehiculoEnPosicion(3);
        inventarioSucursal1.verificarVehiculo("Porsche");
        inventarioSucursal1.mostrarInventario(true);

        inventarioSucursal1.insertarVehiculoEnPosicion("Lamborghini", 2);
        inventarioSucursal1.eliminarVehiculo("Lamborghini");
        inventarioSucursal1.eliminarVehiculoEnPosicion(2);
        
        inventarioSucursal1.fusionarInventarios(inventarioSucursal2);
        inventarioSucursal1.mostrarInventario(false);
        inventarioSucursal1.actualizarVehiculo("Bugatti", "Tesla");
    }
}
