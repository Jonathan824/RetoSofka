package funcionamiento;

import java.io.Serializable;

public class Usuarios implements Serializable {

    String nombre;
    static int PuntosTotales;

    public Usuarios(String n, int p) {

        nombre = n;
        PuntosTotales = p;

    } // fin constructor

    public String getNombre() {
        return nombre;
    }

    public int getPuntosTotales() {
        return PuntosTotales;
    }

    public static void setPuntosTotales(int PuntosTotales) {
        Usuarios.PuntosTotales = PuntosTotales;
    }

} // fin clase
