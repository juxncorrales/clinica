package co.edu.uniquindio.clinica.controladores;

import co.edu.uniquindio.clinica.modelo.Clinica;
import lombok.Getter;


public abstract class AbstractControlador {


    @Getter
    private Clinica clinica;


    public void inicializarClinica(Clinica clinica){
        this.clinica = clinica;
    }


    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
