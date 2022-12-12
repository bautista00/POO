import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio{

    private List<Servicio> servicioList;
    private Integer descuento;

    public Combo(String nombre, String descripcion, Integer descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        servicioList = new ArrayList<>();
    }
    public void agregarServicio(Servicio servicio){
        servicioList.add(servicio);
    }

    @Override
    public Double calcularPrecio() {
          Double precioCombo = 0.0;
        for (Servicio servicio : servicioList) {
            precioCombo += servicio.calcularPrecio();
        }
        return precioCombo - (precioCombo * descuento/100);
    }
}
