package modelo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String matricula, String modelo, String marca, boolean isDisponible, int kmsRecorridos, String tipoMotor, double capacidadCarga, int numeroEjes) {
    	
        super(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        
    }

    public double getCapacidadCarga() { return capacidadCarga; }
    public int getNumeroEjes() { return numeroEjes; }

    public void setNumeroEjes(int numeroEjes) { this.numeroEjes = numeroEjes; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    @Override
    public String toString() {
    	
        return "CAMION [matricula='" + getMatricula() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", isDisponible=" + isDisponible() +
                ", kmsRecorridos=" + getKmsRecorridos() +
                ", tipoMotor='" + getTipoMotor() + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                ']';
        
    }
    
}
