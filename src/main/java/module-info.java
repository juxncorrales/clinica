module co.edu.uniquindio.clinica {
    // Requerimientos de JavaFX
    requires javafx.controls;
    requires javafx.fxml;

    // Requerimientos para Lombok
    requires static lombok;

    // Requerimientos para Simple Java Mail
    requires org.simplejavamail;
    requires org.simplejavamail.core; // solo si realmente necesitas este módulo

    // Abrir paquetes para la reflexión (necesario para JavaFX)
    opens co.edu.uniquindio.clinica to javafx.fxml;
    opens co.edu.uniquindio.clinica.controladores to javafx.fxml;

    // Exportar paquetes
    exports co.edu.uniquindio.clinica.controladores;
}
