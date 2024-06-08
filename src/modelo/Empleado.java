package modelo;

public class Empleado extends Persona {
    
    private String numSS, puesto;
    private float salario;
    
    public Empleado(String dni, String nombre, String apellidos, String mail, String tlf, String direccion, String numSS, String puesto, float salario) {
        
        super(dni, nombre, apellidos, mail, tlf, direccion);
        this.numSS = numSS;
        this.puesto = puesto;
        this.salario = salario;
        
    }

    public String getNumSS() { return numSS; }
    public String getPuesto() { return puesto; }
    public float getSalario() { return salario; }

    public void setNumSS(String numSS) { this.numSS = numSS; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(float salario) { this.salario = salario; }

    @Override
    public String toString() {
        
        return "Empleado [numSS=" + numSS 
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
