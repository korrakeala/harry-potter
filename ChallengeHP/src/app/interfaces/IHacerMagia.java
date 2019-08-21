package app.interfaces;

import app.hechizos.Hechizo;
import app.personajes.Personaje;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    void atacar(Personaje enemigo, Hechizo hechizo);

// getPoderInicial()
// setPoderInicial(Poder p)
// Aprender(Hechizo h)
// getArtefactos() -> List<Artefacto>
// Atacar(Personaje p, Hechizo h)
// Atacar(Personaje p, String nombreHechizo)
}