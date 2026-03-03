package musica;

import java.time.LocalDate;

public class Solicitud {

    private Musico interprete;
    private LocalDate fechaSolicitud;
    private LocalDate fechaAutorizacion;
    private Compañia compañia;
    private Composicion composicion;

    public Solicitud(Musico interprete,
                     LocalDate fechaSolicitud,
                     Compañia compañia,
                     Composicion composicion) {

        this.interprete = interprete;
        this.fechaSolicitud = fechaSolicitud;
        this.compañia = compañia;
        this.composicion = composicion;
    }

    public void autorizar(LocalDate fechaAutorizacion){
        if(!fechaAutorizacion.isBefore(this.fechaSolicitud)){
            this.fechaAutorizacion = fechaAutorizacion;
            this.composicion.agregarInterprete(this.interprete);
        }
    }

    public LocalDate getFechaSolicitud(){
        return this.fechaSolicitud;
    }

    public LocalDate getFechaAutorizacion(){
        return this.fechaAutorizacion;
    }

    public Musico getInterprete(){
        return this.interprete;
    }

    public Compañia getCompania(){
        return this.compañia;
    }

    public Composicion getComposicion(){
        return this.composicion;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "interprete=" + interprete +
                ", fechaSolicitud=" + fechaSolicitud +
                ", fechaAutorizacion=" + fechaAutorizacion +
                ", compania=" + compañia +
                '}';
    }
}
