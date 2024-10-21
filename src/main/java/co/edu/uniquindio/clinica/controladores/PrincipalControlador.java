//package co.edu.uniquindio.clinica.controladores;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.layout.StackPane;
//import co.edu.uniquindio.clinica.modelo.Clinica;
//
//public class PrincipalControlador {
//
//    @FXML
//    private StackPane panelPrincipal;
//
//    private final Clinica clinica;
//
//    public PrincipalControlador() {
//        this.clinica = new Clinica(); // Se crea una instancia de la clínica que será compartida entre los controladores
//    }
//
//    // Método para mostrar el panel de creación de citas
//    @FXML
//    public void mostrarCrearCita(ActionEvent event) {
//        cargarPanel("/co/edu/uniquindio/clinica/vistas/CrearCita.fxml");
//    }
//
//    // Método para mostrar el panel de facturación
//    @FXML
//    public void mostrarFactura(ActionEvent event) {
//        cargarPanel("/co/edu/uniquindio/clinica/vistas/Factura.fxml");
//    }
//
//    // Método para mostrar la lista de citas
//    @FXML
//    public void mostrarListaCitas(ActionEvent event) {
//        cargarPanel("/co/edu/uniquindio/clinica/vistas/ListaCitas.fxml");
//    }
//
//    // Método para mostrar la lista de pacientes
//    @FXML
//    public void mostrarListaPacientes(ActionEvent event) {
//        cargarPanel("/co/edu/uniquindio/clinica/vistas/ListaPacientes.fxml");
//    }
//
//    // Método para mostrar el panel de registro de pacientes
//    @FXML
//    public void mostrarRegistroPaciente(ActionEvent event) {
//        cargarPanel("/co/edu/uniquindio/clinica/vistas/RegistroPaciente.fxml");
//    }
//
//    // Método auxiliar para cargar y mostrar un panel
//    private void cargarPanel(String rutaFXML) {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFXML));
//            Parent nuevoPanel = loader.load();
//
//            // Inicializar la clínica en el controlador del panel cargado
//            AbstractControlador controlador = loader.getController();
//            controlador.inicializarClinica(clinica);
//
//            // Reemplaza el contenido del panel principal con el nuevo panel
//            panelPrincipal.getChildren().setAll(nuevoPanel);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
