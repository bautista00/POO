public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("Hamburguesa",5.0);
        Producto papasFritas = new Producto("PapasFritas",2.0);
        Producto gaseosa = new Producto("Gaseosa",1.5);
        Producto helado = new Producto("Helado",2.0);

        Combo combo1 = new Combo(0.1);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(papasFritas);
        combo1.agregarComprable(gaseosa);

        Combo combo2 = new Combo(0.20);
        combo2.agregarComprable(combo1);
        combo2.agregarComprable(combo1);

        Combo combo3 = new Combo(0.25);
        combo3.agregarComprable(combo2);
        combo3.agregarComprable(combo1);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);

        Carrito carrito = new Carrito();
        carrito.agregarComprable(combo1);
        carrito.agregarComprable(combo2);
        carrito.agregarComprable(combo3);

        System.out.println(carrito.calcularTotalCarrito());

    }
}