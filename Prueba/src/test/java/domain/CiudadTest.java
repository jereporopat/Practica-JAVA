package domain;

import Domain.lugares.Aeropuerto;
import Domain.lugares.Ciudad;
import org.junit.Assert;
import org.junit.Test;

public class CiudadTest {

    @Test

    public void ciudadTieneDosAeropuertos(){
        Ciudad unaCiudad = new Ciudad("Ezeiza");

        Aeropuerto unAeropuerto = new Aeropuerto();

        unaCiudad.agregarAeropuertos(unAeropuerto);

        Assert.assertEquals(1, unaCiudad.cantDeAeropuertos().intValue());
    }
}
