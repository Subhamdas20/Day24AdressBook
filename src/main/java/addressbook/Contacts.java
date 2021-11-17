package addressbook;

public class Contacts {

    private String firstName, lastName, address, city, state, emailId;
    private int zipCode;
    private long phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Contacts(String firstName, String lastName, String address, String city, String state, String emailId, int zipCode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
    public String toString () {
        return
                "----------------------------------\n" +
                        "FirstName  =  " + firstName +
                        "\nLastName   =  " + lastName +
                        "\nAddress    =  " + address +
                        "\nCity       =  " + city +
                        "\nState      =  " + state +
                        "\nZipCode    =  " + zipCode +
                        "\nNumber     =  " + phoneNumber +
                        "\nEmail      =  " + emailId +
                        "\n-----------------------------------\n";

    }
}