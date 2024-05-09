import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Hotel hotel=new Hotel();
     int opcion= 0;
     do {
         Menu();
         System.out.println("Selecciona una opción");
         opcion = sc.nextInt();
         switch (opcion){
             case 1:
                 Hotel.rellenarHotel();
                 hotel.ListaHabitaciones();
                 break;
             case 6:
            	 System.out.println("Has salido del programa");
             default:
                 break;



         }

        }while (opcion!=6);


    }

    public static void Menu(){
        System.out.println("**********MENÚ*************");
        System.out.println("1.Listas de Habitaciones");
        System.out.println("2.Elegir Habitación");
        System.out.println("3.Ordenar por precio Descendente");
        System.out.println("4.Ordenar por precio Ascendente");
        System.out.println("4.Ordenar por Tipo");
        System.out.println("5.Ordenar por Disponibilidad (Libre/Reservado)");
        System.out.println("**************************************************");
    }
}