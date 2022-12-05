public class Producto implements Comprable {

    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        System.out.println("soy un " + nombre + " y mi valor es de " + precio );
        return this.precio;
    }
}
