package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * CapaInvisibilidad
 */
public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte{

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }
    

    
}