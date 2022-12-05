

public class Main {
    public static void main(String[] args) {

        UsuarioJuego usuarioUno = new UsuarioJuego("Gustavo", "hola_345",0,0);

        UsuarioJuego usuarioDos = new UsuarioJuego("Gonzalito","lolxd",0,0);

        usuarioUno.aumentarPuntaje();
        usuarioUno.subirNivel();
        usuarioUno.bonus(2);



    }
}
