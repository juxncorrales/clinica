////package co.edu.uniquindio.clinica.controladores;
////
////
////import co.edu.uniquindio.clinica.modelo.Clinica;
////import javafx.fxml.FXML;
////import javafx.fxml.FXMLLoader;
////import javafx.fxml.Initializable;
////import javafx.scene.Parent;
////import javafx.scene.control.Tab;
////
////
////import java.net.URL;
////import java.util.ResourceBundle;
////
////
////public class PanelDosControlador implements Initializable {
////
////
////    @FXML
////    private Tab tab1;
////
////
////    @FXML
////    private Tab tab2;
////
////
////    @FXML
////    private Tab tab3;
////
////
////    @FXML
////    private Tab tab4;
////
////
////    private final Clinica clinica;
////
////
////    public PanelDosControlador() {
////        this.clinica = new Clinica(); // Se crea una única instancia de la clase Clinica
////    }
////
////
////    @Override
////    public void initialize(URL location, ResourceBundle resources) {
////        try{
////            cargarTab(tab1, "/registroPaciente.fxml");
////            cargarTab(tab2, "/listaPacientes.fxml");
////            //Agregar los otros tabs…
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
////
////
////    private void cargarTab(Tab tab, String fxmlFile) throws Exception {
////        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
////        Parent content = loader.load();
////        tab.setContent(content);
////    }
////}
//package co.edu.uniquindio.clinica.controladores;
//
//import co.edu.uniquindio.clinica.modelo.Clinica;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.control.Tab;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class PanelDosControlador implements Initializable {
//
//    @FXML
//    private Tab tab1;
//
//    @FXML
//    private Tab tab2;
//
//    @FXML
//    private Tab tab3;
//
//    @FXML
//    private Tab tab4;
//
//    private final Clinica clinica;
//
//    public PanelDosControlador() {
//        this.clinica = new Clinica(); // Se crea una única instancia de la clase Clinica
//    }
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        try {
//            cargarTab(tab1, "/registroPaciente.fxml");
//            cargarTab(tab2, "/listaPacientes.fxml");
//            // Agregar los otros tabs según corresponda
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Método modificado para inicializar la clínica en el controlador cargado
//    private void cargarTab(Tab tab, String fxmlFile) throws Exception {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
//        Parent content = loader.load();
//
//        // Inicializar la clínica en el controlador
//        ((AbstractControlador) loader.getController()).inicializarClinica(clinica);
//
//        tab.setContent(content);
//    }
//}
