package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> contact_Details = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    /**
     * used to add new contact
     */
    public void addContacts() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of contacts you want to save");
            int numberOfContacts = sc.nextInt();
            for (int i = 0; i < numberOfContacts; i++) {
                System.out.println("Enter the details of contact number " + (i + 1));
                System.out.println("Enter first name");
                String firstName = sc.next();
                System.out.println("Last name");
                String lastName = sc.next();
                System.out.println("Enter address");
                String address = sc.next();
                System.out.println("Enter city ");
                String city = sc.next();
                System.out.println("Enter state ");
                String state = sc.next();
                System.out.println("Enter EmailId ");
                String emailId = sc.next();
                System.out.println("Enter zip ");
                int zipCode = sc.nextInt();
                System.out.println("Enter phone number ");
                long phoneNumber = sc.nextInt();
                System.out.println("Contact number " + (i + 1) + " saved");
                System.out.println("==================================");
                Contacts details = new Contacts(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber);
                contact_Details.add(details);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * used to editContacts
     *
     * @param name is used to edit contacts using name
     */

    public void editContacts(String name) {

        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts");
                System.out.println("Enter the updated first name");
                String firstName = sc.next();
                contact.setFirstName(firstName);
                System.out.println("Enter the updated last name");
                String lastName = sc.next();
                contact.setLastName(lastName);
                System.out.println("Enter the updated address");
                String address = sc.next();
                contact.setAddress(address);
                System.out.println("Enter the updated city");
                String city = sc.next();
                contact.setCity(city);
                System.out.println("Enter the updated state");
                String state = sc.next();
                contact.setState(state);
                System.out.println("Enter the updated emailID");
                String emailId = sc.next();
                contact.setEmailId(emailId);
                System.out.println("Enter the updated zipcode");
                int zipcode = sc.nextInt();
                contact.setZipCode(zipcode);
                System.out.println("Enter the updated phoneNumber");
                long phoneNumber = sc.nextInt();
                contact.setPhoneNumber(phoneNumber);
            } else
                System.out.println("Entered name not  found in the AddressBook");
        }
    }

    /**
     * deleteContact is used to delete
     *
     * @param name is used to delete the contact based upon names
     */
    public void deleteContact(String name) {
        for (Contacts contact : contact_Details) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Entered Name found in the contacts, deleting contact");
                contact_Details.remove(contact);
            } else
                System.out.println("Entered name not found in the AddressBook");
        }
    }

    /**
     * showContacts is used to display contacts
     */
    public void showContacts() {
        int i = 1;
        for (Contacts contact : contact_Details) {
            System.out.println("Details  of contact number " + i + " is");
            System.out.println(contact.toString());
            i++;
        }
    }

}