package project;

public enum DocumentTypes {
    PASSPORT(1),
    INN(2),
    DRIVING_LICENCE(3);

    private int documentCode;

    DocumentTypes(int documentCode) {
        this.documentCode = documentCode;
    }

    public int getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(int documentCode) {
        this.documentCode = documentCode;
    }

    public static String toStringStatic() {

        String toString = "";

        for (DocumentTypes doc: DocumentTypes.values()){
            toString += doc + " code - " + doc.getDocumentCode() + ": ";
        }

        return toString;
    }
}
