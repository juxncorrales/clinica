package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.Clinica;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractControlador {

    @Getter
    @Setter
    private Clinica clinica;

    // Método para inicializar la clínica usando el Singleton
    public void inicializarClinica() {
        this.clinica = Clinica.getInstancia();  // Usamos la única instancia de la clase
    }
}
