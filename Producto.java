public class Producto {

    private String nombre;

    private String descripcion;

    private String precio;

    private String cantidadEnInventario;

    // Constructor para inicializar los atributos de Producto

    public Producto(String nombre, String descripcion, String precio, String cantidadEnInventario) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;


    }

    // Método setter para establecer el nombre
    public String setNombre() {
        this.nombre = nombre;
        return nombre;
    }
    // Método getter para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
    // Método getter para obtener el precio
    public String getPrecio() {
        return precio;
    }
    // Método getter para obtener la cantidad de objetos en inventario
    public String getCantidadEnInventario(){
        return cantidadEnInventario;
    }
/**
 *
 * Complejidad: O(1) Constante
 */

}
