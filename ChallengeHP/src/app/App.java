package app;

import java.util.List;
import java.util.Scanner;

import app.personajes.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        JuegoHarryPotter.InicializarJuego();

        //aca pelean wizardd y wizard
        /*Personaje p = JuegoHarryPotter.buscarPersonaje("Harry Potter");
        Wizard p1 = (Wizard) p;
        p = JuegoHarryPotter.buscarPersonaje("Severus Snape");
        Wizard p2 = (Wizard) p;

        System.out.println(p1.nombre + " ataca a " + p2.nombre);
        p1.atacar(p2, p1.buscarHechizo("RictusSempra"));
        System.out.println(p2.nombre + " ataca a " + p1.nombre);
        p2.atacar(p1, "Sectumsempra");*/

        //aca pelean elfo y elfo
        /*Personaje e = JuegoHarryPotter.buscarPersonaje("Dobby");
        Elfo e1 = (Elfo) e;
        e = JuegoHarryPotter.buscarPersonaje("Kreacher");
        Elfo e2 = (Elfo) e;

        System.out.println(e1.nombre + " ataca a " + e2.nombre);
        e1.atacar(e2, e1.buscarHechizo("RictusSempra"));
        System.out.println(e2.nombre + " ataca a " + e1.nombre);
        e2.atacar(e1, "Petrificus Totalus");*/

        //aca pelean wizard y elfo
        /*Personaje p = JuegoHarryPotter.buscarPersonaje("Harry Potter");
        Wizard p1 = (Wizard) p;
        Personaje e = JuegoHarryPotter.buscarPersonaje("Dobby");
        Elfo e1 = (Elfo) e;

        System.out.println(p1.nombre + " ataca a " + e1.nombre);
        p1.atacar(e1, p1.buscarHechizo("RictusSempra"));
        System.out.println(e1.nombre + " ataca a " + p1.nombre);
        e1.atacar(p1, "RictusSempra");*/

        System.out.println("Elegi el personaje 1");
        for (Personaje p : JuegoHarryPotter.personajes) {
            System.out.println(p.nombre);              
        }
        
    }
}