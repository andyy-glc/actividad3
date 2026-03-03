package musica;

public class Compañia {

    private String nombre;

    public Compañia(String nombre){
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