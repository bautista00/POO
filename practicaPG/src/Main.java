public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(20,500.00);
        System.out.println(cuenta.depositar(1000.00));
        System.out.println(cuenta.retirar(500.00));

    }
}