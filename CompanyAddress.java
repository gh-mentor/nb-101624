/*
    Create a class called 'CompanyAddress'.
    private fields:
    - address: a string that stores the company's address
    - city: a string that stores the company's city
    - state: a string that stores the company's state
    - zip: a string that stores the company's zip code
    public methods:
    - A constructor that initializes the address, city, state, and zip fields
    - 'GetFullAddress' returns the full address as a string
*/
public class CompanyAddress {
    private String address;
    private String city;
    private String state;
    private String zip;

    public CompanyAddress(String address, String city, String state, String zip) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFullAddress() {
        return address + ", " + city + ", " + state + " " + zip;
    }
}


