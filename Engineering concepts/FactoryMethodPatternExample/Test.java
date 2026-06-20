class Test{
    public static void main(String args[]){
        DocumentFactory word = new WordDocumentFactory();
        DocumentFactory pdf = new PdfDocumentFactory();
        DocumentFactory excel = new ExcelDocumentFactory();
        word.openDocument();
        pdf.openDocument();
        excel.openDocument();
    }
}