package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa {

	private List<Cliente> misClientes;
	private List<Vehiculo> misVehiculos;
	private List<Empleado> misEmpleados;
	private Map<Integer, Reserva> mapaReservas;
	
	public Empresa() {
	
		this.misClientes = new ArrayList<>();
		this.misVehiculos = new ArrayList<>();
		this.misEmpleados = new ArrayList<>();
		this.mapaReservas = new HashMap<>();
	
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
	
		if(empleado != null && !misEmpleados.contains(empleado)) this.misEmpleados.add(empleado);
	
	}
	
	public Cliente buscarClientePorDni(String dni) {
	
		for (Cliente cliente : misClientes) if (cliente.getDni().equals(dni)) return cliente;
		return null;
	
	}
	
	public Vehiculo buscarVehiculoPorMatricula(String matricula) {
	
		for (Vehiculo vehiculo : misVehiculos) if (vehiculo.getMatricula().equals(matricula)) return vehiculo;
		return null;
		
	}
	
	public boolean agregarReserva(int numeroReserva, Reserva reserva) {
	
		if (reserva != null && !mapaReservas.containsKey(numeroReserva)) {
			
		    mapaReservas.put(numeroReserva, reserva);
		    
		    return true;
		    
		}
		
		return false;
	
	}
	
	
	public Reserva encontrarReserva(int numeroReserva) {
	
		return mapaReservas.get(numeroReserva);
	
	}
	
	public boolean actualizarReserva(int numeroReserva, Reserva nuevaReserva) {
	
		if (mapaReservas.containsKey(numeroReserva) && nuevaReserva != null) {
			
		    mapaReservas.put(numeroReserva, nuevaReserva);
		    return true;
		    
		}
		
		return false;
		
	}
	
	public boolean eliminarReserva(int numeroReserva) {
	
		if (mapaReservas.containsKey(numeroReserva)) {
			
		    mapaReservas.remove(numeroReserva);
		    return true;
		    
		}
		
		return false;
	
	}

}


