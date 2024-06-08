package modelo.interfaces;

import modelo.Cliente;
import modelo.Vehiculo;

public interface GestorReservas {
    
    public void crearReserva(Cliente cliente, Vehiculo vehiculo);
    public Cliente buscarReservaDni(String dni);
    public Vehiculo buscarReservaMatricula(String matricula);
    public void cerrarReserva(String dni);
    
}
