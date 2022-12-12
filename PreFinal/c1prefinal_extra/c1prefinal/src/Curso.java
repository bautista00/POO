public class Curso extends OfertaAcademica{

    private Double horasMensuales;
    private Double valorHoras;
    private Double duracionMeses;

    public Curso(String nombre, String descripcion, Double horasMensuales, Double valorHoras, Double duracionMeses) {
        super(nombre, descripcion);
        this.horasMensuales = horasMensuales;
        this.valorHoras = valorHoras;
        this.duracionMeses = duracionMeses;
    }

    @Override
    public Double calcularPrecio() {
        return horasMensuales * duracionMeses * valorHoras;
    }
}
