package app.artefactos;

import app.hechizos.Poder;
import app.interfaces.IEsMagico;

/**
 * Artefacto
 */
public class Artefacto implements IEsMagico {

    public Poder poder;
    public double amplificadorDanio;
    public double amplificadorSalud;

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }
}