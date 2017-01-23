package project;


import java.util.Calendar;


public class Document {

    private String documentHolderID;
    private String documentKind;
    private String documentSeries;
    private String documentNumber;
    private Calendar documentDateOfIssue;
    private String documentIssuingAuthority;

    public Document() {
        this.documentHolderID = null;
        this.documentKind = null;
        this.documentSeries = null;
        this.documentNumber = null;
        this.documentDateOfIssue = null;
        this.documentIssuingAuthority = null;
    }

    public Document(String documentHolderID, String documentKind, String documentSeries,
                    String documentNumber, Calendar documentDateOfIssue, String documentIssuingAuthority) {
        this.documentHolderID = documentHolderID;
        this.documentKind = documentKind;
        this.documentSeries = documentSeries;
        this.documentNumber = documentNumber;
        this.documentDateOfIssue = documentDateOfIssue;
        this.documentIssuingAuthority = documentIssuingAuthority;
    }

    public String getDocumentHolderID() {
        return documentHolderID;
    }

    public void setDocumentHolderID(String documentHolderID) {
        this.documentHolderID = documentHolderID;
    }

    public String getDocumentKind() {
        return documentKind;
    }

    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }

    public String getDocumentSeries() {
        return documentSeries;
    }

    public void setDocumentSeries(String documentSeries) {
        this.documentSeries = documentSeries;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Calendar getDocumentDateOfIssue() {
        return documentDateOfIssue;
    }

    public void setDocumentDateOfIssue(Calendar documentDateOfIssue) {
        this.documentDateOfIssue = documentDateOfIssue;
    }

    public String getDocumentIssuingAuthority() {
        return documentIssuingAuthority;
    }

    public void setDocumentIssuingAuthority(String documentIssuingAuthority) {
        this.documentIssuingAuthority = documentIssuingAuthority;
    }

    @Override
    public String toString() {

        return documentHolderID + ":" + documentKind + ":" + documentSeries + ":" + documentNumber + ":"
                + documentDateOfIssue.get(Calendar.DAY_OF_MONTH) + "." + documentDateOfIssue.get(Calendar.MONTH)+ "."
                + documentDateOfIssue.get(Calendar.YEAR) + ":" + documentIssuingAuthority;

    }
}

