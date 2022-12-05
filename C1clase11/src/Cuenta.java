



public abstract class Cuenta {
    private String clienteAsociado;
    private Double saldoDisponible;

    public Cuenta(String clienteAsociado, Double saldoDisponible) {
        this.clienteAsociado = clienteAsociado;
        this.saldoDisponible = saldoDisponible;
    }

    public void informarSaldo(){
        System.out.println("tu saldo es de: " + this.saldoDisponible);
    }
    public void  extraerEfectivo(Double extraccion){
            saldoDisponible -= extraccion;
    }
    public void despositarEfectivo(Double deposito){
            saldoDisponible += deposito;
    }
}
