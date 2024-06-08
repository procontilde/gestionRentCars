package modelo.interfaces;

import modelo.Empleado;

public interface GestorEmpleados {
    boolean altaEmpleado(Empleado e);
    boolean findEmpleado(String dni);
    boolean findEmpleado(Empleado e);
    boolean removeEmpleado(String dni);
    String crearNomina(Empleado e);
    float calcularHorasExtra(String dni);
}
