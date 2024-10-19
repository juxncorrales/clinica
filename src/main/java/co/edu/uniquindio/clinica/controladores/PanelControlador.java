package co.edu.uniquindio.clinica.controladores;

//import javafx.fxml.FXML;
//import javafx.scene.layout.Pane;
//
//public class PanelControlador {
//    @FXML
//    private Pane panelPrincipal;
//
//    public void mostrarVistaPacientes() {
//        // Cambiar a la vista de lista de pacientes
//    }
//
//    public void mostrarVistaRegistroPaciente() {
//        // Cambiar a la vista de registro de paciente
//    }
//}

//import co.edu.uniquindio.clinica.modelo.Clinica;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.layout.StackPane;
//
//
//public class PanelControlador {
//
//
//    @FXML
//    private StackPane panelPrincipal;
//
//
//    private final Clinica clinica;
//
//
//    public PanelControlador() {
//        this.clinica = new Clinica(); // Se crea una única instancia de la clase Clinica
//    }
//
//
//    public void mostrarRegistroPaciente(ActionEvent actionEvent) {
//        Parent node = cargarPanel("/registroPaciente.fxml");
//
//
//        // Se reemplaza el contenido del panel principal
//        panelPrincipal.getChildren().setAll(node);
//    }
//
//
//    public void mostrarListaPacientes(ActionEvent actionEvent) {
//        Parent node = cargarPanel("/listaPacientes.fxml");
//
//
//        // Se reemplaza el contenido del panel principal
//        panelPrincipal.getChildren().setAll(node);
//    }
//
//
//    public void mostrarRegistroCita(ActionEvent actionEvent) {
//        //Completar
//    }
//
//
//    public void mostrarListaCitas(ActionEvent actionEvent) {
//        //Completar
//    }
//
//
//    private Parent cargarPanel(String fxmlFile) {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
//            Parent node = loader.load();
//            return node;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//}


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

    public void mostrarRegistroPaciente(ActionEvent actionEvent) {
        Parent node = cargarPanel("/registroPaciente.fxml");

        // Se reemplaza el contenido del panel principal
        panelPrincipal.getChildren().setAll(node);
    }

    public void mostrarListaPacientes(ActionEvent actionEvent) {
        Parent node = cargarPanel("/listaPacientes.fxml");

        // Se reemplaza el contenido del panel principal
        panelPrincipal.getChildren().setAll(node);
    }

    public void mostrarRegistroCita(ActionEvent actionEvent) {
        //Completar
    }

    public void mostrarListaCitas(ActionEvent actionEvent) {
        //Completar
    }

    // Método modificado para inicializar la clínica en el controlador cargado
    private Parent cargarPanel(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent node = loader.load();

            // Inicializar la clínica en el controlador
            ((AbstractControlador) loader.getController()).inicializarClinica(clinica);

            return node;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
