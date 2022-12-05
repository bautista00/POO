



public class Perro {
    private String nombre;
    private String raza;
    private Double peso;
    private Integer nacimiento;
    private Boolean estaLastimado;
    private Boolean tieneChip;

    public Perro(String nombre, String raza, Double peso, Integer nacimiento, Boolean estaLastimado, Boolean tieneChip) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.nacimiento = nacimiento;
        this.estaLastimado = estaLastimado;
        this.tieneChip = tieneChip;
    }

    public Perro(String nombre, String raza, Integer nacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.nacimiento = nacimiento;
    }

    public boolean puedePerderse(){
        return !tieneChip;
    }
    public boolean adoptable(){
        return(!this.estaLastimado && this.peso >= 5.45);
    }

    public Integer edadPerro(){
        return(2022 - this.nacimiento);
    }

}


