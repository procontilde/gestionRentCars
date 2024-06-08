package modelo;

import java.time.LocalTime;

public class Empleado extends Persona {

    private String numSS, puesto;
    private float salario, horasTrabajadas; 

    public Empleado(String dni, String nombre, String apellidos, String mail, String tlf, String direccion, String numSS, String puesto, float salario) {
    	
        super(dni, nombre, apellidos, mail, tlf, direccion);
        this.numSS = numSS;
        this.puesto = puesto;
        this.salario = salario;
        this.horasTrabajadas = 0;
        
    }

    public String getNumSS() { return numSS; }
    public String getPuesto() { return puesto; }
    public float getSalario() { return salario; }
    public float getHorasTrabajadas() { return horasTrabajadas; }

    public void setNumSS(String numSS) { this.numSS = numSS; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(float salario) { this.salario = salario; }

    public void registrarEntrada(LocalTime horaEntrada) {

        LocalTime horaActual = LocalTime.now();

        long diferenciaHoras = horaActual.getHour() - horaEntrada.getHour();

        horasTrabajadas += diferenciaHoras;
        
    }

    public void registrarSalida(LocalTime horaSalida) {

        LocalTime horaActual = LocalTime.now();

        long diferenciaHoras = horaActual.getHour() - horaSalida.getHour();

        horasTrabajadas += diferenciaHoras;
        
    }

    @Override
    public String toString() {
    	
        return "EMPLEADO [numSS=" + numSS 
                + ", puesto=" + puesto 
                + ", salario=" + salario 
                + ", DNI=" + dni
                + ", nombre=" + nombre 
                + ", apellidos=" + apellidos 
                + ", email=" + mail 
                + ", teléfono=" + tlf 
                + ", direccion=" + direccion + "]";
        
    }
    
}