package modelo;

public class Vehiculo {
    
    protected String matricula, modelo, marca, tipoMotor;
    protected boolean isDisponible;
    protected int kmsRecorridos;
    protected float precioDia;

    public Vehiculo(String matricula, String modelo, String marca, boolean isDisponible, int kmsRecorridos, String tipoMotor) {
        
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.isDisponible = isDisponible;
        this.kmsRecorridos = kmsRecorridos;
        this.tipoMotor = tipoMotor;
        
    }

    public String getMatricula() { return matricula; }
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public boolean isDisponible() { return isDisponible; }
    public int getKmsRecorridos() { return kmsRecorridos; }
    public String getTipoMotor() { return tipoMotor; }
    public float getPrecioDia() { return precioDia; }

    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setDisponible(boolean isDisponible) { this.isDisponible = isDisponible; }
    public void setKmsRecorridos(int kmsRecorridos) { this.kmsRecorridos = kmsRecorridos; }
    public void setTipoMotor(String tipoMotor) { this.tipoMotor = tipoMotor; }
    public void setPrecioDia(float precioDia) { this.precioDia = precioDia; }

}

