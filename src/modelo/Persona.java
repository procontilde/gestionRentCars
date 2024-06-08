package modelo;

public abstract class Persona {

    protected String dni, nombre, apellidos, mail, tlf, direccion;

    public Persona(String dni, String nombre, String apellidos, String mail, String tlf, String direccion) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.tlf = tlf;
        this.direccion = direccion;

    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getMail() { return mail; }
    public String getTlf() { return tlf; }
    public String getDireccion() { return direccion; }

    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setMail(String mail) { this.mail = mail; }
    public void setTlf(String tlf) { this.tlf = tlf; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
    	
        return "PERSONA [dni=" + dni 
                + ", nombre=" + nombre 
                + ", apellidos=" + apellidos 
                + ", mail=" + mail 
                + ", tlf=" + tlf 
                + ", direccion=" + direccion + "]";
        
    }

}
