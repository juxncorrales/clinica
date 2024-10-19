package co.edu.uniquindio.clinica.controladores;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FacturaControlador {

    @FXML
    private Text txtServicio;

    @FXML
    private Text txtFecha;

    @FXML
    private Text txtPaciente;

    @FXML
    private Text txtSubtxtPrecioTotalTotal;

    // Método para inicializar los datos de la factura
    public void setDatosFactura(String servicio, String fecha, String paciente, double precioTotal) {
        txtServicio.setText(servicio);
        txtFecha.setText(fecha);
        txtPaciente.setText(paciente);
        txtSubtxtPrecioTotalTotal.setText(String.format("$%.2f", precioTotal));
    }

    @FXML
    public void initialize() {
        // Puedes agregar código para inicializar algo por defecto si es necesario
    }
}
