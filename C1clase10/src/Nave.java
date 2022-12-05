


public class Nave extends  ObjetoGrafico{
    private Double velocidad;
    private Integer vida;

    public Nave(Integer posx, Integer posy, char direccion, Double velocidad, Integer vida  ) {
       super (posx, posy, direccion);
        this.velocidad= velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(Integer x, Integer y, char direccion) {
        super.irA(x, y, direccion);
    }

}
