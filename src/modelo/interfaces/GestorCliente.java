package modelo.interfaces;

import modelo.Cliente;

public interface GestorCliente {
    boolean addCliente(Cliente c);
    boolean findCliente(String dni);
    boolean removeCliente(String dni);
}

