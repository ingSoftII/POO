package ar.edu.uader.fcyt.ingsoft2.documentos;

/**
 * Interface Imprimible, la cual deberá implementar cualquier documento en la aplicacion
 */
public interface Imprimible {

    //Metodo que define como se imprime el documento
    void imprimir();

    //Cantidad maxima de hojas que puede tener un documento imprimible
    int CANTIDAD_MAXIMA_HOJAS = 10;
}

