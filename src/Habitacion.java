public class Habitacion {

    private Integer numeroHab;
    private Tipo tipo;
    private boolean disponibilidad;
    private float precio_noche;

    public Habitacion(Integer numeroHab, Tipo tipo, boolean disponibilidad, float precio_noche) {
        this.numeroHab = numeroHab;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.precio_noche = precio_noche;
    }
}
