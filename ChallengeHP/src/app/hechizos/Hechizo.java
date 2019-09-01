package app.hechizos;

/**
 * Hechizo
 */
public class Hechizo extends Poder{

    public boolean esOscuro;
    public double nivelDanio;
    public double nivelCuracion;
    public double nivelEnergia;
    public String nombre;
    public String tipoHechizo;

    public boolean isEsOscuro() {
        return esOscuro;
    }

    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }

    public double getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(double nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public double getNivelCuracion() {
        return nivelCuracion;
    }

    public void setNivelCuracion(double nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }

    public double getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(double nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Hechizo: " + nombre + ". Tipo de Hechizo: " + tipoHechizo + ". Es Oscuro: " 
        + esOscuro + ". Nivel de Curacion: " + nivelCuracion + ". Nivel de Danio: " + nivelDanio +
         ". Nivel de Energia Magica requerido: " + nivelEnergia + ".";
    }
    
}