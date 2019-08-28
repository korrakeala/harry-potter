package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * Horrocrux
 */
public class Horrocrux extends Artefacto implements IReliquiaMuerte {

    public Horrocrux() {
    }

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }

    
}