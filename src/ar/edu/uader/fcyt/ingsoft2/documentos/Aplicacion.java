package ar.edu.uader.fcyt.ingsoft2.documentos;

/**
 * Punto de entrada de la aplicacion para imprimir
 */
public class Aplicacion {

    public static void main(String[] args) {

        //Creamos dos documentos
        DocumentoTexto documentoTexto = new DocumentoTexto("documento.txt", "25");

        DocumentoPDF documentoPDF = new DocumentoPDF("archivo2.pdf", "20");

        //Los imprimimos con la impresora
        Impresora.imprimir(documentoPDF);
        Impresora.imprimir(documentoTexto);
    }
}
