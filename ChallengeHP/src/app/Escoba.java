package app;

import app.interfaces.IEsMagico;

/**
 * Escoba
 */
public class Escoba implements IEsMagico{

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    
}