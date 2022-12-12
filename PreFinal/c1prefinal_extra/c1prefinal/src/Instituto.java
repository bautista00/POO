import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertaAcademicaList;

    public Instituto() {
        ofertaAcademicaList = new ArrayList<>();
    }

    public void agregarOfertaAcademica(String codigoOferta){
        try {
            ofertaAcademicaList.add(OfertaAcademicaFactory.getInstance().generarOfertaAcademica(codigoOferta));
        } catch (OfertaAcademicaFactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertaAcademicaList) {
            System.out.println(ofertaAcademica);
        }
    }
}
