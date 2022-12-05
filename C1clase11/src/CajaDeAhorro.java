






public class CajaDeAhorro extends Cuenta {

    private Double tasaDeInteres;


    public CajaDeAhorro(String clienteAsociado, Double saldoDisponible, Double tasaDeInteres) {
        super(clienteAsociado, saldoDisponible);
        this.tasaDeInteres = tasaDeInteres;
    }


}
