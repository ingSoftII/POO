package ar.edu.uader.fcyt.ingsoft2.universidad;

/**
 * Clase abstracta persona, para ser utilizada por el modelo
 */
public abstract class Persona {

    /**
     * Atributos de instancia
     */

    private String nombre;

    private String apellido;

    private int edad;

    /**
     * Constructores de la clase
     */

    public Persona() {
        this.edad = 18;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * Metodo abstracto a ser sobreescrito por sus subclases
     */

    public abstract void registrar();

    /**
     * Metodo que será sobreescrito en sus subclases para mostrar
     * informacion de cada persona
     */

    public void mostrarInformacion() {
        System.out.println(String.format("Nombre: %s", nombre));
        System.out.println(String.format("Apellido: %s", apellido));
        System.out.println(String.format("Edad: %s", edad));
    }

    /**
     * Métodos get y set
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
