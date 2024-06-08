package modelo.interfaces;

import modelo.Empleado;

public interface GestorEmpleados {
	
    public boolean altaEmpleado(Empleado e);
    public boolean findEmpleado(String dni);
    public boolean findEmpleado(Empleado e);
    public boolean removeEmpleado(String dni);
    public String crearNomina(Empleado e);
    public float calcularHorasExtra(String dni);
    
}
