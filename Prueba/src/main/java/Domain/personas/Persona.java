package Domain.personas;

public abstract class Persona {
    protected  String nombre;
    protected  String apellido;
    protected Integer nroDeDocumento;
    protected  TipoDeDocumento tipoDeDocumento;

    public Persona (String nombre){
        this.nombre = nombre;
    }
}
