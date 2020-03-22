package ar.edu.uader.fcyt.ingsoft2.universidad;

/**
 * Clase Alumno que extiende de la Clase persona
 */
public class Alumno extends Persona {

    /**
     * Atributos de instancia
     */

    private int anioIngreso;

    private int cantidadMateriasAprobadas;

    private int nroLegajo;

    /**
     * Constructores
     */

    /**
     * Constructor que sólo inicializa los atributos de la clase
     */
    public Alumno(int anioIngreso, int cantidadMateriasAprobadas, int nroLegajo) {
        this.anioIngreso = anioIngreso;
        this.cantidadMateriasAprobadas = cantidadMateriasAprobadas;
        this.nroLegajo = nroLegajo;
    }

    /**
     *
     * Constructor que inicializa todos los atributos de la clase
     * Invoca al constructor de su clase padre
     */

    public Alumno(String nombre, String apellido, int edad, int anioIngreso, int cantidadMateriasAprobadas, int nroLegajo) {
        super(nombre, apellido, edad);
        this.anioIngreso = anioIngreso;
        this.cantidadMateriasAprobadas = cantidadMateriasAprobadas;
        this.nroLegajo = nroLegajo;
    }


    /**
     * Métodos sobreescritos de su clase Padre
     */

    @Override
    public void registrar() {
        System.out.println("Registrando un alumno");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(String.format("Año de Ingreso: %s", anioIngreso));
        System.out.println(String.format("Materias Aprobadas: %s", cantidadMateriasAprobadas));
        System.out.println(String.format("Número de Legajo: %s", nroLegajo));

    }

    /**
     * Metodos get y set
     */

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getCantidadMateriasAprobadas() {
        return cantidadMateriasAprobadas;
    }

    public void setCantidadMateriasAprobadas(int cantidadMateriasAprobadas) {
        this.cantidadMateriasAprobadas = cantidadMateriasAprobadas;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
}
