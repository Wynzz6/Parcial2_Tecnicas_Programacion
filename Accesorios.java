public class Accesorios {

    String calidad;
    Double precio;

    public Accesorios(String calidad, Double precio){
        this.calidad=calidad;
        this.precio=precio;

    }

    public String getCalidad(){
        return calidad;

    }

    public Double getPrecio() {
        return precio;
    }

    /**
     *
     * Complejidad: O(1) Constante
     */
}
