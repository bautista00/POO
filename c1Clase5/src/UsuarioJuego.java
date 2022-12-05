


public class UsuarioJuego {
    //ATRIBUTOS
    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

    //CONSTRUCTOR
        public UsuarioJuego (String nombre,String clave, Integer puntaje, Integer nivel){
            this.nombre= nombre;
            this.clave= clave;
            this.puntaje= puntaje;
            this.nivel= nivel;
        }

    //METODOS
        public void aumentarPuntaje(){
            this.puntaje += 1;
        }
        public void subirNivel(){
            this.nivel= nivel++;

        }
        public void bonus(Integer valor) {
            this.puntaje += valor;
        }


        //SET&&GETTER

        public Integer getPuntaje() {
        return puntaje;
    }

        public Integer getNivel() {
            return nivel;
        }

        public void setNivel(Integer nivel) {
            this.nivel = nivel;
    }

        public void setNombre(String nombre) {
            this.nombre = nombre;
    }

}
