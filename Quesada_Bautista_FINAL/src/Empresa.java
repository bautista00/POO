import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Servicio> servicioList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        servicioList = new ArrayList<>();

    }
    public void agregarServicio(Servicio servicio){
        servicioList.add(servicio);
    }

    public void mostrarServicio(){
        for (Servicio servicio : servicioList) {
            System.out.println(servicio.calcularPrecio());
            System.out.println(servicio.getNombre());
        }
    };

}
