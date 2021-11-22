package addressbook;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class RunAddressBook {
    static HashMap<String, AddressBook> addressBooks = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    /**
     * searchPerson method is used to search person across multiple addressBook
     *
     * @param first_Name is used to search across addressBook
     */
    private static void searchPerson(String first_Name) {
        for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
            System.out.println(entry.getKey());
            Stream<Contacts> search = entry.getValue().contact_Details.stream().filter(i -> i.getFirstName().equals(first_Name));
            search.forEach(str -> System.out.println(str.toString()));
        }
    }

    /*
     * used to search by city or state
     * */
    private static void searchByCityOrState() {
        System.out.println("Enter 1 for searching by city \nEnter 2 for searching by state");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("Enter city name to search contacts");
            String city = sc.next();
            for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
                System.out.println(entry.getKey());
                Stream<Contacts> search = entry.getValue().contact_Details.stream().filter(i -> i.getCity().equals(city));
                search.forEach(str -> System.out.println(str.toString()));
            }
        } else if (input == 2) {
            System.out.println("Enter state name to search contacts");
            String state = sc.next();
            for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
                System.out.println(entry.getKey());
                Stream<Contacts> search = entry.getValue().contact_Details.stream().filter(i -> i.getState().equals(state));
                search.forEach(str -> System.out.println(str.toString()));
            }
        } else System.out.println("Enter 1 or 2 ");
    }
    /*
     * to search number of contacts
     * */

    private static void searchNumberOfPerson() {
        System.out.println("Enter 1 for searching by city \nEnter 2 for searching by state");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("Enter city name to search number of  contacts");
            String city = sc.next();
            for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
                System.out.println(entry.getKey());
                Stream<Contacts> search = entry.getValue().contact_Details.stream().filter(i -> i.getCity().equals(city));
                System.out.println("Number of contacts in " + city + " are : " + search.count());
                System.out.println("===========================================");
            }
        } else if (input == 2) {
            System.out.println("Enter state name to search number of  contacts");
            String state = sc.next();
            for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
                System.out.println(entry.getKey());
                Stream<Contacts> search = entry.getValue().contact_Details.stream().filter(i -> i.getState().equals(state));
                System.out.println("Number of contacts in " + state + " are : " + search.count());
                System.out.println("===========================================");
            }
        } else System.out.println("Enter 1 or 2 ");
    }

    public static void main(String[] args) throws IOException, ParseException {

        AddressBook book1 = new AddressBook();
        AddressBook book2 = new AddressBook();
        AddressBook book3 = new AddressBook();
        addressBooks.put("AddressBook1", book1);
        addressBooks.put("AddressBook2", book2);
        addressBooks.put("AddressBook3", book3);

        System.out.println("================================");
        System.out.println("Welcome to Address Book");
        System.out.println("================================");
        int i = 1;
        while (i != 0) {
            System.out.println("Enter 1 to for AddressBook1 2 for AddressBook2 and 3 for AddressBook3");
            int choose_AddressBook = sc.nextInt();
            System.out.println("Enter 1 to add contact \nEnter 2 to edit details of contacts \nEnter 3 for deleting contact \nEnter 4 for showing details of contacts" +
                    "\nEnter 5 to search person across multiple addressBook \nEnter 6 to search by city or state\nEnter 7 to search number of contacts\nEnter 8 to write to json file" +
                    "\nEnter 9 for writing to csv file");
            System.out.println(".......................................");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    if (choose_AddressBook == 1) book1.addContacts();
                    else if (choose_AddressBook == 2) book2.addContacts();
                    else if (choose_AddressBook == 3) book3.addContacts();
                    else System.out.println("Option not found");
                    break;
                case 2:
                    if (choose_AddressBook == 1) {
                        System.out.println("Enter the first name by which u want to edit contact");
                        String name = sc.next();
                        book1.editContacts(name);
                        break;
                    } else if (choose_AddressBook == 2) {
                        System.out.println("Enter the first name by which u want to edit contact");
                        String name = sc.next();
                        book2.editContacts(name);
                        break;
                    } else if (choose_AddressBook == 3) {
                        System.out.println("Enter the first name by which u want to edit contact");
                        String name = sc.next();
                        book3.editContacts(name);
                        break;
                    }

                case 3:
                    if (choose_AddressBook == 1) {
                        System.out.println("Enter the first name by which u want to edit contact");
                        String search_Name = sc.next();
                        book1.deleteContact(search_Name);
                        break;
                    } else if (choose_AddressBook == 2) {
                        System.out.println("Enter the first name by which u want to edit contact");
                        String search_Name = sc.next();
                        book2.deleteContact(search_Name);
                        break;
                    }
                    if (choose_AddressBook == 3) {
                        System.out.println("Enter the first name by which u want to edit contact");
                        String search_Name = sc.next();
                        book3.deleteContact(search_Name);
                        break;
                    }
                case 4:
                    if (choose_AddressBook == 1) {
                        book1.sortByFirstName();
                        book1.showContacts();
                        break;
                    } else if (choose_AddressBook == 2) {
                        book2.sortByFirstName();
                        book2.showContacts();
                        break;
                    } else if (choose_AddressBook == 3) {
                        book3.sortByFirstName();
                        book3.showContacts();
                        break;
                    }
                case 5:
                    System.out.println("Enter the first name to search");
                    searchPerson(sc.next());
                    break;
                case 6:
                    searchByCityOrState();
                    break;
                case 7:
                    searchNumberOfPerson();
                    break;
                case 8:
                    if (choose_AddressBook == 1)
                        book1.writeFile("E:\\Day24AddressBook\\src\\main\\resources\\AddressBook1.json");
                    else if (choose_AddressBook == 2)
                        book2.writeFile("E:\\Day24AddressBook\\src\\main\\resources\\AddressBook2.json");
                    else if (choose_AddressBook == 3)
                        book3.writeFile("E:\\Day24AddressBook\\src\\main\\resources\\AddressBook3.json");
                    else System.out.println("Option not found");
                    break;
                case 9:
                    if (choose_AddressBook == 1) {
                        book1.writeCSVFile("E:\\Day24AddressBook\\src\\main\\resources\\AddressBook1.csv");
                    } else if (choose_AddressBook == 2)
                        book2.writeCSVFile("E:\\Day24AddressBook\\src\\main\\resources\\AddressBook2.csv");
                    else if (choose_AddressBook == 3)
                        book3.writeCSVFile("E:\\Day24AddressBook\\src\\main\\resources\\AddressBook3.csv");
                    else System.out.println("Option not found");

                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

