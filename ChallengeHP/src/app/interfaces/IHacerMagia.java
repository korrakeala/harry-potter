package app.interfaces;

import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.personajes.Personaje;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    void atacar(Personaje enemigo, Hechizo hechizo);
    Poder getPoderInicial();
    void setPoderInicial(Poder poderInicial);
// Aprender(Hechizo h)
// getArtefactos() -> List<Artefacto>
// Atacar(Personaje p, Hechizo h)
// Atacar(Personaje p, String nombreHechizo)
}