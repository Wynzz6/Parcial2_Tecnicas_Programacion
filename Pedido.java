public class Pedido {
    public static void main(String[] args) {

     Cliente cliente = new Cliente("Alberto", "IglesiaDeLourdes", "2");
     Producto producto = new Producto("Iphone","13PROMAX","120000","12");

     System.out.println("El nombre del cliente es: "+cliente);
     System.out.println("El producto que el cliente requiere es: "+producto);

        /**
         *
         * Complejidad: O(1) Constante
         */



    }
}
