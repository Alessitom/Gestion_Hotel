public class Habitacion {

    private Integer numeroHab;
    private Tipo tipo;
    private Disponibilidad disponibilidad;
    private double precio_noche;

    public Habitacion(Integer numeroHab, Tipo tipo, Disponibilidad disponibilidad, double precio_noche) {
        this.numeroHab = numeroHab;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.precio_noche = precio_noche;
    }

    public Integer getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(Integer numeroHab) {
        this.numeroHab = numeroHab;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(float precio_noche) {
        this.precio_noche = precio_noche;
    }


}
