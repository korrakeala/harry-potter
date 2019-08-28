package app;

import app.interfaces.IEsMagico;

/**
 * Escoba
 */
public class Escoba extends Transporte implements IEsMagico{

<<<<<<< HEAD
=======
    public String nombre;

>>>>>>> a104b3b4312a92426dfa50e010688f7b3f6e07c5
    public Escoba(String string) {
	}

	@Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    
}