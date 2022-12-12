import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertaAcademicaList;

    public Instituto() {
        ofertaAcademicaList = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertaAcademicaList.add(ofertaAcademica);
    }

    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertaAcademicaList) {
            System.out.println(ofertaAcademica);
        }
    }
}
