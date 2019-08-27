package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * PiedraResurrecion
 */
public class PiedraResurrecion extends Artefacto implements IReliquiaMuerte{

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }
    

    
}