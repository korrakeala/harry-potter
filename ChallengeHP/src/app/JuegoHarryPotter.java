package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.hechizos.Parseltongue;
import app.hechizos.Poder;
import app.hechizos.RictusSempra;
import app.hechizos.CaveInimicum;
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
        Wizard harry = new Wizard();
        harry.nombre = "Harry Potter";
        harry.salud = 100;
        harry.estaVivo = true;
        harry.edad = 30;
        harry.energiaMagica = 1000;
        Poder parsel = new Parseltongue();
        harry.setPoderInicial(parsel);
        harry.escoba = new Escoba("Saeta de Fuego");
        Artefacto capa = new CapaInvisibilidad();
        harry.artefactos.add(capa);
        CaveInimicum ci = new CaveInimicum();
        harry.aprender(ci);
        RictusSempra rs = new RictusSempra();
        harry.aprender(rs);
        

        JuegoHarryPotter.personajes.add(harry);

        // agregar personajes y elfos, con sus respectivos poderes y artefactos
        // agregar muggles

    }

}