package Domain.personas;

import Domain.lugares.Ciudad;
import Domain.lugares.Pais;
import Domain.viajes.Vuelo;

import java.util.List;

public class Pasajero extends Persona {
    private List<Vuelo> vuelos;
    private Integer nroDePasaporte;
    private Pais pais;

    public Pasajero(String nombre) {
        super(nombre);
    }
    public Integer cantVecesQueVisitaste(Ciudad unaCiudad){

        return (int) this.vuelos
                .stream()
                .filter(v -> v.tuDestinoEs(unaCiudad))
                .count();
    }
}
