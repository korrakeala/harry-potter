package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;

/**
 * Wizard
 */
public class Wizard implements IHacerMagia {

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    @Override
    public void atacar(app.personajes.Personaje enemigo, Hechizo hechizo) {

    }


}