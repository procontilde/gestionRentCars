package controlador;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Vehiculo;
import vista.IORentACar;

public class MainRentACar {

    public static void main(String[] args) {
    	IORentACar vista = new IORentACar();
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.obtenerOpcion();

            switch (opcion) {
                case 1:
                    Cliente cliente = vista.obtenerDatosCliente();
                    // Lógica para añadir el cliente al sistema
                    break;
                case 2:
                    Empleado empleado = vista.obtenerDatosEmpleado();
                    // Lógica para añadir el empleado al sistema
                    break;
                case 3:
                    Vehiculo vehiculo = vista.obtenerDatosVehiculo();
                    // Lógica para añadir el vehículo al sistema
                    break;
                case 4:
                    // Lógica para realizar reserva
                    break;
                case 5:
                    // Lógica para devolver vehículo
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 6);
    }
}
