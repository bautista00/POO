import java.util.ArrayList;
import java.util.List;


public class Empresa {

    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleadoList = new ArrayList<>();
    }

   public void agregarEmpleado(String codigo){
        try {
               empleadoList.add(EmpleadoFactory.getInstance().crearEmpleado(codigo));
           } catch (EmpleadoFactoryException e) {
               e.printStackTrace();
           }
   }

    public Double calcularSueldosTotal() {
        Double sueldosTotal = 0.0;
        for (Empleado empleado:empleadoList) {
            sueldosTotal += empleado.calcularSueldos(dias);
        }
        return sueldosTotal;
    }

}