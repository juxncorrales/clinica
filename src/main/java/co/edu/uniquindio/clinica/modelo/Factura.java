package co.edu.uniquindio.clinica.modelo;

import co.edu.uniquindio.clinica.modelo.factory.Suscripcion;

public class Factura {

    private Cita cita;
    private double total;

    public Factura(Cita cita) {
        this.cita = cita;
        calcularTotal();
    }

    // Método que calcula el total a pagar según la suscripción
    private void calcularTotal() {
        Suscripcion suscripcion = cita.getPaciente().getSuscripcion();
        this.total = suscripcion.calcularPrecio(cita.getServicio().getPrecio());
    }

    // Getters y Setters
    public Cita getCita() { return cita; }
    public void setCita(Cita cita) { this.cita = cita; }

    public double getTotal() { return total; }
}
