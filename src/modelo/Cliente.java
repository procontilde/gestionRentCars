package modelo;

public class Cliente extends Persona {
    
    private String tarjetaCredito;

    public Cliente(String dni, String nombre, String apellidos, String mail, String tlf,
            String direccion, String tarjetaCredito) {
        
        super(dni, nombre, apellidos, mail, tlf, direccion);
        this.tarjetaCredito = tarjetaCredito;
        
    }

    public String getTarjetaCredito() { return tarjetaCredito; }

    public void setTarjetaCredito(String tarjetaCredito) { this.tarjetaCredito = tarjetaCredito; }

    @Override
    public String toString() {
        
        return "CLIENTE [DNI=" + dni 
                + ", nombre=" + nombre 
                + ", apellidos=" + apellidos 
                + ", email=" + mail 
                + ", teléfono=" + tlf 
                + ", dirección=" + direccion
                + ", tarjeta de crédito=" + tarjetaCredito+ "]";
        
    }
    
}

