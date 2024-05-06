import java.util.Comparator;

public interface Comparador extends Comparator<Habitacion> {
    static Comparador Ascendente(){
        return (habitacion1,habitacion2)-> Double.compare(habitacion1.getPrecio_noche(),habitacion2.getPrecio_noche());
    }
    static  Comparador Descendente(){
        return (habitacion1,habitacion2)-> Double.compare(habitacion2.getPrecio_noche(),habitacion1.getPrecio_noche());
    }
}
