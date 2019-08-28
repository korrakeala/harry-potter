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
    int s = enemigo.salud;
    double d = hechizo.nivelDanio;
    double danioAdicional = 0;
    double curacion = 0;
    double danioTotal;
    double curacionTotal;
    IHacerMagia e;

    for (int i = 0; i < artefactos.size(); i++) {
      danioAdicional += (d * this.artefactos.get(i).amplificadorDanio);
    }

    if (enemigo instanceof IHacerMagia) {
      e = (IHacerMagia) enemigo;
      for (int i = 0; i < e.getArtefactos().size(); i++) {
        curacion += (s * e.getArtefactos().get(i).amplificadorSalud);
      }
    }

    danioTotal = d + danioAdicional;

    curacionTotal = s + curacion;

    enemigo.salud = (int) (curacionTotal - danioTotal);

    if (enemigo.salud > 100) {
      enemigo.salud = 100;
    }
    if (enemigo.salud < 1) {
      enemigo.estaVivo = false;
    }

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
    this.hechizos.add(h);
  }

  @Override
  public List<Artefacto> getArtefactos() {
    return artefactos;
  }

  @Override
  public void atacar(Personaje p, String nombreHechizo) {

  }

}