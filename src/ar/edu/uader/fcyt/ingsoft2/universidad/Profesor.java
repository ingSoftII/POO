package ar.edu.uader.fcyt.ingsoft2.universidad;

/**
 * Clase Profesor que extiende de la Clase persona
 */
public class Profesor extends Persona {

    /**
     * Atributos de instancia
     */

    private String materia;

    private int cantidadAlumnos;

    /**
     * Constructores
     */

    public Profesor(String materia, int cantidadAlumnos) {
        this.materia = materia;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Profesor(String nombre, String apellido, int edad, String materia, int cantidadAlumnos) {
        super(nombre, apellido, edad);
        this.materia = materia;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    /**
     * Métodos sobreescritos de su clase Padre
     */


    @Override
    public void registrar() {
        System.out.println("Registrando un profesor");

    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(String.format("Materia: %s", materia));
        System.out.println(String.format("Cantidad de Alumnos a Cargo: %s", cantidadAlumnos));

    }
}
