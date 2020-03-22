package ar.edu.uader.fcyt.ingsoft2.documentos;

/**
 * Clase responsable de imprimir documentos en la apicacion
 */
public class Impresora {

    //Metodo de clase para imprimir documentos
    public static void imprimir(Imprimible imprimible) {
        imprimible.imprimir();
    }
}
