package modelo.interfaces;

import modelo.Cliente;

public interface GestorCliente {
	
    public boolean addCliente(Cliente c);
    public boolean findCliente(String dni);
    public boolean removeCliente(String dni);
    
}

