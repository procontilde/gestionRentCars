package modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
    private List<Cliente> misClientes;
    private List<Vehiculo> misVehiculos;
    private List<Empleado> misEmpleados;

    public Empresa() {
    	
        this.misClientes = new ArrayList<>();
        this.misVehiculos = new ArrayList<>();
        this.misEmpleados = new ArrayList<>();
        
    }

    public boolean agregarCliente(Cliente cliente) {
    	
		    	if(cliente != null) {
		    	
		        this.misClientes.add(cliente);
		        
		        return true;
		        
		    	}
		    	
	    return false;
        
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
    	
    		
    		if(vehiculo != null && !misVehiculos.contains(vehiculo)) {
    			
    			this.misVehiculos.add(vehiculo);
    			
    			return true;
        
    		}
    		
    		return false;
        
    }

    public void agregarEmpleado(Empleado empleado) {
    	
    		if(empleado != null && !misEmpleados.contains(empleado))
    	
        this.misEmpleados.add(empleado);
        
    }

    public Cliente buscarClientePorDni(String dni) {
    	
        for (Cliente cliente : misClientes) if (cliente.getDni().equals(dni)) return cliente;
        
        return null;
        
    }

    public Vehiculo buscarVehiculoPorMatricula(String matricula) {
    	
        for (Vehiculo vehiculo : misVehiculos) if (vehiculo.getMatricula().equals(matricula)) return vehiculo;
        
        return null;
        
    }
    
}
