public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Digital House");
        ServicioFactory factory = ServicioFactory.getInstance();

        empresa.agregarServicio(factory.generarServicio("Venta Aire Acondicionado"));
        empresa.agregarServicio(factory.generarServicio("Colocacion Aire Acondicionado"));
        empresa.agregarServicio(factory.generarServicio("Full Aire Acondicionado"));

        empresa.mostrarServicio();
    }
}