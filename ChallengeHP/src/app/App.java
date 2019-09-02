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
                // elegir con que hechizo de la lista de p atacar, y asignar a una variable del
                // tipo que corresponda
                System.out.println(p1.nombre + " ataca a " + p2.nombre + " con el hechizo (y poner la variable)");
                p.atacar(p2, p.buscarHechizo("RictusSempra")); // aca el parametro de atacar() es objeto
            } else {
                System.out.println("El personaje no puede atacar porque no es magico.");
            }
            if (p2 instanceof IHacerMagia) {
                p = (IHacerMagia) p2;
                // elegir con que hechizo de la lista de p atacar, y asignar a una variable del
                // tipo que corresponda
                System.out.println(p2.nombre + " ataca a " + p1.nombre + " con el hechizo (y poner la variable)");
                p.atacar(p1, "Sectumsempra"); // aca el parametro de atacar() es string
            } else {
                System.out.println("El personaje no puede atacar porque no es magico.");
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
        // Pasar estos dos ifs a metodos separados para volver a usarlos en
        // configurarPersonaje2()
        if (personaje1 instanceof Wizard) { // usar IHacerMagia para hacer uno solo no funciona por la asignacion del
                                            // final.
            Wizard w = (Wizard) personaje1;
            System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarHechizos();
            String hechizo = Teclado.nextLine();
            Hechizo h = new Hechizo(); // esto va?
            while (!hechizo.equals("0")) {
                h = JuegoHarryPotter.buscarHechizo(hechizo);
                if (w.getHechizo(h.nombre) == null) { // por que vuelve a la primera posicion de la lista estatica?
                    w.aprender(h);
                    System.out.println("El hechizo " + h.nombre + " fue aprendido.");
                } else {
                    System.out.println("Ese hechizo ya fue aprendido.");
                }
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                hechizo = Teclado.nextLine();
                h = new Hechizo(); // esto va?
            }

            System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarArtefactos();
            String a1 = Teclado.nextLine();
            Artefacto a = new Artefacto();
            while (!a1.equals("0")) {
                a = JuegoHarryPotter.buscarArtefacto(a1);
                if (w.getArtefacto(a.nombre) == null) { // revisar que pasa con estas busquedas
                    w.equipar(a);
                    System.out.println("El artefacto " + a.nombre + " fue equipado.");
                } else {
                    System.out.println("Ese artefacto ya fue equipado.");
                }
                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                a1 = Teclado.nextLine();
                a = new Artefacto();
            }
            personaje1 = w;
        }

        if (personaje1 instanceof Elfo) {
            Elfo e = (Elfo) personaje1;
            System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarHechizos();
            String h1 = Teclado.nextLine();
            Hechizo h = new Hechizo();
            while (!h1.equals("0")) {
                h = JuegoHarryPotter.buscarHechizo(h1);
                if (e.getHechizo(h.nombre) == null) {
                    e.aprender(h);
                    System.out.println("El hechizo " + h.nombre + " fue aprendido.");
                } else {
                    System.out.println("Ese hechizo ya fue aprendido.");
                }
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                h1 = Teclado.nextLine();
                h = new Hechizo();
            }

            System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
            JuegoHarryPotter.listarArtefactos();
            String a1 = Teclado.nextLine();
            Artefacto a = new Artefacto();
            while (!a1.equals("0")) {
                a = JuegoHarryPotter.buscarArtefacto(a1);
                if (e.getArtefacto(a.nombre) == null) {
                    e.equipar(a);
                    System.out.println("El artefacto " + a.nombre + " fue equipado.");
                } else {
                    System.out.println("Ese artefacto ya fue equipado.");
                }
                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                a1 = Teclado.nextLine();
                a = new Artefacto();
            }
            personaje1 = e;
        }

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

        if (!personaje2.equals(personaje1)) {
            if (personaje2 instanceof Wizard) {
                Wizard w = (Wizard) personaje2;
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                String h1 = Teclado.nextLine();
                Hechizo h = new Hechizo();
                while (!h1.equals("0")) {
                    h = JuegoHarryPotter.buscarHechizo(h1);
                    if (w.getHechizo(h.nombre) == null) {
                        w.aprender(h);
                        System.out.println("El hechizo " + h.nombre + " fue aprendido.");
                    } else {
                        System.out.println("Ese hechizo ya fue aprendido.");
                    }
                    System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarHechizos();
                    h1 = Teclado.nextLine();
                    h = new Hechizo();
                }

                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                String a1 = Teclado.nextLine();
                Artefacto a = new Artefacto();
                while (!a1.equals("0")) {
                    a = JuegoHarryPotter.buscarArtefacto(a1);
                    if (w.getArtefacto(a.nombre) == null) {
                        w.equipar(a);
                        System.out.println("El artefacto " + a.nombre + " fue equipado.");
                    } else {
                        System.out.println("Ese artefacto ya fue equipado.");
                    }
                    System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarArtefactos();
                    a1 = Teclado.nextLine();
                    a = new Artefacto();
                }
                personaje2 = w;
            }

            if (personaje2 instanceof Elfo) {
                Elfo e = (Elfo) personaje2;
                System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarHechizos();
                String h1 = Teclado.nextLine();
                Hechizo h = new Hechizo();
                while (!h1.equals("0")) {
                    h = JuegoHarryPotter.buscarHechizo(h1);
                    if (e.getHechizo(h.nombre) == null) {
                        e.aprender(h);
                        System.out.println("El hechizo " + h.nombre + " fue aprendido.");
                    } else {
                        System.out.println("Ese hechizo ya fue aprendido.");
                    }
                    System.out.println("Elegi que hechizos aprender ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarHechizos();
                    h1 = Teclado.nextLine();
                    h = new Hechizo();
                }

                System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                JuegoHarryPotter.listarArtefactos();
                String a1 = Teclado.nextLine();
                Artefacto a = new Artefacto();
                while (!a1.equals("0")) {
                    a = JuegoHarryPotter.buscarArtefacto(a1);
                    if (e.getArtefacto(a.nombre) == null) {
                        e.equipar(a);
                        System.out.println("El artefacto " + a.nombre + " fue equipado.");
                    } else {
                        System.out.println("Ese artefacto ya fue equipado.");
                    }
                    System.out.println("Elegi que artefactos equipar ingresando su Nombre. Para terminar, ingresa 0.");
                    JuegoHarryPotter.listarArtefactos();
                    a1 = Teclado.nextLine();
                    a = new Artefacto();
                }
                personaje2 = e;
            }

            if (personaje2 == null) {
                System.out.println("El personaje no existe. Por favor, intente de nuevo.");
                configurarPersonaje2(personaje1);
            }
            return personaje2;
        } else {
            System.out.println(personaje1.nombre + " ya fue seleccionado. Por favor, elija otro.");
            configurarPersonaje2(personaje1);
        }
        return null;
    }

}