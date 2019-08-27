package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * VaritaSauco
 */
public class VaritaSauco extends Varita implements IReliquiaMuerte{

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }
    

    
}