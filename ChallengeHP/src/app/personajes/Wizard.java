package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.Escoba;
import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IHacerMagia;

/**
 * Wizard
 */
public class Wizard implements IHacerMagia {

    public Escoba escoba;
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public boolean magoOscuro;
    public int energiaMagica;


    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    @Override
    public void getPoderInicial() {

    }

    @Override
    public void setPoderInicial(Poder poderInicial) {

    }

    @Override
    public void aprender(Hechizo h) {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

}