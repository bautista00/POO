package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Equipo equipo = new Equipo("Milan");
        equipo.agregarJugador(new Jugador(5,"Quintero",false,true));
        equipo.agregarJugador(new Jugador(10,"Maldini",true,true));
        equipo.agregarJugador(new Jugador(3,"Yusty",false,false));
        equipo.agregarJugador(new Jugador(1,"Dida",true,true));
        equipo.agregarJugador(new Jugador(9,"Atom",false,true));
        equipo.agregarJugador(new Jugador(8,"Kun",true,false));

        equipo.mostrarJugadoresTitulares();

        System.out.println(equipo.getCantidadDeJugadoresTitularesLesionados());
    }
}
