public class Cliente {

    private String nombre;

    private Double direccionEnvio;

    private String listaDePedidos;


    // Constructor para inicializar los atributos de Cliente

    public Cliente(String nombre, Double direccionEnvio, String listaDePedidos){
        this.nombre=nombre;
        this.direccionEnvio=direccionEnvio;
        this.listaDePedidos=listaDePedidos;
    }

}
