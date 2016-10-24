
package Model;

public class Adress {
   
    
    private long id;
    private String street;
    private String buildingNumber;
    private String flatNumber;
    private String postalCode;
    private String City;
    private String Country;

    public Adress(long id, String street, String buildingNumber, String flatNumber, String postalCode, String City, String Country) {
        this.id = id;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.City = City;
        this.Country = Country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    
    
    
}
