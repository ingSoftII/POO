package ar.edu.uader.fcyt.ingsoft2.universidad;

/**
 * Clase universidad que gestiona a almunos y profesores
 */
public class Universidad {

    /**
     * Atributos de clase
     */

    private static int cantidadAlumnos;

    private static int cantidadProfesores;

    /**
     * Metodos de clase
     */

    /**
     * Metodo poliformico que añade una persona a la universidad, segun sea alumno o profesor
     */
    public static void registrar(Persona persona) {

        //Contamos si es alumno o profesor en base a su tipo
        if(persona instanceof Alumno) {
            cantidadAlumnos++;
        }

        if(persona instanceof Profesor) {
            cantidadProfesores++;
        }

        //Llamamos al metodo mostrar informacion de la clase correspondiente
        persona.mostrarInformacion();

    }



    /**
     * Metodo que muestra cantidad de alumnos y docentes de la Universidad
     */

    public static void mostrarInformaction() {
        System.out.println(String.format("Cantidad de Alumnos: %s", cantidadAlumnos));
        System.out.println(String.format("Cantidad de Profesores: %s", cantidadProfesores));
    }
}
