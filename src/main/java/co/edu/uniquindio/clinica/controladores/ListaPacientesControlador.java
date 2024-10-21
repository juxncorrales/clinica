package co.edu.uniquindio.clinica.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import co.edu.uniquindio.clinica.modelo.Paciente;
import co.edu.uniquindio.clinica.modelo.Clinica;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaPacientesControlador extends AbstractControlador {

    @FXML
    private TableView<Paciente> tablaPacientes;

    @FXML
    private TableColumn<Paciente, String> colIdentificacion, colNombre, colTelefono, colCorreo, colSuscripcion;

    private Clinica sistemaClinica;  // Instancia de la clase Clinica que contiene la lista de pacientes

    @FXML
    public void initialize() {
        // Asociar cada columna con los atributos correspondientes de la clase Paciente
        colIdentificacion.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colSuscripcion.setCellValueFactory(new PropertyValueFactory<>("tipoSuscripcion"));

        // Llenar la tabla con los datos de los pacientes
        actualizarListaPacientes();
    }

    public void actualizarListaPacientes() {
        // Obtener la lista de pacientes de la instancia de Clinica
        ObservableList<Paciente> listaPacientes = FXCollections.observableArrayList(sistemaClinica.getPacientes());
        // Asignar la lista a la tabla
        tablaPacientes.setItems(listaPacientes);
    }

    // Método para establecer la instancia de Clinica desde fuera del controlador
    public void setClinica(Clinica clinica) {
        this.sistemaClinica = clinica;
    }
}
