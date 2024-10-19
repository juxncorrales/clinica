package co.edu.uniquindio.clinica.modelo;

import java.time.LocalDateTime;

public class Cita {

    private int id;
    private LocalDateTime fecha;
    private Paciente paciente;
    private Servicio servicio;

    // Constructor
    public Cita(int id, LocalDateTime fecha, Paciente paciente, Servicio servicio) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
        this.servicio = servicio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    // Método para calcular el precio total de la cita
    public double calcularPrecioTotal() {
        // Retorna el precio del servicio asociado a la cita
        return servicio.getPrecio();
    }
}
