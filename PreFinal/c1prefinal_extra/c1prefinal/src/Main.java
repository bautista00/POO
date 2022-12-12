public class Main {
    public static void main(String[] args) {

        Instituto instituto = new Instituto();

        instituto.agregarOfertaAcademica(OfertaAcademicaFactory.CODIGO_FRONTEND);
        instituto.agregarOfertaAcademica(OfertaAcademicaFactory.CODIGO_BACKEND);
        instituto.agregarOfertaAcademica("qwefjnk;fjrhklbeq");
        instituto.agregarOfertaAcademica(OfertaAcademicaFactory.CODIGO_FULLSTACK);

        instituto.generarInforme();
    }
}