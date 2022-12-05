public abstract class Contrato{

    private Persona persona;
    private Double duracion;
    private String fechaInicio;
    private Boolean selladoMinistro;

    public Contrato(Persona persona, Double duracion, String fechaInicio, Boolean selladoMinistro) {
        this.persona = persona;
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.selladoMinistro = selladoMinistro;
    }

    public Boolean seIncorpora(){
            return selladoMinistro;
    }
}
