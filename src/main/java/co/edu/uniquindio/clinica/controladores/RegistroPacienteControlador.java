//package co.edu.uniquindio.clinica.controladores;
//
////import javafx.fxml.FXML;
//import javafx.fxml.FXML;
//import javafx.scene.control.TextField;
//
//public class RegistroPacienteControlador {
//    @FXML
//    private TextField campoCedula;
//    @FXML
//    private TextField campoNombre;
//    @FXML
//    private TextField campoTelefono;
//    @FXML
//    private TextField campoEmail;
//
//    public void registrarPaciente() {
//        String cedula = campoCedula.getText();
//        String nombre = campoNombre.getText();
//        String telefono = campoTelefono.getText();
//        String email = campoEmail.getText();
//        // Aquí puedes invocar el método de la clase `Clinica` para registrar al paciente
//    }
//}
package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.Paciente;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RegistroPacienteControlador extends AbstractControlador {

    @FXML
    private TextField campoCedula;

    @FXML
    private TextField campoNombre;

    @FXML
    private TextField campoTelefono;

    @FXML
    private TextField campoEmail;

    // Método para registrar un nuevo paciente
    public void registrarPaciente() {
        String cedula = campoCedula.getText();
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        String email = campoEmail.getText();

        // Crear un nuevo objeto Paciente con los datos proporcionados
        Paciente nuevoPaciente = new Paciente(cedula, nombre, telefono, email);

        // Usar la instancia de Clinica para registrar al paciente
        getClinica().registrarPaciente(nuevoPaciente);

        // Limpiar los campos después de registrar al paciente
        limpiarCampos();
    }

    // Método para limpiar los campos del formulario
    private void limpiarCampos() {
        campoCedula.clear();
        campoNombre.clear();
        campoTelefono.clear();
        campoEmail.clear();
    }
}
