import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hotel {

    private static Map<Integer,Habitacion>ListaHotel;
    private static final int CONST_NUM_HAB = 100;

    public Hotel(Map<Integer, Habitacion> listaHotel) {
        ListaHotel = new HashMap<>(CONST_NUM_HAB);

    }

    public static void rellenarHotel(){
        Random random = new Random();
        for(int i=1;i<=CONST_NUM_HAB;i++){
           int numeroHab = i;
            Tipo tipo = Tipo.values()[random.nextInt(Tipo.values().length)];
            float precio = Float.parseFloat(String.format("%.2f", 50 + Math.random() * 450));
            boolean disponibilidad = random.nextBoolean();
            ListaHotel.put(numeroHab,new Habitacion(numeroHab,tipo, disponibilidad, precio));

        }
    }



}
