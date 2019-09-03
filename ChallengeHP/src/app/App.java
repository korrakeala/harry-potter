package app;

import java.util.Scanner;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        JuegoHarryPotter.InicializarJuego();

        Personaje p1 = new Personaje();
        p1 = configurarPersonaje1();
        Personaje p2 = new Personaje();
        p2 = configurarPersonaje2(p1);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    public static void pelear(Personaje p1, Personaje p2) {
        IHacerMagia p;

        while (p1.isEstaVivo() && p2.isEstaVivo()) {
            if (p1 instanceof IHacerMagia) {
                p = (IHacerMagia) p1;
                System.out.println("Elegi con que hechizo atacar ingresando su nombre");
                p.listarHechizos();
                String h1 = Teclado.nextLine();
                p.atacar(p2, h1);
                System.out.println(p1.nombre + " ataca a " + p2.nombre + " con el hechizo " + p.getHechizo(h1).nombre); // verificar
                                                                                                                        // que
                                                                                                                        // aparesca
                                                                                                                        // el
                                                                                                                        // nombre
                                                                                                                        // solo
                p.atacar(p2, p.buscarHechizo(h1)); // aca el parametro de atacar() es objeto.
            } else {
                System.out.println("El personaje " + p1.nombre + " no puede atacar porque no hace magia.");
            }
            if (p2 instanceof IHacerMagia) {
                p = (IHacerMagia) p2;
                System.out.println("Elegi con que hechizo atacar ingresando su nombre.");
                p.listarHechizos();
                String h2 = Teclado.nextLine();
                System.out.println(p2.nombre + " ataca a " + p1.nombre + " con el hechizo " + p.getHechizo(h2).nombre);
                p.atacar(p1, h2); // aca el parametro de atacar() es string
            } else {
                System.out.println("El personaje " + p2.nombre + " no puede atacar porque no hace magia.");
            }
        }

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }

    public static Personaje configurarPersonaje1() {
        System.out.println("Elegi el personaje 1 ingresando su Nombre.");
        JuegoHarryPotter.listarPersonajes();
        String p1 = Teclado.nextLine();
        Personaje personaje1 = JuegoHarryPotter.buscarPersonaje(p1);

        siHaceMagia(personaje1);

        if (personaje1 == null) {
            System.out.println("El personaje no existe. Por favor, intente de nuevo.");
            configurarPersonaje1();
        }
        return personaje1;
    }

    public static Personaje configurarPersonaje2(Personaje personaje1) {
        System.out.println("Elegi el personaje 2 ingresando su Nombre.");
        JuegoHarryPotter.listarPersonajes();
        String p2 = Teclado.nextLine();
        Personaje personaje2 = JuegoHarryPotter.buscarPersonaje(p2);
        if (JuegoHarryPotter.buscarPersonaje(p2) != null) {
            if (!personaje2.equals(personaje1)) {

                siHaceMagia(personaje2);

                if (personaje2 == null) {
                    System.out.println("El personaje no existe. Por favor, intente de nuevo.");
                    configurarPersonaje2(personaje1);
                }
                return personaje2;
            } else {
                System.out.println(personaje1.nombre + " ya fue seleccionado. Por favor, elija otro.");
                configurarPersonaje2(personaje1);
            }
        } else {
            System.out.println("El personaje no existe. Por favor, intente de nuevo.");
            configurarPersonaje2(personaje1);
        }
        return null;
    }

    public static void siHaceMagia(Personaje p) {
        if (p instanceof IHacerMagia) {
            IHacerMagia m = (IHacerMagia) p;
            System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarHechizos();
            String hechizo = Teclado.nextLine();
            Hechizo h = new Hechizo();
            while (!hechizo.equals("0")) {
                h = JuegoHarryPotter.buscarHechizo(hechizo);
                if (JuegoHarryPotter.buscarHechizo(hechizo) != null) {
                    if (m.getHechizo(h.nombre) == null) {
                        m.aprender(h);
                        System.out.println("El hechizo " + h.nombre + " fue aprendido.");
                    } else {
                        System.out.println("Ese hechizo ya fue aprendido.");
                    }
                } else {
                    System.out.println("Ese hechizo no existe, elija otro.");
                }
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                hechizo = Teclado.nextLine();
                h = new Hechizo();
            }

            System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarArtefactos();
            String a1 = Teclado.nextLine();
            Artefacto a = new Artefacto();
            while (!a1.equals("0")) {
                a = JuegoHarryPotter.buscarArtefacto(a1);
                if (JuegoHarryPotter.buscarArtefacto(a1) != null) {
                    if (m.getArtefacto(a.nombre) == null) {
                        m.equipar(a);
                        System.out.println("El artefacto " + a.nombre + " fue equipado.");
                    } else {
                        System.out.println("Ese artefacto ya fue equipado.");
                    }
                } else {
                    System.out.println("Ese Artefacto no existe, elija otro.");
                }
                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                a1 = Teclado.nextLine();
                a = new Artefacto();
            }
            System.out.println(m.toStringFull());
            p = (Personaje) m;
        }
    }

}