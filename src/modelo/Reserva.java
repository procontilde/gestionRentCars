package modelo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Reserva {
    
    private LocalDateTime fechaInicio, fechaEntrega;
    private int diasPrevistos, diasRetraso;
    private float tasaRecargo, recargoKms;
    private Vehiculo vehiculo;
    private Cliente cliente;
    
    public Reserva(Vehiculo v, Cliente c, int diasPrevistos) {
        
        this.diasPrevistos = diasPrevistos;
        this.vehiculo = v;
        this.cliente = c;
        this.fechaInicio = LocalDateTime.now();
        this.fechaEntrega = null;
        this.diasRetraso = 0;
        this.tasaRecargo = 0.2f;
        this.recargoKms = 0.2f;
        
    }
    
    public LocalDateTime fechaHora() {
        
        fechaInicio = LocalDateTime.now();
        
        return fechaInicio;
        
    }
    
    public int diffFechas() {
        
        fechaEntrega = LocalDateTime.now();
        int diasRetraso = (int)ChronoUnit.DAYS.between(fechaInicio, fechaEntrega);
        
        return diasRetraso;
        
    }
    
    public int diasExtras() {
        
        int diasExtra = this.diffFechas() - diasPrevistos;
        
        return diasExtra;
        
    }
    
    public float calcularFactura(int kms) {
        
        float totalFactura = 0;
        
        if (vehiculo != null && diasPrevistos != 0) {
            
            int diasAlquiler = (int) ChronoUnit.DAYS.between(fechaInicio, fechaEntrega);
            int diasRetraso = diasAlquiler - diasPrevistos;
            
            if (diasRetraso <= 0) {
            	
                totalFactura = vehiculo.getPrecioDia() * diasPrevistos;
            
            } else {
            
            		float cargoExtra = diasRetraso * tasaRecargo;
                totalFactura = vehiculo.getPrecioDia() * diasPrevistos + cargoExtra;
            
            }
            
            if (kms > 500 * diasPrevistos) {
            
            		totalFactura += (kms - 500 * diasPrevistos) * recargoKms;
            
            }
            
            return totalFactura;
            
        }
        
        return totalFactura;
        
    }

    public LocalDateTime getFechaInicio() { return fechaInicio; }
    public LocalDateTime getFechaEntrega() { return fechaEntrega; }
    public int getDiasPrevistos() { return diasPrevistos; }
    public int getDiasRetraso() { return diasRetraso; }

    public void setFechaInicio(LocalDateTime fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaEntrega(LocalDateTime fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public void setDiasPrevistos(int diasPrevistos) { this.diasPrevistos = diasPrevistos; }
    public void setDiasRetraso(int diasRetraso) { this.diasRetraso = diasRetraso; }
    
    public String emitirFactura() {
        
        return "Factura: " +
               "\nCliente: " + cliente.getNombre() + " " + cliente.getApellidos() +
               "\nVehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
               "\nFecha Inicio: " + fechaInicio +
               "\nFecha Entrega: " + fechaEntrega +
               "\nDías Previstos: " + diasPrevistos +
               "\nDías de Retraso: " + diasRetraso +
               "\nTotal: " + calcularFactura(vehiculo.getKmsRecorridos());
        
    }

}
