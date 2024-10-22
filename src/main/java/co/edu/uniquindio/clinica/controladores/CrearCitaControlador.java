package co.edu.uniquindio.clinica.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import java.time.LocalDate;

public class CrearCitaControlador extends AbstractControlador {

    @FXML
    private TextField pacientetxt, horatxt;

    @FXML
    private ComboBox<String> comboServicio;

    @FXML
    private DatePicker fechaDate;

    @FXML
    private Button btnconfirmarCita;

    @FXML
    public void initialize() {
        // Inicializar el ComboBox con algunos servicios de ejemplo
        comboServicio.getItems().addAll("Consulta General", "Odontología", "Cardiología");
    }

    // Método que se ejecuta cuando el usuario selecciona un servicio en el ComboBox
    @FXML
    private void seleccionarServicio(ActionEvent event) {
        String servicioSeleccionado = comboServicio.getValue();
        System.out.println("Servicio seleccionado: " + servicioSeleccionado);
    }

    // Método que se ejecuta cuando el usuario selecciona una fecha en el DatePicker
    @FXML
    private void seleccionarFecha(ActionEvent event) {
        LocalDate fechaSeleccionada = fechaDate.getValue();
        System.out.println("Fecha seleccionada: " + fechaSeleccionada);
    }

    // Método que se ejecuta cuando se hace clic en el botón para confirmar la cita
    @FXML
    public void registrarCita(ActionEvent event) {
        String paciente = pacientetxt.getText();
        String servicio = comboServicio.getValue();
        LocalDate fecha = fechaDate.getValue();
        String hora = horatxt.getText();

        // Validar que todos los campos estén completos
        if (paciente.isEmpty() || servicio == null || fecha == null || hora.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios");
            return;
        }

        // Lógica para registrar la cita con los datos ingresados
        mostrarAlerta("Éxito", "Cita registrada exitosamente para " + paciente);
    }

    // Método para mostrar alertas en pantalla
    private void mostrarAlerta(String titulo, String contenido) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }
}
