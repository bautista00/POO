


public class Asteroide extends ObjetoGrafico{

    public Integer lesion;


    public Asteroide(Integer posx, Integer posy, char direccion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(Integer x, Integer y, char direccion) {
        super.irA(x, y, direccion);
    }
}
