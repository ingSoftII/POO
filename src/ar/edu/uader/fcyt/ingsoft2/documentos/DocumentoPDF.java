package ar.edu.uader.fcyt.ingsoft2.documentos;

public class DocumentoPDF extends Documento {
    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param cantidadHojas
     */
    public DocumentoPDF(String nombre, String cantidadHojas) {
        super(nombre, cantidadHojas);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo un documento PDF");
    }
}
