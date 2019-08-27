package app.personajes;

import java.util.ArrayList;
import java.util.List;

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
  public Poder getPoderInicial() {
    return null;
  }

  @Override
  public void setPoderInicial(Poder poderInicial) {

	}

}