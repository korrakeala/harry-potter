package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.hechizos.Parseltongue;
import app.hechizos.Poder;
import app.personajes.Elfo;
import app.personajes.Personaje;
import app.personajes.Wizard;

/**
 * JuegoHarryPotter
 */
public class JuegoHarryPotter {

    public static List<Personaje> personajes = new ArrayList<Personaje>();

    public void inicializarJuego() {

    }

    public static void agregarPersonajes() {
        Personaje p = new Wizard();
        Wizard harry = (Wizard) p;
        harry.nombre = "Harry Potter";
        harry.salud = 100;
        harry.estaVivo = true;
        harry.edad = 30;
        Poder parsel = new Parseltongue();
        harry.setPoderInicial(parsel);
        harry.escoba = new Escoba("Saeta de Fuego");
        Artefacto capa = new CapaInvisibilidad();
        harry.artefactos.add(capa);


        JuegoHarryPotter.personajes.add(harry);

    
    }

}