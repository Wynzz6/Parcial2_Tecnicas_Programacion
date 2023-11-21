public class Producto {

    private String nombre;

    private String descripcion;

    private Double precio;

    private Double cantidadEnInventario;

    // Constructor para inicializar los atributos de Producto

    public Producto(String nombre, String descripcion, Double precio, Double cantidadEnInventario) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    // Método getter para establecer el nombre
    public String setNombre() {
        this.nombre = nombre;
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }
    public Double getCantidadEnInventario(){
        return cantidadEnInventario;
    }


}
