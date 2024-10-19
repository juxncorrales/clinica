package co.edu.uniquindio.clinica.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import co.edu.uniquindio.clinica.modelo.Cita;
import co.edu.uniquindio.clinica.modelo.Clinica;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaCitasControlador {

    @FXML
    private TableView<Cita> tablaCitas;
    @FXML
    private TableColumn<Cita, String> idColumn, servicioColumn, precioColumn;

    private Clinica sistemaClinica;

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        servicioColumn.setCellValueFactory(new PropertyValueFactory<>("servicioNombre"));
        precioColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));

        actualizarListaCitas();
    }

    public void actualizarListaCitas() {
        ObservableList<Cita> listaCitas = FXCollections.observableArrayList(sistemaClinica.getCitas());
        tablaCitas.setItems(listaCitas);
    }
}
