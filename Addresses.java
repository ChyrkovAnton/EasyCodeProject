package project;


public enum Addresses {

    REGISTRATION_ADDRESS(1, "Registration address"),
    RESIDENCE_ADDRESS(2, "Residence address");

    private int addressCode;
    private String addressName;

    Addresses(int addressCode, String addressName) {
        this.addressCode = addressCode;
        this.addressName = addressName;
    }

    public int getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(int addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public static String toStringStatic(){

        StringBuilder toString = new StringBuilder();

        for (Addresses ad: Addresses.values()){
            toString.append(ad + " address code - " + ad.getAddressCode() + ": ");
        }

        return toString.toString();
    }
}
