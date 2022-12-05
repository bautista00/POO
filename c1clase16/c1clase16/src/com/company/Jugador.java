package com.company;

public class Jugador implements Comparable<Jugador> {

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {

        if(this.numeroCamiseta > otroJugador.numeroCamiseta){
            return 1;
        }
        if(this.numeroCamiseta < otroJugador.numeroCamiseta){
            return -1;
        }
        return 0;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    @Override
    public String toString() {
        return "numero: " + numeroCamiseta + " nombre " + nombre;
    }
}
