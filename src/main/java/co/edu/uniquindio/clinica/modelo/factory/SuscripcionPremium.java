package co.edu.uniquindio.clinica.modelo.factory;

public class SuscripcionPremium implements Suscripcion {

    @Override
    public double calcularPrecio(double precioServicio) {
        // En la suscripción premium la mayoría de servicios son gratis o con mayor descuento
        if (precioServicio <= 200) {
            return 0; // Gratis para servicios hasta 200
        } else {
            return precioServicio * 0.5; // 50% de descuento en servicios más costosos
        }
    }
}
