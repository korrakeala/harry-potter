package app;

import app.interfaces.IEsMagico;

/**
 * Tren
 */
public class Tren extends Transporte implements IEsMagico{

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    
}