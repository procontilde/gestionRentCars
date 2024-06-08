package controlador;

import modelo.*;
import vista.IORentACar;

public class MainRentACar {

    public static void main(String[] args) {
    	
        Empresa empresa = new Empresa();
        IORentACar io = new IORentACar(empresa);
        char opcion;

        do {
        	
            io.mostrarMenu();
            opcion = io.obtenerOpcion();
            
            switch (opcion) {
            
                case 'a':
                	
                    Cliente nuevoCliente = io.obtenerDatosCliente();
                    empresa.agregarCliente(nuevoCliente);
                    System.out.println("Cliente añadido con éxito.");
                    break;
                    
                case 'b':
                	
                    Empleado nuevoEmpleado = io.obtenerDatosEmpleado();
                    empresa.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado añadido con éxito.");
                    break;
                    
                case 'c':
                	
                    Vehiculo nuevoVehiculo = io.obtenerDatosVehiculo();
                    empresa.agregarVehiculo(nuevoVehiculo);
                    System.out.println("Vehículo añadido con éxito.");
                    break;
                    
                case 'd':
                	
                    Camion nuevoCamion = io.obtenerDatosCamion();
                    empresa.agregarVehiculo(nuevoCamion);
                    System.out.println("Camión añadido con éxito.");
                    break;
                    
                case 'e':
                	
                    Cliente clienteReserva = io.obtenerClienteParaReserva();
                    Vehiculo vehiculoReserva = io.obtenerVehiculoParaReserva();
                    
                    if (clienteReserva != null && vehiculoReserva != null) {
                    	
                        System.out.println("Reserva realizada con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR en la reserva.");
                        
                    }
                    break;
                    
                case 'f':
                	
                    Cliente clienteDevolucion = io.obtenerClienteParaDevolucion();
                    
                    if (clienteDevolucion != null) {
                    	
                        System.out.println("Vehículo devuelto con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR en la devolución.");
                        
                    }
                    break;
                    
                case 'g':
                	
                    System.out.println("Generando archivo JSON...");
                    io.generarArchivoJSON("datos_empresa.json");
                    break;
                    
                case 'h':
                	
                    System.out.println("Leyendo archivo JSON...");
                    io.leerArchivoJSON("datos_empresa.json");
                    break;
                    
                case 'i':
                	
                    System.out.println("Saliendo del sistema.");
                    break;
                    
                default:
                	
                    System.out.println("Opción no válida. Intente de nuevo.");
                    
            }
            
        } while (opcion != 'i');
        
    }
    
}























