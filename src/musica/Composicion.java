package musica;

import java.time.LocalDate;

public class Composicion {

    private String titulo;
    private int minutos;
    private int segundos;
    private String genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaEstreno;
    private Musico autor;

    private Musico interpretes[];
    private int indiceInterpretes;
    private int limiteInterpretes;

    private Solicitud solicitudes[];
    private int indiceSolicitudes;
    private int limiteSolicitudes;

    public Composicion(String titulo, int minutos, int segundos,
                       String genero, LocalDate fechaRegistro,
                       LocalDate fechaEstreno, Musico autor,
                       int limiteInterpretes, int limiteSolicitudes) {

        this.titulo = titulo;
        this.minutos = minutos;
        this.segundos = segundos;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;
        this.autor = autor;

        this.limiteInterpretes = limiteInterpretes;
        this.interpretes = new Musico[limiteInterpretes];
        this.indiceInterpretes = 0;

        this.limiteSolicitudes = limiteSolicitudes;
        this.solicitudes = new Solicitud[limiteSolicitudes];
        this.indiceSolicitudes = 0;
    }


    public void agregarInterprete(Musico interprete){
        if(this.indiceInterpretes < this.limiteInterpretes){
            this.interpretes[this.indiceInterpretes] = interprete;
            this.indiceInterpretes++;
        }
    }

    public void agregarSolicitud(Solicitud solicitud){
        if(this.indiceSolicitudes < this.limiteSolicitudes){
            this.solicitudes[this.indiceSolicitudes] = solicitud;
            this.indiceSolicitudes++;
        }
    }

    public String getTitulo(){
        return this.titulo;
    }

    @Override
    public String toString() {
        return "Composicion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + minutos + ":" + segundos +
                ", genero='" + genero + '\'' +
                ", autor=" + autor +
                ", cantidadInterpretes=" + indiceInterpretes +
                ", cantidadSolicitudes=" + indiceSolicitudes +
                '}';
    }
}
