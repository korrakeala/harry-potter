package app;

import app.personajes.*;

public class App {
    public static void main(String[] args) throws Exception {

        JuegoHarryPotter.InicializarJuego();

        Personaje p = JuegoHarryPotter.buscarPersonaje("Harry Potter");
        Wizard p1 = (Wizard) p;
        p = JuegoHarryPotter.buscarPersonaje("Severus Snape");
        Wizard p2 = (Wizard) p;

        p1.atacar(p2, p1.buscarHechizo("RictusSempra"));
        p2.atacar(p1, "Sectumsempra");
        

    }
}