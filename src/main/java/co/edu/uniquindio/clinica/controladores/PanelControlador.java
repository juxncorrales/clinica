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
        // Usamos el método Singleton para obtener la única instancia de Clinica
        this.clinica = Clinica.getInstancia();
    }

    // Método para mostrar el panel de registro de pacientes
    public void mostrarRegistroPaciente(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroPaciente.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    // Método para mostrar la lista de pacientes
    public void mostrarListaPacientes(ActionEvent actionEvent) {
        Parent node = cargarPanel("/listaPacientes.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    // Método para mostrar el panel de registro de citas
    public void mostrarRegistroCita(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroPaciente.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    // Método para mostrar la lista de citas
    public void mostrarListaCitas(ActionEvent actionEvent) {
        Parent node = cargarPanel("/listaCitas.fxml");
        panelPrincipal.getChildren().setAll(node);
    }

    // Método auxiliar para cargar un panel específico (FXML) y pasar la instancia de la clínica
    // Método auxiliar para cargar un panel específico (FXML) y pasar la instancia de la clínica
    private Parent cargarPanel(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent node = loader.load();

            // Inicializar la clínica en el controlador del archivo cargado
            AbstractControlador controlador = loader.getController();
            controlador.inicializarClinica();  // Inicializar el Singleton

            return node;
        } catch (Exception e) {
            e.printStackTrace();  // Manejo de errores en la carga del FXML
        }
        return null;
    }
}
