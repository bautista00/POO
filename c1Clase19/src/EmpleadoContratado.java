

public class EmpleadoContratado extends Empleado {

    private Double importeHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo) {
        super(nombre, apellido, legajo);
        this.importeHora = 7.0;
        this.retencionImpuesto = 0.86;
    }

    @Override
    public Double calcularSueldos(Integer dias) {
        Double salarioDia= 56.0;
        return salarioDia * dias * retencionImpuesto;
    }
}
