package modelo;

public class Furgon extends Vehiculo {

    private int capacidadCarga, volumenCarga;
    private String tipoCarga;

    public Furgon(String matricula, String modelo, String marca, boolean isDisponible, int kmsRecorridos, int capacidadCarga, int volumenCarga, String tipoCarga, String tipoMotor) {

        super(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        this.capacidadCarga = capacidadCarga;
        this.volumenCarga = volumenCarga;
        this.tipoCarga = tipoCarga;

    }

    public int getCapacidadCarga() { return capacidadCarga; }
    public int getVolumenCarga() { return volumenCarga; }
    public String getTipoCarga() { return tipoCarga; }

    public void setCapacidadCarga(int capacidadCarga) { this.capacidadCarga = capacidadCarga; }
    public void setVolumenCarga(int volumenCarga) { this.volumenCarga = volumenCarga; }
    public void setTipoCarga(String tipoCarga) { this.tipoCarga = tipoCarga; }

    @Override
    public String toString() {

        return "FURGON [matricula=" + matricula 
                + ", modelo=" + modelo 
                + ", marca=" + marca 
                + ", capacidad de carga=" + capacidadCarga 
                + ", volumen de carga=" + volumenCarga 
                + ", tipo de carga=" + tipoCarga
                + ", kms recorridos=" + kmsRecorridos
                + ", tipo de motor=" + tipoMotor 
                + ", precio por dia=" + precioDia + "]";
        
    }

}
