public class SalarioHora extends Contrato implements Comparable{

    private Double horaMes;
    private Double valorHora;

    public SalarioHora(Persona persona, Double duracion, String fechaInicio, Boolean selladoMinistro, Double horaMes, Double valorHora) {
        super(persona, duracion, fechaInicio, selladoMinistro);
        this.horaMes = horaMes;
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o){

        SalarioHora salario = (SalarioHora) o;

        if(this.horaMes > salario.horaMes){
            return 1;
        }
        if(this.horaMes < salario.horaMes){
            return -1;
        }
        return 0;
    }
}
