public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo){
        switch (codigo){
            case "FRONTEND" :
                return new Curso("Front end","casi que es programar",16.0,1000.0,2.0);
            case "BACKEND" :
                return new Curso("Back end","aguante java",20.0,900.0,2.0);
            case "FULLSTACK" :
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("Full stack","completo",0.20);
                programaIntensivo.agregarOferta(this.generarOfertaAcademica("FRONTEND"));
                programaIntensivo.agregarOferta(this.generarOfertaAcademica("BACKEND"));
                return programaIntensivo;
        }
        return null;
    }
}
