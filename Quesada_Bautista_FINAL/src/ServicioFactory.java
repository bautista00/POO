
public class ServicioFactory {

    private static ServicioFactory instance;

    public ServicioFactory() {
    }

    public static ServicioFactory getInstance() {
        if(instance == null){
            instance = new ServicioFactory();
        }
        return instance;
    }
    public Servicio generarServicio(String codigo){
        switch (codigo){
            case "Venta Aire Acondicionado" :
                return new Simple("Servicio Simple","venta de aire",65000.0,false);
            case "Colocacion Aire Acondicionado" :
                return new Simple("Servicio Simple","colocacion de aire",10000.0,true);
            case "Full Aire Acondicionado" :
                Combo servicioCombo = new Combo("Full Combo","venta y colocacion",10);
                servicioCombo.agregarServicio(this.generarServicio("Venta Aire Acondicionado"));
                servicioCombo.agregarServicio(this.generarServicio("Colocacion Aire Acondicionado"));
                return servicioCombo;
        }
        return null;
    }
}
