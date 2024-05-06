import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hotel {

    private static Map<Integer, Habitacion>ListaHotel;
    private static final int CONST_NUM_HAB = 100;

    public Hotel() {
        ListaHotel = new HashMap<>(CONST_NUM_HAB);

    }

    public static void rellenarHotel(){
        Random random = new Random();
        for(int i=1;i<=CONST_NUM_HAB;i++){
           int numeroHab = i;
            Tipo tipo = Tipo.values()[random.nextInt(Tipo.values().length)];
            double precio = 50 + Math.random() * 450;
            Disponibilidad disponibilidad = Disponibilidad.values()[random.nextInt(Disponibilidad.values().length)];
            ListaHotel.put(numeroHab,new Habitacion(numeroHab,tipo, disponibilidad, precio));

        }
    }

    public void ListaHabitaciones() {
        StringBuilder lista = new StringBuilder();
        lista.append("Nº HABITACIÓN  |    TIPO    |    DISPONIBILIDAD   |     PRECIO\n");
        lista.append("---------------|-------------|----------------------|-------------------\n");
        for (Integer i : ListaHotel.keySet()) {
            Habitacion habitacion = ListaHotel.get(i);
            String precioFormateado = String.format("%.2f", habitacion.getPrecio_noche());
            lista.append(habitacion.getNumeroHab() + "\t\t|\t\t" + habitacion.getTipo() + "\t| " + habitacion.getDisponibilidad() + "\t| " + precioFormateado + "\n");
        }
        System.out.println(lista.toString());
    }



}
