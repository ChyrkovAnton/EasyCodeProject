package project;

public class Address {

    private Addresses addressKind;
    private String country;
    private String region;
    private String city;
    private String street;
    private String buildingNumber;
    private String appartment;

    public Address (){

    }

    public Address(Addresses addressKind, String country, String region, String city, String street,
                   String buildingNumber, String appartment) {
        this.addressKind = addressKind;
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.appartment = appartment;
    }

    public Addresses getAddressKind() {
        return addressKind;
    }

    public void setAddressKind(Addresses addressKind) {
        this.addressKind = addressKind;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (getAddressKind() != address.getAddressKind()) return false;
        if (getCountry() != null ? !getCountry().equals(address.getCountry()) : address.getCountry() != null)
            return false;
        if (getRegion() != null ? !getRegion().equals(address.getRegion()) : address.getRegion() != null) return false;
        if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
        if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
        if (getBuildingNumber() != null ? !getBuildingNumber().equals(address.getBuildingNumber()) : address.getBuildingNumber() != null)
            return false;
        return getAppartment() != null ? getAppartment().equals(address.getAppartment()) : address.getAppartment() == null;
    }

    @Override
    public int hashCode() {
        int result = getAddressKind() != null ? getAddressKind().hashCode() : 0;
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        result = 31 * result + (getRegion() != null ? getRegion().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
        result = 31 * result + (getBuildingNumber() != null ? getBuildingNumber().hashCode() : 0);
        result = 31 * result + (getAppartment() != null ? getAppartment().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressKind=" + addressKind +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", appartment='" + appartment + '\'' +
                '}';
    }
}
