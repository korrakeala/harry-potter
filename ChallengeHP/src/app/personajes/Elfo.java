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
public class Elfo implements IHacerMagia{

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

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