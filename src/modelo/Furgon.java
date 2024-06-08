package modelo;

public class Furgon extends Vehiculo {
    
    private float cargaMaxima;
    private int plazas;

    public Furgon(String matricula, String modelo, String marca, boolean isDisponible, float cargaMaxima, int plazas, int kmsRecorridos, String tipoMotor) {
        
        super(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazas = plazas;
        
    }

    public float getCargaMaxima() { return cargaMaxima; }
    public int getPlazas() { return plazas; }

    public void setCargaMaxima(float cargaMaxima) { this.cargaMaxima = cargaMaxima; }
    public void setPlazas(int plazas) { this.plazas = plazas; }

    @Override
    public String toString() {
        
        return "Furgon [Matrícula=" + matricula 
                + ", marca=" + marca
                + ", modelo=" + modelo
                + ", carga máxima=" + cargaMaxima 
                + ", plazas=" + plazas 
                + ", precio/día=" + precioDia 
                + ", disponible=" + isDisponible + "]";
    
    }

}

