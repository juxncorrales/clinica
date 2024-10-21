package co.edu.uniquindio.clinica.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import co.edu.uniquindio.clinica.modelo.Cita;
import co.edu.uniquindio.clinica.modelo.Clinica;

public class ListaCitasControlador {

    @FXML
    private Button bttCancelarCita;

    @FXML
    private TableColumn<Cita, String> idColumn;

    @FXML
    private TableColumn<Cita, String> servicioColumn;

    @FXML
    private TableColumn<Cita, String> precioColumn;

    @FXML
    private TableView<Cita> tablaCitas;

    private Clinica sistemaClinica;

    @FXML
    public void initialize() {
        // Asigna los valores que se mostrarán en las columnas de la tabla
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        servicioColumn.setCellValueFactory(new PropertyValueFactory<>("servicioNombre"));
        precioColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));

        // Actualiza la lista de citas al cargar la interfaz
        actualizarListaCitas();
    }

    // Método para actualizar la lista de citas en la tabla
    public void actualizarListaCitas() {
        // Obtiene la lista de citas del sistema clínico
        ObservableList<Cita> listaCitas = FXCollections.observableArrayList(sistemaClinica.getCitas());

        // Asigna la lista de citas a la tabla
        tablaCitas.setItems(listaCitas);
    }

    // Método para cancelar una cita seleccionada
    @FXML
    public void cancelarCita(ActionEvent event) {
        Cita citaSeleccionada = tablaCitas.getSelectionModel().getSelectedItem();
        if (citaSeleccionada != null) {
            // Usa el método cancelarCita para eliminar la cita del sistema clínico
            sistemaClinica.cancelarCita(citaSeleccionada);
            // Actualiza la lista de citas
            actualizarListaCitas();
        } else {
            System.out.println("No se ha seleccionado ninguna cita para cancelar.");
        }
    }
}
