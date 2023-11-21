public class Laptop {
    String procesador;
    Double Ram;
    String almacenamiento;


    public Laptop(String procesador, Double Ram, String almacenamiento){
        this.procesador=procesador;
        this.Ram=Ram;
        this.almacenamiento=almacenamiento;

    }
    // Método getter para obtener el procesador
    public String getProcesador(){
        return procesador;
    }
    // Método getter para obtener la memoria RAM
    public Double getRam(){
        return Ram;
    }
    // Método getter para obtener el Almacenamiento
    public String getAlmacenamiento(){
        return almacenamiento;
    }
    /**
     *
     * Complejidad: O(1) Constante
     */
}
