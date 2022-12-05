

public class Cuenta {
        private int numeroDeCuenta;
        private Double saldo;

    public Cuenta(int numeroDeCuenta, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    //crear la funcion depositar y retirar aca
        public double depositar(double cantidadDeDinero){
            return(this.saldo = this.saldo + cantidadDeDinero );
        }
        public double retirar(double cantidadDeDinero){
            return(this.saldo = this.saldo - cantidadDeDinero);
        }
        //no tocar estas funciones
        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        public Double getSaldo() {
            return saldo;
        }
    }



