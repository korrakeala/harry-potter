package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IHacerMagia;

/**
 * Elfo
 */
public class Elfo extends Personaje implements IHacerMagia {

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();

  @Override
  public void atacar(Personaje enemigo, Hechizo hechizo) {

  }

  @Override
  public Poder getPoderInicial() {
    return null;

  }

  @Override
  public void setPoderInicial(Poder poderInicial) {

  }

  @Override
  public void aprender(Hechizo h) {

  }

  @Override
  public List<Artefacto> getArtefactos() {
    return artefactos;
  }

  @Override
  public void atacar(Personaje p, String nombreHechizo) {

  }

      
}