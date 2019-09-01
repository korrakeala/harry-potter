package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.personajes.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        JuegoHarryPotter.InicializarJuego();

        Personaje p1 = new Personaje();
        p1 = configurarPersonaje1();

        System.out.println(p1);

        // aca pelean wizardd y wizard
        /*
         * Personaje p = JuegoHarryPotter.buscarPersonaje("Harry Potter"); Wizard p1 =
         * (Wizard) p; p = JuegoHarryPotter.buscarPersonaje("Severus Snape"); Wizard p2
         * = (Wizard) p;
         * 
         * System.out.println(p1.nombre + " ataca a " + p2.nombre); p1.atacar(p2,
         * p1.buscarHechizo("RictusSempra")); System.out.println(p2.nombre + " ataca a "
         * + p1.nombre); p2.atacar(p1, "Sectumsempra");
         */

        // aca pelean elfo y elfo
        /*
         * Personaje e = JuegoHarryPotter.buscarPersonaje("Dobby"); Elfo e1 = (Elfo) e;
         * e = JuegoHarryPotter.buscarPersonaje("Kreacher"); Elfo e2 = (Elfo) e;
         * 
         * System.out.println(e1.nombre + " ataca a " + e2.nombre); e1.atacar(e2,
         * e1.buscarHechizo("RictusSempra")); System.out.println(e2.nombre + " ataca a "
         * + e1.nombre); e2.atacar(e1, "Petrificus Totalus");
         */

        // aca pelean wizard y elfo
        /*
         * Personaje p = JuegoHarryPotter.buscarPersonaje("Harry Potter"); Wizard p1 =
         * (Wizard) p; Personaje e = JuegoHarryPotter.buscarPersonaje("Dobby"); Elfo e1
         * = (Elfo) e;
         * 
         * System.out.println(p1.nombre + " ataca a " + e1.nombre); p1.atacar(e1,
         * p1.buscarHechizo("RictusSempra")); System.out.println(e1.nombre + " ataca a "
         * + p1.nombre); e1.atacar(p1, "RictusSempra");
         */

    }

    public static Personaje configurarPersonaje1() {
        System.out.println("Elegi el personaje 1 ingresando su Nombre.");
        JuegoHarryPotter.listarPersonajes();
        String p1 = Teclado.nextLine();
        Personaje personaje1 = JuegoHarryPotter.buscarPersonaje(p1);

        if (personaje1 instanceof Wizard) {
            Wizard w = (Wizard) personaje1;
            System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarHechizos();
            String h1 = Teclado.nextLine();
            while (!h1.equals("0")) {
                Hechizo h = JuegoHarryPotter.buscarHechizo(h1);
                if (w.getHechizo(h.nombre) == null) {
                    w.aprender(h);
                } else {
                    System.out.println("Ese hechizo ya fue aprendido.");
                }
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                h1 = Teclado.nextLine();
            }

            System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarArtefactos();
            String a1 = Teclado.nextLine();
            while (!a1.equals("0")) {
                Artefacto a = JuegoHarryPotter.buscarArtefacto(a1);
                if (w.getArtefacto(a.nombre) == null) {
                    w.artefactos.add(a);
                } else {
                    System.out.println("Ese artefacto ya fue equipado.");
                }
                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                a1 = Teclado.nextLine();
            }
            personaje1 = w;
        }

        if (personaje1 instanceof Elfo) {
            Elfo e = (Elfo) personaje1;
            System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarHechizos();
            String h1 = Teclado.nextLine();
            while (!h1.equals("0")) {
                Hechizo h = JuegoHarryPotter.buscarHechizo(h1);
                if (e.getHechizo(h.nombre) == null) {
                    e.aprender(h);
                } else {
                    System.out.println("Ese hechizo ya fue aprendido.");
                }
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                h1 = Teclado.nextLine();
            }

            System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarArtefactos();
            String a1 = Teclado.nextLine();
            while (!a1.equals("0")) {
                Artefacto a = JuegoHarryPotter.buscarArtefacto(a1);
                if (e.getArtefacto(a.nombre) == null) {
                    e.artefactos.add(a);
                } else {
                    System.out.println("Ese artefacto ya fue equipado.");
                }
                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                a1 = Teclado.nextLine();
            }
            personaje1 = e;
        }

        return personaje1;
    }

    public static Personaje configurarPersonaje2(Personaje personaje1) {
        System.out.println("Elegi el personaje 2 ingresando su Nombre.");
        JuegoHarryPotter.listarPersonajes();
        String p2 = Teclado.nextLine();
        Personaje personaje2 = JuegoHarryPotter.buscarPersonaje(p2);
        if (!personaje2.equals(personaje1)) {
            if (personaje2 instanceof Wizard) {
                Wizard w = (Wizard) personaje2;
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                String h1 = Teclado.nextLine();
                while (!h1.equals("0")) {
                    Hechizo h = JuegoHarryPotter.buscarHechizo(h1);
                    if (w.getHechizo(h.nombre) == null) {
                        w.aprender(h);
                    } else {
                        System.out.println("Ese hechizo ya fue aprendido.");
                    }
                    System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarHechizos();
                    h1 = Teclado.nextLine();
                }

                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                String a1 = Teclado.nextLine();
                while (!a1.equals("0")) {
                    Artefacto a = JuegoHarryPotter.buscarArtefacto(a1);
                    if (w.getArtefacto(a.nombre) == null) {
                        w.artefactos.add(a);
                    } else {
                        System.out.println("Ese artefacto ya fue equipado.");
                    }
                    System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarArtefactos();
                    a1 = Teclado.nextLine();
                }
                personaje2 = w;
            }

            if (personaje2 instanceof Elfo) {
                Elfo e = (Elfo) personaje2;
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                String h1 = Teclado.nextLine();
                while (!h1.equals("0")) {
                    Hechizo h = JuegoHarryPotter.buscarHechizo(h1);
                    if (e.getHechizo(h.nombre) == null) {
                        e.aprender(h);
                    } else {
                        System.out.println("Ese hechizo ya fue aprendido.");
                    }
                    System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarHechizos();
                    h1 = Teclado.nextLine();
                }

                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                String a1 = Teclado.nextLine();
                while (!a1.equals("0")) {
                    Artefacto a = JuegoHarryPotter.buscarArtefacto(a1);
                    if (e.getArtefacto(a.nombre) == null) {
                        e.artefactos.add(a);
                    } else {
                        System.out.println("Ese artefacto ya fue equipado.");
                    }
                    System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarArtefactos();
                    a1 = Teclado.nextLine();
                }
                personaje2 = e;
            }

            return personaje2;
        } else {
            System.out.println(personaje1.nombre + " ya fue seleccionado. Por favor, elija otro.");
            configurarPersonaje2(personaje1);
        }
        return null;
    }

}