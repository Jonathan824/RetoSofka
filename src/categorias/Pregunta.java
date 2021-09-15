/*
 Código para obetener preguntas y respuestas, adicional a eso verificar si son
 correctas o incorrectas
 */
package categorias;

import funcionamiento.Inicio;
import funcionamiento.Usuarios;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author Jonathan Murillo Jaramillo
 */
public class Pregunta {

    static String p1; // Variables que obtienen preguntas
    static int r1, r2, r3, r4, r5, puntos = 0; // Variables que obtienen respuestas
    Categoria1 ron1 = new Categoria1(); // Objeto Categoria1
    Categoria2 ron2 = new Categoria2(); // Objeto Categoria2
    Categoria3 ron3 = new Categoria3(); // Objeto Categoria3
    Categoria4 ron4 = new Categoria4(); // Objeto Categoria4
    Categoria5 ron5 = new Categoria5(); // Objeto Categoria5
    funcionamiento.Inicio reinicio = new Inicio(); // Objeto reinicio
    funcionamiento.Usuarios puntosT = new Usuarios("a",0); // Objeto puntuación
    Scanner leer = new Scanner(System.in); // Ingreso de datos por consola
    int aleatorio = (int) (Math.random() * 5 + 1); // Generaciónd de número aleatorio

    static int ronda = 1; // Variable de control de rondas

    public Pregunta() {
        puntos = puntosT.getPuntosTotales();
    }

    public void ObetenerP() throws IOException, IOException, IOException, IOException, IOException, IOException, IOException, IOException, IOException, IOException, ClassNotFoundException { // Método para obetener preguntas de todas las categorias
        switch (ronda) {
            case 1:
                if (aleatorio == 1) {
                    p1 = ron1.getP1();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 2) {
                    p1 = ron1.getP2();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 3) {
                    p1 = ron1.getP3();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 4) {
                    p1 = ron1.getP4();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else {
                    p1 = ron1.getP5();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                }

                break;
            case 2:
                if (aleatorio == 1) {
                    p1 = ron2.getP1();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 2) {
                    p1 = ron2.getP2();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 3) {
                    p1 = ron2.getP3();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 4) {
                    p1 = ron2.getP4();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else {
                    p1 = ron2.getP5();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                }
                break;
            case 3:
                if (aleatorio == 1) {
                    p1 = ron3.getP1();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 2) {
                    p1 = ron3.getP2();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 3) {
                    p1 = ron3.getP3();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 4) {
                    p1 = ron3.getP4();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else {
                    p1 = ron3.getP5();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                }
                break;
            case 4:
                if (aleatorio == 1) {
                    p1 = ron4.getP1();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 2) {
                    p1 = ron4.getP2();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 3) {
                    p1 = ron4.getP3();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 4) {
                    p1 = ron4.getP4();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else {
                    p1 = ron4.getP5();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                }
                break;
            case 5:
                if (aleatorio == 1) {
                    p1 = ron5.getP1();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 2) {
                    p1 = ron5.getP2();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 3) {
                    p1 = ron5.getP3();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else if (aleatorio == 4) {
                    p1 = ron5.getP4();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                } else {
                    p1 = ron5.getP5();
                    System.out.println(p1);
                    this.ObtenerRespuesta();
                }
                break;
            default:
                break;
        }
    } // Fin método de obtención de preguntas

    public void ObtenerRespuesta() throws IOException, FileNotFoundException, ClassNotFoundException { // Obtención de respuestas de todas las categorias
        switch (ronda) {
            case 1:
                System.out.print("Ingrese la respuesta: ");
                r1 = leer.nextInt();
                if (aleatorio == 1 && r1 == ron1.getR1()) {
                    System.out.println("Respuesta correcta, obtuviste +10 puntos");
                    puntos += 10;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 10);
                    ronda = 2;
                    this.ObetenerP();
                } else if (aleatorio == 2 && r1 == ron1.getR2()) {
                    System.out.println("Respuesta correcta, obtuviste +10 puntos");
                    puntos += 10;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 10);
                    ronda = 2;
                    this.ObetenerP();
                } else if (aleatorio == 3 && r1 == ron1.getR3()) {
                    System.out.println("Respuesta correcta, obtuviste +10 puntos");
                    puntos += 10;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 10);
                    ronda = 2;
                    this.ObetenerP();
                } else if (aleatorio == 4 && r1 == ron1.getR4()) {
                    System.out.println("Respuesta correcta, obtuviste +10 puntos");
                    puntos += 10;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 10);
                    ronda = 2;
                    this.ObetenerP();
                } else if (aleatorio == 5 && r1 == ron1.getR5()) {
                    System.out.println("Respuesta correcta, obtuviste +10 puntos");
                    puntos += 10;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 10);
                    ronda = 2;
                    this.ObetenerP();
                } else {
                    System.out.println("Incorrecto, obtuviste: " + puntos + " puntos en total.");
                    try {
                        System.out.println("Volviendo al menú principal...");
                        System.out.println("");
                        Thread.sleep(1 * 1000);
                        reinicio.main();
                    } catch (Exception e) {
                        System.err.println("ERROR");
                    }

                }
                break;

            case 2:
                System.out.print("Ingrese la respuesta: ");
                r2 = leer.nextInt();
                if (aleatorio == 1 && r2 == ron2.getR1()) {
                    System.out.println("Respuesta correcta, obtuviste +20 puntos");
                    puntos += 20;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 20);
                    ronda = 3;
                    this.ObetenerP();
                } else if (aleatorio == 2 && r2 == ron2.getR2()) {
                    System.out.println("Respuesta correcta, obtuviste +20 puntos");
                    puntos += 20;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 20);
                    ronda = 3;
                    this.ObetenerP();
                } else if (aleatorio == 3 && r2 == ron2.getR3()) {
                    System.out.println("Respuesta correcta, obtuviste +20 puntos");
                    puntos += 20;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 20);
                    ronda = 3;
                    this.ObetenerP();
                } else if (aleatorio == 4 && r2 == ron2.getR4()) {
                    System.out.println("Respuesta correcta, obtuviste +20 puntos");
                    puntos += 20;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 20);
                    ronda = 3;
                    this.ObetenerP();
                } else if (aleatorio == 5 && r2 == ron2.getR5()) {
                    System.out.println("Respuesta correcta, obtuviste +20 puntos");
                    puntos += 20;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 20);
                    ronda = 3;
                    this.ObetenerP();
                } else {
                    System.out.println("Incorrecto, obtuviste: " + puntos + " puntos en total.");
                    try {
                        System.out.println("Volviendo al menú principal...");
                        System.out.println("");
                        Thread.sleep(1, 5 * 1000);
                        reinicio.main();
                    } catch (Exception e) {
                        System.err.println("ERROR");
                    }
                }
                break;
            case 3:
               System.out.print("Ingrese la respuesta: ");
                r3 = leer.nextInt();
                if (aleatorio == 1 && r3 == ron3.getR1()) {
                    System.out.println("Respuesta correcta, obtuviste +60 puntos");
                    puntos += 60;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 60);
                    ronda = 4;
                    this.ObetenerP();
                } else if (aleatorio == 2 && r3 == ron3.getR2()) {
                    System.out.println("Respuesta correcta, obtuviste +60 puntos");
                    puntos += 60;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 60);
                    ronda = 4;
                    this.ObetenerP();
                } else if (aleatorio == 3 && r3 == ron3.getR3()) {
                    System.out.println("Respuesta correcta, obtuviste +60 puntos");
                    puntos += 60;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 60);
                    ronda = 4;
                    this.ObetenerP();
                } else if (aleatorio == 4 && r3 == ron3.getR4()) {
                    System.out.println("Respuesta correcta, obtuviste +60 puntos");
                    puntos += 60;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 60);
                    ronda = 4;
                    this.ObetenerP();
                } else if (aleatorio == 5 && r3 == ron3.getR5()) {
                    System.out.println("Respuesta correcta, obtuviste +60 puntos");
                    puntos += 60;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 60);
                    ronda = 4;
                    this.ObetenerP();
                } else {
                    System.out.println("Incorrecto, obtuviste: " + puntos + " puntos en total.");
                    try {
                        System.out.println("Volviendo al menú principal...");
                        System.out.println("");
                        Thread.sleep(1, 5 * 1000);
                        reinicio.main();
                    } catch (Exception e) {
                        System.err.println("ERROR");
                    }
                }
                break;
            case 4:
                System.out.print("Ingrese la respuesta: ");
                r4 = leer.nextInt();
                if (aleatorio == 1 && r4 == ron4.getR1()) {
                    System.out.println("Respuesta correcta, obtuviste +120 puntos");
                    puntos += 120;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 120);
                    ronda = 5;
                    this.ObetenerP();
                } else if (aleatorio == 2 && r4 == ron4.getR2()) {
                    System.out.println("Respuesta correcta, obtuviste +120 puntos");
                    puntos += 120;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 120);
                    ronda = 5;
                    this.ObetenerP();
                } else if (aleatorio == 3 && r4 == ron4.getR3()) {
                    System.out.println("Respuesta correcta, obtuviste +120 puntos");
                    puntos += 120;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 120);
                    ronda = 5;
                    this.ObetenerP();
                } else if (aleatorio == 4 && r4 == ron4.getR4()) {
                    System.out.println("Respuesta correcta, obtuviste +120 puntos");
                    puntos += 120;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 120);
                    ronda = 5;
                    this.ObetenerP();
                } else if (aleatorio == 5 && r4 == ron4.getR5()) {
                    System.out.println("Respuesta correcta, obtuviste +120 puntos");
                    puntos += 120;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 120);
                    ronda = 5;
                    this.ObetenerP();
                } else {
                    System.out.println("Incorrecto, obtuviste: " + puntos + " puntos en total.");
                    try {
                        System.out.println("Volviendo al menú principal...");
                        System.out.println("");
                        Thread.sleep(1, 5 * 1000);
                        reinicio.main();
                    } catch (Exception e) {
                        System.err.println("ERROR");
                    }
                }
            case 5:
               System.out.print("Ingrese la respuesta: ");
                r5 = leer.nextInt();
                if (aleatorio == 1 && r5 == ron5.getR1()) {
                    System.out.println("Respuesta correcta, obtuviste +240 puntos");
                    puntos += 240;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 240);
                    ronda = 6;
                    System.out.println("Tu puntuación final es: " + puntos + " puntos."
                            + "\n¡Has conseguido la máxima puntuación, verdaderamente sabes mucho de Colombia, felicitaciones!");
                    reinicio.main();
                } else if (aleatorio == 2 && r5 == ron5.getR2()) {
                    System.out.println("Respuesta correcta, obtuviste +240 puntos");
                    puntos += 240;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 240);
                    ronda = 6;
                    System.out.println("Tu puntuación final es: " + puntos + " puntos."
                            + "\n¡Has conseguido la máxima puntuación, verdaderamente sabes mucho de Colombia, felicitaciones!");
                    reinicio.main();
                } else if (aleatorio == 3 && r5 == ron5.getR3()) {
                    System.out.println("Respuesta correcta, obtuviste +240 puntos");
                    puntos += 240;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 240);
                    ronda = 6;
                    System.out.println("Tu puntuación final es: " + puntos + " puntos."
                            + "\n¡Has conseguido la máxima puntuación, verdaderamente sabes mucho de Colombia, felicitaciones!");
                    reinicio.main();
                } else if (aleatorio == 4 && r5 == ron5.getR4()) {
                    System.out.println("Respuesta correcta, obtuviste +240 puntos");
                    puntos += 240;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 240);
                    ronda = 6;
                    System.out.println("Tu puntuación final es: " + puntos + " puntos."
                            + "\n¡Has conseguido la máxima puntuación, verdaderamente sabes mucho de Colombia, felicitaciones!");
                    reinicio.main();
                } else if (aleatorio == 5 && r5 == ron5.getR5()) {
                    System.out.println("Respuesta correcta, obtuviste +240 puntos");
                    puntos += 240;
                    puntosT.setPuntosTotales(puntosT.getPuntosTotales() + 240);
                    ronda = 6;
                    System.out.println("Tu puntuación final es: " + puntos + " puntos."
                            + "\n¡Has conseguido la máxima puntuación, verdaderamente sabes mucho de Colombia, felicitaciones!");
                    reinicio.main();
                } else {
                    System.out.println("Incorrecto, obtuviste: " + puntos + " puntos en total.");
                    try {
                        System.out.println("Volviendo al menú principal...");
                        System.out.println("");
                        Thread.sleep(1, 5 * 1000);
                        reinicio.main();
                    } catch (Exception e) {
                        System.err.println("ERROR");
                    }
                }
                break;
                
            default:
                
                System.err.println("ERROR");
                
                break;
        }
    } // Fin de obtención de respuestas
}
