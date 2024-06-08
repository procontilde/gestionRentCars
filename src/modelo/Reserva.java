package modelo;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fechaReserva;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Reserva(LocalDate fechaReserva, Cliente cliente, Vehiculo vehiculo) {

        this.fechaReserva = fechaReserva;
        this.cliente = cliente;
        this.vehiculo = vehiculo;

    }

    public LocalDate getFechaReserva() { return fechaReserva; }
    public Cliente getCliente() { return cliente; }
    public Vehiculo getVehiculo() { return vehiculo; }

    public void setFechaReserva(LocalDate fechaReserva) { this.fechaReserva = fechaReserva; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    @Override
    public String toString() {

        return "RESERVA [fecha de reserva=" + fechaReserva 
                + ", cliente=" + cliente 
                + ", vehiculo=" + vehiculo + "]";

    }

}