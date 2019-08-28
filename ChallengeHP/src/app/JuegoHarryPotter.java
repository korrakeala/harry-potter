package app;

import java.util.ArrayList;
import java.util.List;

import app.personajes.Personaje;
import app.personajes.Wizard;

/**
 * JuegoHarryPotter
 */
public class JuegoHarryPotter {

    List<Personaje> personajes = new ArrayList<Personaje>();

    public void inicializarJuego() {

    }

    public static void agregarPersonajes(){
        Personaje p = new Wizard();
        p.nombre = "Harry Potter";
        p.salud = 100;
        p.estaVivo = true;
        p.edad = 30;



    }

}