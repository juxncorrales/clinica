package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.Paciente;
import co.edu.uniquindio.clinica.modelo.Clinica;
import co.edu.uniquindio.clinica.modelo.factory.Suscripcion;
import co.edu.uniquindio.clinica.modelo.factory.SuscripcionFactory;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class RegistroPacienteControlador {

    @FXML
    private TextField cedulatxt;

    @FXML
    private TextField correotxt;

    @FXML
    private TextField nombretxt;

    @FXML
    private TextField telefonotxt;

    @FXML
    private ComboBox<String> tipoSuscripcionComboBox;

    private Clinica clinica;  // Instancia de la clínica para acceder a sus métodos

    @FXML
    public void initialize() {
        // Inicializar los valores del ComboBox de tipo de suscripción
        tipoSuscripcionComboBox.setItems(FXCollections.observableArrayList("Básico", "Premium"));
    }

    // Método para registrar un paciente
    @FXML
    void registrarPaciente(ActionEvent event) {
        try {
            // Validar los datos ingresados
            String cedula = cedulatxt.getText();
            String nombre = nombretxt.getText();
            String telefono = telefonotxt.getText();
            String correo = correotxt.getText();
            String tipoSuscripcionStr = tipoSuscripcionComboBox.getValue();

            // Validación de campos vacíos
            if (cedula.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || correo.isEmpty() || tipoSuscripcionStr == null) {
                mostrarAlerta("Error de validación", "Todos los campos deben estar completos");
                return;
            }

            // Convertir el tipo de suscripción de String a Suscripcion usando la fábrica
            Suscripcion tipoSuscripcion = SuscripcionFactory.crearSuscripcion(tipoSuscripcionStr);

            // Crear un nuevo paciente con la suscripción seleccionada
            Paciente nuevoPaciente = new Paciente(cedula, nombre, telefono, correo, tipoSuscripcion);

            // Registrar el paciente en la clínica
            clinica.registrarPaciente(nuevoPaciente);

            // Mostrar mensaje de éxito
            mostrarAlerta("Registro exitoso", "El paciente ha sido registrado correctamente");
            limpiarCampos();
        } catch (Exception e) {
            mostrarAlerta("Error", "Ocurrió un error al registrar el paciente");
            e.printStackTrace();
        }
    }

    // Método para limpiar los campos después del registro
    private void limpiarCampos() {
        cedulatxt.clear();
        nombretxt.clear();
        telefonotxt.clear();
        correotxt.clear();
        tipoSuscripcionComboBox.getSelectionModel().clearSelection();
    }

    // Método para mostrar alertas
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    // Método para inicializar la clínica desde el controlador principal
    public void inicializarClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
