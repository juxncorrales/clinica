package co.edu.uniquindio.clinica.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import co.edu.uniquindio.clinica.modelo.Cita;

public class FacturaControlador {

    @FXML
    private Label txtPaciente, txtServicio, txtFecha, txtPrecioTotal;

    // Método que recibe una cita y muestra los detalles en la vista
    public void cargarFactura(Cita cita) {
        txtPaciente.setText(cita.getPaciente().getNombre());  // Mostrar nombre del paciente
        txtServicio.setText(cita.getServicio().getNombre());  // Mostrar nombre del servicio
        txtFecha.setText(cita.getFecha().toString());         // Mostrar fecha de la cita
        txtPrecioTotal.setText(String.valueOf(cita.calcularPrecioTotal())); // Mostrar precio total calculado
    }
}
