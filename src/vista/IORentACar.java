package vista;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Empresa;
import modelo.Vehiculo;
import modelo.Camion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class IORentACar {

    private Scanner miScan;
    private Empresa empresa;

    public IORentACar(Empresa empresa) {
    	
        this.empresa = empresa;
        this.miScan = new Scanner(System.in);
        
    }

    public void mostrarMenu() {
    	
        System.out.println("MENÚ\nElija una de las siguientes opciones:\n" 
        			+ "a. Añadir Cliente\n" 
        			+ "b. Añadir Empleado\n" 
        			+ "c. Añadir Vehículo\n" 
        			+ "d. Añadir Camión\n" 
        			+ "e. Realizar Reserva\n" 
        			+ "f. Devolver Vehículo\n" 
        			+ "g. Salir");
        
    }

    public char obtenerOpcion() {
    	
        System.out.print("Seleccione una opción: ");
        return miScan.nextLine().charAt(0);
        
    }

    public Cliente obtenerDatosCliente() {
    	
        System.out.print("Introduzca el DNI: ");
        String dni = miScan.nextLine();
        System.out.print("Introduzca el nombre: ");
        String nombre = miScan.nextLine();
        System.out.print("Introduzca los apellidos: ");
        String apellidos = miScan.nextLine();
        System.out.print("Introduzca el email: ");
        String email = miScan.nextLine();
        System.out.print("Introduzca el teléfono: ");
        String telefono = miScan.nextLine();
        System.out.print("Introduzca la dirección: ");
        String direccion = miScan.nextLine();
        System.out.print("Introduzca el número de la tarjeta de crédito: ");
        String tarjetaCredito = miScan.nextLine();

        return new Cliente(dni, nombre, apellidos, email, telefono, direccion, tarjetaCredito);
        
    }

    public Empleado obtenerDatosEmpleado() {
    
        System.out.print("Introduzca el DNI: ");
        String dni = miScan.nextLine();
        System.out.print("Introduzca el nombre: ");
        String nombre = miScan.nextLine();
        System.out.print("Introduzca los apellidos: ");
        String apellidos = miScan.nextLine();
        System.out.print("Introduzca el email: ");
        String email = miScan.nextLine();
        System.out.print("Introduzca el teléfono: ");
        String telefono = miScan.nextLine();
        System.out.print("Introduzca la dirección: ");
        String direccion = miScan.nextLine();
        System.out.print("Número de Seguridad Social: ");
        String numSS = miScan.nextLine();
        System.out.print("Introduzca el puesto: ");
        String puesto = miScan.nextLine();
        System.out.print("Introduzca el salario: ");
        float salario = Float.parseFloat(miScan.nextLine());

        return new Empleado(dni, nombre, apellidos, email, telefono, direccion, numSS, puesto, salario);
        
    }

    public Vehiculo obtenerDatosVehiculo() {
    	
        System.out.print("Introduzca la matrícula: ");
        String matricula = miScan.nextLine();
        System.out.print("Introduzca el  modelo: ");
        String modelo = miScan.nextLine();
        System.out.print("Introduzca la marca: ");
        String marca = miScan.nextLine();
        System.out.print("¿Está disponible? (TRUE/FALSE): ");
        boolean isDisponible = Boolean.parseBoolean(miScan.nextLine());
        System.out.print("Introduzca los kilómetros recorridos: ");
        int kmsRecorridos = Integer.parseInt(miScan.nextLine());
        System.out.print("Introduzca el tipo de motor: ");
        String tipoMotor = miScan.nextLine();

        return new Vehiculo(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        
    }

    public Camion obtenerDatosCamion() {
    	
        System.out.print("Introduzca la matrícula: ");
        String matricula = miScan.nextLine();
        System.out.print("Introduzca el  modelo: ");
        String modelo = miScan.nextLine();
        System.out.print("Introduzca la marca: ");
        String marca = miScan.nextLine();
        System.out.print("¿Está disponible? (TRUE/FALSE): ");
        boolean isDisponible = Boolean.parseBoolean(miScan.nextLine());
        System.out.print("Introduzca los kilómetros recorridos: ");
        int kmsRecorridos = Integer.parseInt(miScan.nextLine());
        System.out.print("Introduzca el tipo de motor: ");
        String tipoMotor = miScan.nextLine();
        System.out.print("Introduzca la capacidad de carga: ");
        double capacidadCarga = Double.parseDouble(miScan.nextLine());
        System.out.print("Introduzca el número de ejes: ");
        int numeroEjes = Integer.parseInt(miScan.nextLine());

        return new Camion(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor, capacidadCarga, numeroEjes);
        
    }

    public String obtenerMatriculaVehiculo() {
    	
        System.out.print("Introduzca la matrícula del vehículo: ");
        return miScan.nextLine();
        
    }

    public String obtenerDniCliente() {
    	
        System.out.print("Introduzca el DNI del cliente: ");
        return miScan.nextLine();
        
    }

    public Cliente obtenerClienteParaDevolucion() {
    	
        System.out.println("Ingrese el DNI del cliente para la devolución del vehículo:");
        String dni = miScan.nextLine();
        Cliente cliente = empresa.buscarClientePorDni(dni);
        
        if (cliente == null) System.out.println("ERROR. Cliente no encontrado.");
            
        return cliente;
        
    }

    public Cliente obtenerClienteParaReserva() {
    	
        System.out.println("Ingrese el DNI del cliente para la reserva:");
        String dni = miScan.nextLine();
        Cliente cliente = empresa.buscarClientePorDni(dni);
        
        if (cliente == null) System.out.println("ERROR. Cliente no encontrado.");
        
        return cliente;
        
    }

    public Vehiculo obtenerVehiculoParaReserva() {
    	
        System.out.println("Ingrese la matrícula del vehículo para la reserva:");
        String matricula = miScan.nextLine();
        Vehiculo vehiculo = empresa.buscarVehiculoPorMatricula(matricula);
        
        if (vehiculo == null)  System.out.println("ERROR. Vehículo no encontrado.");
        
        return vehiculo;
        
    }
    
    public void generarArchivoJSON(String path) {
    	
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try (FileWriter writer = new FileWriter(path)) {
        	
            gson.toJson(empresa, writer);
            System.out.println("Archivo JSON generado correctamente en: " + path);
            
        } catch (IOException e) {
        	
            System.err.println("ERROR al generar el archivo JSON: " + e.getMessage());
            
        }
    }

    public void leerArchivoJSON(String path) {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            empresa = gson.fromJson(reader, Empresa.class);
            System.out.println("Datos cargados desde el archivo JSON en: " + path);
        } catch (IOException e) {
            System.err.println("ERROR al leer el archivo JSON: " + e.getMessage());
        }
    }
}
