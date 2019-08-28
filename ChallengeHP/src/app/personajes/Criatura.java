package app.personajes;

import app.interfaces.IEsMagico;

/**
 * Criatura
 */
public class Criatura implements IEsMagico {

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    public Criatura() {
    }

    
}