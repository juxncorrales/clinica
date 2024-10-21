package co.edu.uniquindio.clinica.modelo;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    // Instancia pública de la clase Clinica
    public static Clinica INSTANCIA;

    private List<Paciente> pacientes;
    private List<Cita> citas;
    private List<Servicio> servicios;

    // Constructor privado para evitar que se creen instancias fuera de la clase
    private Clinica() {
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.servicios = new ArrayList<>();
        cargarServicios();
    }

    // Método para obtener la única instancia de la clase
    public static Clinica getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new Clinica();
        }
        return INSTANCIA;
    }

    // Método para registrar pacientes
    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente registrado: " + paciente.getNombre());
    }

    // Método para obtener la lista de pacientes
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    // Método para agendar una cita
    public void agendarCita(Cita cita) throws Exception {
        for (Cita c : citas) {
            if (c.getFecha().equals(cita.getFecha())) {
                throw new Exception("Ya existe una cita en este horario.");
            }
        }
        citas.add(cita);
        System.out.println("Cita agendada con éxito.");
    }

    // Método para obtener la lista de citas
    public List<Cita> getCitas() {
        return citas;
    }

    // Método para cancelar una cita
    public void cancelarCita(Cita cita) {
        citas.remove(cita);
        System.out.println("Cita cancelada.");
    }

    // Cargar los servicios disponibles
    private void cargarServicios() {
        servicios.add(new Servicio("1", "Consulta General", 100.0));
        servicios.add(new Servicio("2", "Odontología", 200.0));
        servicios.add(new Servicio("3", "Radiografía", 300.0));
    }

    // Método para obtener la lista de servicios
    public List<Servicio> getServicios() {
        return servicios;
    }

    // Método para listar servicios disponibles
    public List<Servicio> listarServicios() {
        return servicios;
    }
}
