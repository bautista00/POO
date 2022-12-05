


public class EmpleadoRelacionDependencia extends Empleado{

    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = 1000.0;
    }

    @Override
    public Double calcularSueldos(Integer dias){
        Double sueldoDia = sueldoMensual / 30;
        return sueldoDia * dias;
    }
}
