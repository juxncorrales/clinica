//package co.edu.uniquindio.clinica.controladores;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.ListView;
//
//public class ListaPacientesControlador {
//    @FXML
//    private ListView<String> listaPacientes;
//
//    public void inicializar() {
//        // Aquí puedes cargar la lista de pacientes desde la clase `Clinica`
//    }
//}
package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.Paciente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaPacientesControlador extends AbstractControlador {

    @FXML
    private TableView<Paciente> tablaPacientes;

    @FXML
    private TableColumn<Paciente, String> columnaNombre;

    @FXML
    private TableColumn<Paciente, String> columnaDocumento;

    @FXML
    private TableColumn<Paciente, String> columnaTelefono;

    private ObservableList<Paciente> listaPacientes;

    @FXML
    public void initialize() {
        // Inicializar las columnas de la tabla con los valores de la clase Paciente
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        columnaTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
    }

    public void cargarPacientes() {
        // Obtener la lista de pacientes desde la clase Clinica y cargarla en la tabla
        listaPacientes = FXCollections.observableArrayList(getClinica().listarPacientes());
        tablaPacientes.setItems(listaPacientes);
    }

    public void actualizarListaPacientes() {
        // Actualizar la lista cuando se agregue o elimine un paciente
        listaPacientes.setAll(getClinica().listarPacientes());
    }
}
