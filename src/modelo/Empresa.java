package modelo;

import java.util.*;

import modelo.interfaces.GestorCliente;
import modelo.interfaces.GestorEmpleados;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Empresa implements GestorCliente, GestorEmpleados {
    
    private String nombre, descripcion, nif, direccion, tlf, mail, categoria;
    private Map<String, Cliente> mapaClientes;
    private Map<String, Empleado> mapaEmpleados;
    private List<Vehiculo> listaVehiculos;
    private Map<Vehiculo, Cliente> mapaReservas;

    public Empresa(String nombre, String descripcion, String nif, String direccion, String tlf, String mail, String categoria) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nif = nif;
        this.direccion = direccion;
        this.tlf = tlf;
        this.mail = mail;
        this.categoria = categoria;
        this.mapaClientes = new HashMap<>();
        this.mapaEmpleados = new HashMap<>();
        this.listaVehiculos = new ArrayList<>();
        this.mapaReservas = new HashMap<>();
        
    }

    // GESTIÓN DE EMPLEADOS
    @Override
    public boolean altaEmpleado(Empleado e) {
        
        if(e != null && !this.findEmpleado(e)) {
            
            mapaEmpleados.put(e.getDni(), e);
            
            return true;
            
        }
        
        return false;
    
    }

    @Override
    public boolean findEmpleado(String dni) {
        
        if(dni != null &&  mapaEmpleados.containsKey(dni)) return true;
    
        return false;
    
    }
    
    @Override
    public boolean findEmpleado(Empleado e) {
        
        if(e != null &&  mapaEmpleados.containsValue(e)) return true;
    
        return false;
    
    }

    @Override
    public boolean removeEmpleado(String dni) {
    
        if(dni != null && this.findEmpleado(dni)) {
            
            mapaEmpleados.remove(dni);
            
            return true;
            
        }
        
        return false;
    
    }

    @Override
    public String crearNomina(Empleado e) {
        
        if(e != null && this.findEmpleado(e)) {
            
            return "DNI: " + e.getDni() + "\nNOMBRE: " + e.getNombre() + "\nAPELLIDOS: " + e.getApellidos() + "\nEMAIL: " +  e.getMail() + "\nTELÉFONO: " + e.getTlf() + "\nDIRECCIÓN: " + e.getDireccion() + "\nNÚMERO DE SEGURIDAD SOCIAL: " +  e.getNumSS() + "\nPUESTO: " + e.getPuesto() + "\nSALARIO: " + e.getSalario();
            
        }
    
        return null;
    
    }

    @Override
    public float calcularHorasExtra(String dni) {
    
        return 0;
    
    }

    // GESTIÓN DE CLIENTES
    @Override
    public boolean addCliente(Cliente c) {
    	
        if (c != null && !this.findCliente(c.getDni())) {
        	
            mapaClientes.put(c.getDni(), c);
            return true;
            
        }
        
        return false;
        
    }

    @Override
    public boolean findCliente(String dni) {
    	
        if (dni != null && mapaClientes.containsKey(dni)) return true;
        return false;
        
    }

    @Override
    public boolean removeCliente(String dni) {
    	
        if (dni != null && this.findCliente(dni)) {
        	
            mapaClientes.remove(dni);
            return true;
            
        }
        
        return false;
        
    }

    public boolean addVehiculo(Vehiculo v) {
    	
        if (v != null && listaVehiculos.stream().noneMatch(vehicle -> vehicle.getMatricula().equals(v.getMatricula()))) {
        	
            listaVehiculos.add(v);
            return true;
            
        }
        
        return false;
        
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getNif() { return nif; }
    public String getDireccion() { return direccion; }
    public String getTlf() { return tlf; }
    public String getMail() { return mail; }
    public String getCategoria() { return categoria; }

}

