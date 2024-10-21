package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.Clinica;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class PanelControlador {

    @FXML
    private StackPane panelPrincipal;

    private final Clinica clinica;

    public PanelControlador() {
        this.clinica = new Clinica(); // Se crea una única instancia de la clase Clinica
    }

    // Método para mostrar el panel de registro de pacientes
    public void mostrarRegistroPaciente(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroPaciente.fxml");
        panelPrincipal.getChildren().setAll(node); // Reemplaza el contenido del panel principal con el nuevo panel
    }

    // Método para mostrar la lista de pacientes
    public void mostrarListaPacientes(ActionEvent actionEvent) {
        Parent node = cargarPanel("/listaPacientes.fxml");
        panelPrincipal.getChildren().setAll(node); // Reemplaza el contenido del panel principal con el nuevo panel
    }

    // Método para mostrar el panel de registro de citas
    public void mostrarRegistroCita(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroCita.fxml");
        panelPrincipal.getChildren().setAll(node); // Reemplaza el contenido del panel principal con el nuevo panel
    }

    // Método para mostrar la lista de citas
    public void mostrarListaCitas(ActionEvent actionEvent) {
        Parent node = cargarPanel("/listaCitas.fxml");
        panelPrincipal.getChildren().setAll(node); // Reemplaza el contenido del panel principal con el nuevo panel
    }

    // Método auxiliar para cargar un panel específico (FXML) y pasar la instancia de la clínica
    private Parent cargarPanel(String fxmlFile) {
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent node = loader.load();

            // Inicializar la clínica en el controlador del archivo cargado
            AbstractControlador controlador = loader.getController();
            controlador.inicializarClinica(clinica);

            return node;
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores en la carga del FXML
        }
        return null;
    }
}
