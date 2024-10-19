package co.edu.uniquindio.clinica.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import co.edu.uniquindio.clinica.modelo.Cita;

public class FacturaControlador {

    @FXML
    private Label txtPaciente, txtServicio, txtFecha, txtPrecioTotal;

    public void cargarFactura(Cita cita) {
        txtPaciente.setText(cita.getPaciente().getNombre());
        txtServicio.setText(cita.getServicio().getNombre());
        txtFecha.setText(cita.getFecha().toString());
        txtPrecioTotal.setText(String.valueOf(cita.calcularPrecioTotal()));
    }
}
