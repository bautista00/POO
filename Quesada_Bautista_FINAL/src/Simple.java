public class Simple extends Servicio{

    private Double precioBase;
    private Boolean incluyeColocacion;

    public Simple(String nombre, String descripcion, Double precioBase, Boolean incluyeColocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.incluyeColocacion = incluyeColocacion;
    }

    @Override
    public Double calcularPrecio() {
        Double precioColocacion = 0.0;
        if(incluyeColocacion){
            precioColocacion = precioBase + precioBase * 0.1;
            return precioColocacion;
        } else{
            return precioBase;
        }
    }
}
