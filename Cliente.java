public class Cliente {

    private String nombre;

    private String direccionEnvio;

    private String listaDePedidos;


    // Constructor para inicializar los atributos de Cliente

    public Cliente(String nombre, String direccionEnvio, String listaDePedidos){
        this.nombre=nombre;
        this.direccionEnvio=direccionEnvio;
        this.listaDePedidos=listaDePedidos;



        /**
         *
        * Complejidad: O(1) Constante
     */
    }
   // Método getter para obtener el nombre del cliente
    public String getNombre(){
        return nombre;
    }
// Método getter para obtener la dirección del cliente
    public String getDireccionEnvio() {
        return direccionEnvio;
    }
    // Método setter para establecer la lista de pedidos del cliente

    public void setListaDePedidos(String listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }
}
