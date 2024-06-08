package vista;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Vehiculo;

import java.util.Scanner;

public class IORentACar {

    private Scanner miScan = new Scanner(System.in);

    public void mostrarMenu() {
    	
        System.out.println("MENÚ\nElija entre las siguientes opciones:\na. Añadir Cliente\nb. Añadir Empleado\nc. Añadir Vehículo\nd. Realizar Reserva\ne. Devolver Vehículo\nf. Salir");
       
    }

    public char obtenerOpcion() {
    	
        System.out.print("Seleccione una opción: ");
        return miScan.nextLine().charAt(0);
        
    }

    public Cliente obtenerDatosCliente() {
    	
        System.out.print("DNI: ");
        String dni = miScan.nextLine();
        System.out.print("Nombre: ");
        String nombre = miScan.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = miScan.nextLine();
        System.out.print("Email: ");
        String email = miScan.nextLine();
        System.out.print("Teléfono: ");
        String telefono = miScan.nextLine();
        System.out.print("Dirección: ");
        String direccion = miScan.nextLine();
        System.out.print("Tarjeta de crédito: ");
        String tarjetaCredito = miScan.nextLine();

        return new Cliente(dni, nombre, apellidos, email, telefono, direccion, tarjetaCredito);
    }

    public Empleado obtenerDatosEmpleado() {
        
        System.out.print("DNI: ");
        String dni = miScan.nextLine();
        System.out.print("Nombre: ");
        String nombre = miScan.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = miScan.nextLine();
        System.out.print("Email: ");
        String email = miScan.nextLine();
        System.out.print("Teléfono: ");
        String telefono = miScan.nextLine();
        System.out.print("Dirección: ");
        String direccion =miScan.nextLine();
        System.out.print("Número de Seguridad Social: ");
        String numSS = miScan.nextLine();
        System.out.print("Puesto: ");
        String puesto = miScan.nextLine();
        System.out.print("Salario: ");
        float salario = Float.valueOf(miScan.nextLine());

        return new Empleado(dni, nombre, apellidos, email, telefono, direccion, numSS, puesto, salario);
        
    }

    public Vehiculo obtenerDatosVehiculo() {
        
        System.out.print("Matrícula: ");
        String matricula = miScan.nextLine();
        System.out.print("Modelo: ");
        String modelo = miScan.nextLine();
        System.out.print("Marca: ");
        String marca = miScan.nextLine();
        System.out.print("¿Está disponible? (TRUE/FALSE): ");
        boolean isDisponible = miScan.nextBoolean();
        System.out.print("Kilómetros recorridos: ");
        int kmsRecorridos = Integer.valueOf(miScan.nextLine());
        System.out.print("Tipo de motor: ");
        String tipoMotor = miScan.nextLine();
        
        return new Vehiculo(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        
    }


    public String obtenerMatriculaVehiculo() {
    	
        System.out.print("Introduce la matrícula del vehículo: ");
        return miScan.nextLine();
        
    }

    public String obtenerDniCliente() {
    	
        System.out.print("Introduce el DNI del cliente: ");
        return miScan.nextLine();
        
    }
    
}
