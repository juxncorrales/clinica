package co.edu.uniquindio.clinica.modelo.factory;

public class SuscripcionFactory {

    // Método que convierte un String a una instancia de Suscripcion
    public static Suscripcion crearSuscripcion(String tipoSuscripcion) {
        switch (tipoSuscripcion) {
            case "Básico":
                return new SuscripcionBasica();
            case "Premium":
                return new SuscripcionPremium();
            default:
                throw new IllegalArgumentException("Tipo de suscripción no válido");
        }
    }
}
