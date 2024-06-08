package modelo;

public class Camion extends Vehiculo {
    
    private float cargaMaxima, longitud;

    public Camion(String matricula, String modelo, String marca, boolean isDisponible, float cargaMaxima, float longitud, int kmsRecorridos, String tipoMotor) {
        
        super(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
        
    }

    public float getCargaMaxima() { return cargaMaxima; }
    public float getLongitud() { return longitud; }

    public void setCargaMaxima(float cargaMaxima) { this.cargaMaxima = cargaMaxima; }
    public void setLongitud(float longitud) { this.longitud = longitud; }

    @Override
    public String toString() {
        
        return "Camion [Matrícula=" + matricula 
                + ", marca=" + marca
                + ", modelo=" + modelo
                + ", carga máxima=" + cargaMaxima 
                + ", longitud=" + longitud 
                + ", precio/día=" + precioDia 
                + ", disponible=" + isDisponible + "]";
    
    }

}
