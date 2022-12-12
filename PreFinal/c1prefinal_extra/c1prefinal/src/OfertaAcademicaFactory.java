public class OfertaAcademicaFactory {


    public static final String CODIGO_FRONTEND = "FRONTEND";
    public static final String CODIGO_BACKEND = "BACKEND";
    public static final String CODIGO_FULLSTACK = "FULLSTACK";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException{
        switch (codigo){
            case CODIGO_FRONTEND:
                return new Curso("Front end","casi que es programar",16.0,1000.0,2.0);
            case CODIGO_BACKEND:
                return new Curso("Back end","aguante java",20.0,900.0,2.0);
            case CODIGO_FULLSTACK:
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("Full stack","completo",0.20);
                programaIntensivo.agregarOferta(this.generarOfertaAcademica(CODIGO_FRONTEND));
                programaIntensivo.agregarOferta(this.generarOfertaAcademica(CODIGO_BACKEND));
                return programaIntensivo;
        }
        throw new OfertaAcademicaFactoryException(codigo + " no es un codigo valido");
    }
}
