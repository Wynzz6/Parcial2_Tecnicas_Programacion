public class Laptop {
    String procesador;
    Double Ram;
    String almacenamiento;


    public Laptop(String procesador, Double Ram, String almacenamiento){
        this.procesador=procesador;
        this.Ram=Ram;
        this.almacenamiento=almacenamiento;

    }

    public String getProcesador(){
        return procesador;
    }
    public Double getRam(){
        return Ram;
    }
    public String getAlmacenamiento(){
        return almacenamiento;
    }
}
