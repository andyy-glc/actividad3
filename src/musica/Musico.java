package musica;

public class Musico {

    private String nombre;

    public Musico(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}