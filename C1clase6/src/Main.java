



public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("gonzalo","caniche",6.57,2015,false,true);
        System.out.println(perro.adoptable());
        System.out.println(perro.edadPerro());
        System.out.println(perro.puedePerderse());

        Perro otroPerro = new Perro("Felipe","golden",2018);
        System.out.println(otroPerro.edadPerro());

    }
}