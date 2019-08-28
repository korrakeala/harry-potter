package app.artefactos;

import app.hechizos.Invisibilidad;
import app.interfaces.IReliquiaMuerte;

/**
 * CapaInvisibilidad
 */
public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }

    public CapaInvisibilidad() {
        this.poder = new Invisibilidad();
    }


  
    
}