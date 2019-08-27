package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IHacerMagia;

/**
 * Wizard
 */
public class Wizard implements IHacerMagia {

    private Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }

    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }

    @Override
    public Poder getPoderInicial() {
        return this.poderInicial;
    }


}