package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadorList;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadorList = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadorList.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        jugadorList.sort(null);
        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular()){
                System.out.println(jugador);
            }
        }
    }

    public Integer getCantidadDeJugadoresTitularesLesionados(){
        Integer jugadoresTitularesLesionados = 0;
        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular() && jugador.getEstaLesionado()){
                jugadoresTitularesLesionados++;
            }
        }
        return jugadoresTitularesLesionados;

    }
}
