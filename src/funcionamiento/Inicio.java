/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionamiento;

import categorias.Pregunta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Juliana
 */
public class Inicio implements Serializable{

    static int opcion = 0, puntos;
    String nusuario= new String();
    private static final long serialVersionUID = 1L;
    Usuarios usuario = new Usuarios(nusuario, puntos);
     
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        categorias.Pregunta iniciarPrograma = new Pregunta();
        Usuarios puntosT = new Usuarios("",0);

        Scanner leer = new Scanner(System.in);
        System.out.print("Bienvendio a preguntas random ¿Qué quieres hacer? "
                + "\n 1. Inicio"
                + "\n 2. Puntuación"
                + "\n 3. Información"
                + "\n 4. Salir"
                + "\n Ingresa una opción: ");
        opcion = leer.nextInt();
        System.out.println("");

        switch (opcion) {
            case 1:
                iniciarPrograma.ObetenerP();
                break;

            case 2:
               
                System.out.println("La puntuación máxima es: " + puntosT.getPuntosTotales());
                System.out.println("");
                Inicio.main(args);
                break;

            case 3:
                System.out.println("*******************************************************************");
                System.out.println(" Bienvenido a la pestaña de información, te estaré explicando"
                        + "\n en que consite el juego. Lo primero que tienes que saber es que aquí"
                        + "\n tendrás que responder preguntas de informacuón general de Colombia"
                        + "\n las cuales irán aumentando de dificultad según vayas avanzando, sin"
                        + "\n embargo, si fallas en algúna pregunta tednrás que comenzar de nuevo"
                        + "\n aunque guardaremos tus puntos acumulados, cada pregunta tiene más valor"
                        + "\n que la anterior ¡Buena suerte!");
                System.out.println("*******************************************************************");
                System.out.println("");
                Inicio.main(args);
                break;

            case 4:
                System.out.println("¡Esperamos verte pronto por acá!\n");
                System.exit(0);
                break;

            default:
                System.err.println("Esa opción no está disponible, intentálo de nuevo.\n");
                Inicio.main(args);
                break;
        }

    }

    public void main() throws IOException, FileNotFoundException, ClassNotFoundException {
        String[] args = null;
        this.main(args);
    }
}
