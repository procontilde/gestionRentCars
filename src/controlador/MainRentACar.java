package controlador;

import java.time.LocalDate;
import modelo.*;
import vista.IORentACar;

public class MainRentACar {
    
    private static int contadorReservas = 1;

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
                    
                    if (empresa.agregarCliente(nuevoCliente)) {
                    	
                        System.out.println("Cliente añadido con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR al agregar cliente.");
                        
                    }
                    
                    break;
                    
                case 'b':
                	
                    Empleado nuevoEmpleado = io.obtenerDatosEmpleado();
                    empresa.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado añadido con éxito.");
                    break;
                    
                case 'c':
                	
                    Vehiculo nuevoVehiculo = io.obtenerDatosVehiculo();
                    
                    if (empresa.agregarVehiculo(nuevoVehiculo)) {
                    	
                        System.out.println("Vehículo añadido con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR al agregar vehículo.");
                        
                    }
                    
                    break;
                    
                case 'd':
                	
                    Camion nuevoCamion = io.obtenerDatosCamion();
                    
                    if (empresa.agregarVehiculo(nuevoCamion)) {
                    	
                        System.out.println("Camión añadido con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR al agregar camión.");
                        
                    }
                    
                    break;
                    
                case 'e':
                	
                    Cliente clienteReserva = io.obtenerClienteParaReserva();
                    Vehiculo vehiculoReserva = io.obtenerVehiculoParaReserva();
                    
                    if (clienteReserva != null && vehiculoReserva != null) {
                    	
                        int numeroReserva = generarNumeroReserva();                        
                        Reserva reserva = new Reserva(LocalDate.now(), clienteReserva, vehiculoReserva);
                        boolean exito = empresa.agregarReserva(numeroReserva, reserva); 
                        
                        if (exito) {
                        	
                            System.out.println("Reserva realizada con éxito.");
                            
                        } else {
                        	
                            System.out.println("ERROR al realizar la reserva.");
                            
                        }
                        
                    } else {
                    	
                        System.out.println("ERROR. Cliente o vehículo no encontrado.");
                        
                    }
                    
                    break;

                case 'f':
                	
                    Cliente clienteDevolucion = io.obtenerClienteParaDevolucion();
                    
                    if (clienteDevolucion != null) {
                    	
                        Vehiculo vehiculoDevolucion = io.encontrarVehiculoParaDevolucion();
                        
                        if (vehiculoDevolucion != null) {
                        	
                            vehiculoDevolucion.devolver(); 
                            System.out.println("Vehículo devuelto con éxito.");
                            
                        } else {
                        	
                            System.out.println("No se ha seleccionado un vehículo para devolver.");
                            
                        }
                        
                    } else {
                    	
                        System.out.println("ERROR. Cliente no encontrado.");
                        
                    }
                    
                    break;
                    
                case 'g':
                	
                    if (io.eliminarCliente()) {
                    	
                        System.out.println("Cliente eliminado con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR al eliminar cliente.");
                        
                    }
                    
                    break;
                    
                case 'h':
                	
                    Cliente clienteEncontrado = io.buscarCliente();
                    
                    if (clienteEncontrado != null) {
                    	
                        System.out.println("Cliente encontrado: " + clienteEncontrado);
                        
                    }
                    
                    break;
                    
                case 'i':
                	
                    if (io.eliminarEmpleado()) {
                    	
                        System.out.println("Empleado eliminado con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR al eliminar empleado.");
                        
                    }
                    
                    break;
                    
                case 'j':
                	
                    Empleado empleadoEncontrado = io.buscarEmpleado();
                    
                    if (empleadoEncontrado != null) {
                    	
                        System.out.println("Empleado encontrado: " + empleadoEncontrado);
                        
                    }
                    
                    break;
                    
                case 'k':
                	
                    if (io.eliminarVehiculo()) {
                    	
                        System.out.println("Vehículo eliminado con éxito.");
                        
                    } else {
                    	
                        System.out.println("ERROR al eliminar vehículo.");
                        
                    }
                    
                    break;
                    
                case 'l':
                	
                    Vehiculo vehiculoEncontrado = io.buscarVehiculo();
                    
                    if (vehiculoEncontrado != null) {
                    	
                        System.out.println("Vehículo encontrado: " + vehiculoEncontrado);
                        
                    }
                    
                    break;
                    
                case 'm':
                	
                    io.generarArchivoJSON("datos_empresa.json");
                    break;
                    
                case 'n':
                	
                    io.leerArchivoJSON("datos_empresa.json");
                    break;
                    
                case 'o':
                	
                    break;
                    
                default:
                	
                    System.out.println("Introduzca una opción válida");
                    
            }
            
        } while (opcion != 'o');
        
    }
    
    private static int generarNumeroReserva() {
    	
        return contadorReservas++;
        
    }
    
}
