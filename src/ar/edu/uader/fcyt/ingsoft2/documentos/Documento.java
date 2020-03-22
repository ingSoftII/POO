package ar.edu.uader.fcyt.ingsoft2.documentos;

/**
 * Clase abstracta documento, de la cual deberan extender los documentos a Imprimir
 * Esta clase implementa la interface Imprimible, pero no el metodo imprimir, con lo cual deberan hacerlo sus subclases
 */
public abstract class Documento implements Imprimible {

    /**
     * Metodos de instancia
     */
    private String nombre;

    private String cantidadHojas;

    /**
     * Constructor de la clase
     */

    public Documento(String nombre, String cantidadHojas) {
        this.nombre = nombre;
        this.cantidadHojas = cantidadHojas;
    }

    /**
     * Metodos get y set
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(String cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
}
