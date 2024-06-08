package modelo;

public class Coche extends Vehiculo {

    private int plazas, puertas, volumenMaletero;
    private String tipo;

    public Coche(String matricula, String modelo, String marca, boolean isDisponible, int plazas, int puertas, int volumenMaletero, String tipo, int kmsRecorridos, String tipoMotor) {

        super(matricula, modelo, marca, isDisponible, kmsRecorridos, tipoMotor);
        this.plazas = plazas;
        this.puertas = puertas;
        this.volumenMaletero = volumenMaletero;
        this.tipo = tipo;

    }

    public int getPlazas() { return plazas; }
    public int getPuertas() { return puertas; }
    public int getVolumenMaletero() { return volumenMaletero; }
    public String getTipo() { return tipo; }

    public void setPlazas(int plazas) { this.plazas = plazas; }
    public void setPuertas(int puertas) { this.puertas = puertas; }
    public void setVolumenMaletero(int volumenMaletero) { this.volumenMaletero = volumenMaletero; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {

        return "COCHE [matricula=" + matricula 
                + ", modelo=" + modelo 
                + ", marca=" + marca 
                + ", plazas=" + plazas 
                + ", puertas=" + puertas 
                + ", volumen del maletero=" + volumenMaletero 
                + ", tipo=" + tipo 
                + ", kms recorridos=" + kmsRecorridos
                + ", tipo de motor=" + tipoMotor 
                + ", precio por dia=" + precioDia + "]";
        
    }
    

}