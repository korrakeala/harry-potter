package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.Escoba;
import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.hechizos.Poder;
import app.interfaces.IHacerMagia;

/**
 * Wizard
 */
public class Wizard extends Personaje implements IHacerMagia {

    public Escoba escoba;
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public boolean magoOscuro;
    public int energiaMagica;


    @Override
    public void atacar(Personaje enemigo, Hechizo hechizo) {
        int s = enemigo.salud;
        double d = hechizo.nivelDanio;
        double danioAdicional = 0;
        double curacion = 0;
        double danioTotal;
        double curacionTotal;
        IHacerMagia e;
        
        for (int i = 0; i < artefactos.size(); i++) {
            danioAdicional += (d * this.artefactos.get(i).amplificadorDanio);
        }

        if (enemigo instanceof IHacerMagia) {
            e = (IHacerMagia) enemigo;
            for (int i = 0; i < e.getArtefactos().size(); i++) {
                curacion += (s * e.getArtefactos().get(i).amplificadorSalud);
            }
        }

        danioTotal = d + danioAdicional;

        if (hechizo.esOscuro) {
            this.magoOscuro = true;
        }

        if (this.magoOscuro) {
            danioTotal *= 2;
        }

        curacionTotal = s + curacion;

        enemigo.salud = (int) (curacionTotal - danioTotal);
        
        if (enemigo.salud > 100) {
            enemigo.salud = 100;
        }
        if (enemigo.salud < 1) {
            enemigo.estaVivo = false;
        }

    }

    @Override
    public Poder getPoderInicial() {
        return poderInicial;
    }

    @Override
    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    @Override
    public void aprender(Hechizo h) {
        this.hechizos.add(h);
    }

    @Override
    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    @Override
    public void atacar(Personaje p, String nombreHechizo) {

    }

}