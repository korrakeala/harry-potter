package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;

/**
 * Wizard
 */
public class Wizard implements IHacerMagia {

    private int poderInicial;
    

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();


}