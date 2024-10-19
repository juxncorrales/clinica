package co.edu.uniquindio.clinica.modelo.factory;

public class SuscripcionBasica implements Suscripcion {

    @Override
    public double calcularPrecio(double precioServicio) {
        // En suscripción básica algunos servicios tienen descuento o son gratuitos.
        // Aquí puedes definir las reglas de precios.
        if (precioServicio <= 100) {
            return 0; // Gratis si el servicio cuesta menos de 100
        } else if (precioServicio <= 200) {
            return precioServicio * 0.8; // 20% de descuento
        } else {
            return precioServicio; // Pago completo para otros servicios
        }
    }
}
