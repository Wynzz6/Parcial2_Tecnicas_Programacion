public class Accesorios {

    String calidad;
    Double precio;

    public Accesorios(String calidad, Double precio){
        this.calidad=calidad;
        this.precio=precio;

    }
// Método getter para obtener la calidad del accesorio
    public String getCalidad(){
        return calidad;

    }

    //Método getter para obtener el precio del accesorio
    public Double getPrecio() {
        return precio;
    }

    /**
     *
     * Complejidad: O(1) Constante
     */
}
