package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisibilidad;
import app.hechizos.Parseltongue;
import app.hechizos.Poder;
import app.hechizos.Protego;
import app.hechizos.RictusSempra;
import app.hechizos.Sectumsempra;
import app.hechizos.AvadaKedavra;
import app.hechizos.CaveInimicum;
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

        Elfo dobby = new Elfo();
        dobby.nombre = "Dobby";
        dobby.salud = 100;
        dobby.estaVivo = true;
        dobby.edad = 45;
        Protego pro = new Protego();
        dobby.aprender(pro);
        rs = new RictusSempra();
        dobby.aprender(rs);

        JuegoHarryPotter.personajes.add(dobby);

        Wizard snape = new Wizard();
        snape.nombre = "Severus Snape";
        snape.salud = 100;
        snape.estaVivo = true;
        snape.edad = 65;
        snape.energiaMagica = 1000;
        Sectumsempra sc = new Sectumsempra();
        snape.aprender(sc);
        ci = new CaveInimicum();
        snape.aprender(ci);
        AvadaKedavra ak = new AvadaKedavra();
        snape.aprender(ak);

        JuegoHarryPotter.personajes.add(snape);




        // agregar personajes y elfos, con sus respectivos poderes y artefactos
        // agregar muggles

    }

}