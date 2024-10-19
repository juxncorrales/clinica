package co.edu.uniquindio.clinica.controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import co.edu.uniquindio.clinica.modelo.Servicio;

public class ListaCitasControlador {

    @FXML
    private TableView<Servicio> tablaServicios;

    @FXML
    private TableColumn<Servicio, String> idColumn;

    @FXML
    private TableColumn<Servicio, String> servicioColumn;

    @FXML
    private TableColumn<Servicio, Double> precioColumn;

    private ObservableList<Servicio> listaServicios;

    @FXML
    public void initialize() {
        // Configuración de las columnas de la tabla
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        servicioColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        precioColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));

        // Inicializar la lista de servicios (debe reemplazarse por datos reales)
        listaServicios = FXCollections.observableArrayList(
                new Servicio("001", "Consulta médica", 50.0),
                new Servicio("002", "Examen de laboratorio", 30.0),
                new Servicio("003", "Rayos X", 100.0)
        );

        // Asignar la lista de servicios a la tabla
        tablaServicios.setItems(listaServicios);
    }
}
