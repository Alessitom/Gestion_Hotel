import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private int id;
    private String nombre;
    private int edad;
    static  Set<Cliente>Clientes;

    public Cliente(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        Clientes = new HashSet<>();
    }

public boolean añadircliente(Cliente cliente){
        if(Clientes.contains(cliente.id)){
            System.out.println("Ese cliente ya existe");
            return false;
        }else {
            Clientes.add(cliente);
            System.out.println("Cliente agregado");
            return true;
        }
}

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }
}
