public class SalarioMensual extends Contrato {

    private Double salarioMensual;
    private Double horasTotales;
    private String cargo;

    public SalarioMensual(Persona persona, Double duracion, String fechaInicio, Boolean selladoMinistro, Double salarioMensual, Double horasTotales, String cargo) {
        super(persona, duracion, fechaInicio, selladoMinistro);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public Boolean esJefe(){
        return cargo.equals("Jefe");
    }

}
