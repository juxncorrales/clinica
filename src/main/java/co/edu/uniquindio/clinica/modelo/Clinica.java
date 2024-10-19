package co.edu.uniquindio.clinica.modelo;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Paciente> pacientes;
    private List<Cita> citas;
    private List<Servicio> servicios;

    public Clinica() {
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.servicios = new ArrayList<>();
        cargarServicios();
    }

    // Método para registrar pacientes
    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente registrado: " + paciente.getNombre());
    }

    // Listar pacientes
    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    // Método para agendar una cita
    public void agendarCita(Cita cita) throws Exception {
        // Validar si la cita no se cruza con otra
        for (Cita c : citas) {
            if (c.getFecha().equals(cita.getFecha())) {
                throw new Exception("Ya existe una cita en este horario.");
            }
        }
        citas.add(cita);
        System.out.println("Cita agendada con éxito.");
    }

    // Listar citas
    public List<Cita> listarCitas() {
        return citas;
    }

    // Cancelar cita
    public void cancelarCita(Cita cita) {
        citas.remove(cita);
        System.out.println("Cita cancelada.");
    }

    // Cargar los servicios disponibles
    private void cargarServicios() {
        servicios.add(new Servicio(1, "Consulta General", 100.0));
        servicios.add(new Servicio(2, "Odontología", 200.0));
        servicios.add(new Servicio(3, "Radiografía", 300.0));
    }

    // Listar servicios disponibles
    public List<Servicio> listarServicios() {
        return servicios;
    }
}
