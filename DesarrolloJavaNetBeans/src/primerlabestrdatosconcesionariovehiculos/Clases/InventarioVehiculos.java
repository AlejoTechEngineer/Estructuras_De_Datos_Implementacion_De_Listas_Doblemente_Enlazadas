/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerlabestrdatosconcesionariovehiculos.Clases;

/**
 *
 * @author gran_
 */
public class InventarioVehiculos 
{

        private Vehiculo cabeza;
        private Vehiculo cola;

        public InventarioVehiculos() 
        {
            this.cabeza = null;
            this.cola = null;
        }

        public void agregarVehiculo(String modelo) 
        {
            Vehiculo nuevo = new Vehiculo(modelo);
            if (cabeza == null) 
            {
                cabeza = cola = nuevo;
            } 
            else 
            {
                cola.setSiguiente(nuevo);
                nuevo.setAnterior(cola);
                cola = nuevo;
            }
        }

        public void mostrarInventario(boolean mostrarEncabezado) 
        {
            if (cabeza == null) 
            {
                System.out.println("\nEl inventario esta vacio.");
                return;
            }
            if (mostrarEncabezado) 
            {
                System.out.println("\nModelos en la lista del inventario:");
            }
            Vehiculo aux = cabeza;
            while (aux != null) 
            {
                System.out.println("- " + aux.getModelo());
                aux = aux.getSiguiente();
            }
        }

        public void mostrarVehiculoEnPosicion(int n) 
        {
            if (n < 0) 
            {
                System.out.println("\nPosicion invalida.");
                return;
            }
            Vehiculo aux = cabeza;
            int i = 0;
            while (aux != null) 
            {
                if (i == n) 
                {
                    System.out.println("\nEl vehiculo en la posicion " + n + " es: " + aux.getModelo() + ".");
                    return;
                }
                aux = aux.getSiguiente();
                i++;
            }
            System.out.println("\nNo hay un vehiculo en la posicion " + n + ".");
        }

        public void contarVehiculos() 
        {
            int count = 0;
            Vehiculo aux = cabeza;
            while (aux != null) 
            {
                count++;
                aux = aux.getSiguiente();
            }
            System.out.println("\nEl numero total de vehiculos en la lista de el inventario: " + count + ".");
        }

        public boolean verificarVehiculo(String modelo) {
            Vehiculo aux = cabeza;
            while (aux != null) 
            {
                if (aux.getModelo().equalsIgnoreCase(modelo)) 
                {
                    System.out.println("\nEl vehiculo '" + modelo + "' esta en el inventario.");
                    return true;
                }
                aux = aux.getSiguiente();
            }
            System.out.println("\nEl vehiculo '" + modelo + "' no está en el inventario.");
            return false;
        }

        public void insertarVehiculoEnPosicion(String modelo, int posicion) 
        {
            if (posicion < 0) 
            {
                System.out.println("\nPosicion invalida.");
                return;
            }

            System.out.println("\nAgregando vehiculo nuevo '" + modelo + "' en la posicion " + posicion + ".");
            Vehiculo nuevo = new Vehiculo(modelo);

            if (posicion == 0 || cabeza == null) 
            { 
                nuevo.setSiguiente(cabeza);
                if (cabeza != null) cabeza.setAnterior(nuevo);
                cabeza = nuevo;
                if (cola == null) cola = nuevo;
            } 
            else 
            {
                Vehiculo aux = cabeza;
                int index = 0;
                while (aux.getSiguiente() != null && index < posicion - 1) 
                {
                    aux = aux.getSiguiente();
                    index++;
                }
                nuevo.setSiguiente(aux.getSiguiente());
                nuevo.setAnterior(aux);
                if (aux.getSiguiente() != null) aux.getSiguiente().setAnterior(nuevo);
                aux.setSiguiente(nuevo);
                if (nuevo.getSiguiente() == null) cola = nuevo;
            }
            mostrarInventario(false);
        }

        public void eliminarVehiculo(String modelo) 
        {
            if (cabeza == null) 
            {
                System.out.println("\nEl inventario esta vacio.");
                return;
            }

            Vehiculo aux = cabeza;
            while (aux != null && !aux.getModelo().equalsIgnoreCase(modelo)) 
            {
                aux = aux.getSiguiente();
            }

            if (aux == null) 
            {
                System.out.println("\nEl vehiculo '" + modelo + "' no esta en el inventario.");
                return;
            }

            if (aux == cabeza) 
            {
                cabeza = cabeza.getSiguiente();
                if (cabeza != null) cabeza.setAnterior(null);
            } 
            else if (aux == cola) 
            {
                cola = cola.getAnterior();
                if (cola != null) cola.setSiguiente(null);
            } 
            else 
            {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
            }

            System.out.println("\nSe ha eliminado el vehiculo '" + modelo + "'como elemento concreto de la lista de vehiculos.");
            mostrarInventario(false);
        }

        public void eliminarVehiculoEnPosicion(int posicion) 
        {
            if (cabeza == null) 
            {
                System.out.println("\nEl inventario esta vacio.");
                return;
            }
            if (posicion < 0) 
            {
                System.out.println("\nPosicion invalida.");
                return;
            }

            Vehiculo aux = cabeza;
            int index = 0;
            while (aux != null && index < posicion) 
            {
                aux = aux.getSiguiente();
                index++;
            }

            if (aux == null) 
            {
                System.out.println("\nLa posicion " + posicion + " esta fuera de rango.");
                return;
            }

            if (aux == cabeza) 
            {
                cabeza = cabeza.getSiguiente();
                if (cabeza != null) cabeza.setAnterior(null);
            } else if (aux == cola) 
            {
                cola = cola.getAnterior();
                if (cola != null) cola.setSiguiente(null);
            } 
            else 
            {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
            }

            System.out.println("\nSe elimino el vehiculo en la posicion " + posicion + ".");
            mostrarInventario(false);
        }

        
        
        
        
        
        
        
        
        
        public void fusionarInventarios(InventarioVehiculos otroInventario) 
        {
            if (otroInventario.cabeza == null) return;

            if (this.cabeza == null) 
            {
                this.cabeza = otroInventario.cabeza;
                this.cola = otroInventario.cola;
            } 
            else 
            {
                this.cola.setSiguiente(otroInventario.cabeza);
                otroInventario.cabeza.setAnterior(this.cola);
                this.cola = otroInventario.cola;
            }
            System.out.println("\nInventarios fusionados o listas de inventarios concatenadas:");
        }

        
        public void actualizarVehiculo(String modeloActual, String nuevoModelo) 
        {
            Vehiculo aux = cabeza;

            while (aux != null) 
            {
                if (aux.getModelo().equalsIgnoreCase(modeloActual)) 
                {
                    aux.setModelo(nuevoModelo);
                    System.out.println("\nSe actualizo '" + modeloActual + "' por '" + nuevoModelo + "'.");
                    mostrarInventario(false);
                    return;
                }
                aux = aux.getSiguiente();
            }

            System.out.println("\nEl vehiculo '" + modeloActual + "' no fue encontrado.");
        }
    }


 

























