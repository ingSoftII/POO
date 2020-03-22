package ar.edu.uader.fcyt.ingsoft2.universidad;

/**
 * Clase aplicacion, punto de entrada
 */

public class Aplicacion {

    public static void main(String[] args) {

        //Creamos dos alumnos y un docente

        Alumno alumno1 = new Alumno("Carla", "Ramirez", 24, 2014, 12, 4829);

        Alumno alumno2 = new Alumno("Jorge", "Lopez", 31, 2010, 15, 4820);

        Profesor profesor = new Profesor("Nestor", "Flores", 37, "Ingenieria del Software II", 2 );

        //Añadimos a la universidad a los objetos creados anteriormente

        Universidad.registrar(alumno1);
        Universidad.registrar(alumno2);
        Universidad.registrar(profesor);


        //Finalmente mostramos la cantidad de integrantes de la universidad

        Universidad.mostrarInformaction();

    }
}
