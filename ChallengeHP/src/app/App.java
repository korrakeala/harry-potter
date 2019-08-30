package app;

import app.personajes.*;

public class App {
    public static void main(String[] args) throws Exception {

        JuegoHarryPotter.InicializarJuego();

        Personaje p = JuegoHarryPotter.buscarPersonaje("Harry Potter");
        Wizard p1 = (Wizard) p;
        p = JuegoHarryPotter.buscarPersonaje("Severus Snape");
        Wizard p2 = (Wizard) p;

        System.out.println(p1.nombre + " ataca a " + p2.nombre);
        p1.atacar(p2, p1.buscarHechizo("RictusSempra"));
        System.out.println(p2.nombre + " ataca a " + p1.nombre);
        p2.atacar(p1, "Sectumsempra");
        

    }
}