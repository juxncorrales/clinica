package co.edu.uniquindio.clinica.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import co.edu.uniquindio.clinica.modelo.Paciente;
import co.edu.uniquindio.clinica.modelo.Clinica;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaPacientesControlador {

    @FXML
    private TableView<Paciente> tablaPacientes;
    @FXML
    private TableColumn<Paciente, String> colIdentificacion, colNombre, colTelefono, colCorreo, colSuscripcion;

    private Clinica sistemaClinica;

    @FXML
    public void initialize() {
        colIdentificacion.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colSuscripcion.setCellValueFactory(new PropertyValueFactory<>("tipoSuscripcion"));

        actualizarListaPacientes();
    }

    public void actualizarListaPacientes() {
        ObservableList<Paciente> listaPacientes = FXCollections.observableArrayList(sistemaClinica.getPacientes());
        tablaPacientes.setItems(listaPacientes);
    }
}
