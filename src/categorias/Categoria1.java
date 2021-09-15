/*
 Esta clase es para almacenar principalmente las preguntas y respuestas de 
 cada categoría
 */
package categorias;

/*
 * @author Jonathan Murillo Jaramillo
 */
public class Categoria1 {

    String p1 = "¿Cuál es la moneda principal de Colombia?"
            + "\n 1. Peso"
            + "\n 2. Libra"
            + "\n 3. Dolar"
            + "\n 4. Euro";
    int r1 = 1;

    String p2 = "¿Cuál es la lengua oficial de Colombia?"
            + "\n 1. Alemán"
            + "\n 2. Español"
            + "\n 3. Inglés"
            + "\n 4. Frances";
    int r2 = 2;

    String p3 = "¿Qué cordillera atravieza el terrirtorio Colombiano??"
            + "\n 1. Cordillera Cantábrica"
            + "\n 2. Cordillera Cárpatos"
            + "\n 3. Cordillera de los Andes"
            + "\n 4. Cordillera Pirineos";
    int r3 = 3;

    String p4 = "¿Cuál es el nombre del aeropuerto de Bogotá?"
            + "\n 1. Aeropuerto Internacional Alfonso Bonilla Aragón"
            + "\n 2. Aeropuerto Internacional José María Córdova"
            + "\n 3. Aeropuerto Olaya Herrera"
            + "\n 4. Aeropuerto Internacional El Dorado";
    int r4 = 4;

    String p5 = "¿Cuál es la capital de Colombia?"
            + "\n 1. Medellín"
            + "\n 2. Barrancabermeja"
            + "\n 3. Bogotá"
            + "\n 4. Cali";
    int r5 = 3;

    public int getR1() {
        return r1;
    }

    public int getR2() {
        return r2;
    }

    public int getR3() {
        return r3;
    }

    public int getR4() {
        return r4;
    }

    public int getR5() {
        return r5;
    }

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public String getP3() {
        return p3;
    }

    public String getP4() {
        return p4;
    }

    public String getP5() {
        return p5;
    }
}
