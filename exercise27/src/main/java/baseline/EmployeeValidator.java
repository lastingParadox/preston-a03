/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class EmployeeValidator {

    private final String firstName;
    private final String lastName;
    private final String zipcode;
    private final String id;

    EmployeeValidator(String firstName, String lastName, String zipcode, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.id = id;
    }

    public String validateFirst() {
        StringBuilder temp = new StringBuilder();

        if (firstName.length() < 2)
            temp.append("The first name must be at least 2 characters long.\n");
        if (firstName.equals(""))
            temp.append("The first name must be filled in.\n");

        return String.valueOf(temp);
    }

    public String validateLast() {
        StringBuilder temp = new StringBuilder();

        if (lastName.length() < 2)
            temp.append("The last name must be at least 2 characters long.\n");
        if (lastName.equals(""))
            temp.append("The last name must be filled in.\n");

        return String.valueOf(temp);
    }

    public String validateZip() {
        StringBuilder temp = new StringBuilder();

        if (!zipcode.matches("\\d{5}"))
            temp.append("The zipcode must be a 5 digit number.\n");
        if (zipcode.equals(""))
            temp.append("The zipcode must be filled in.\n");

        return String.valueOf(temp);
    }

    public String validateID() {
        StringBuilder temp = new StringBuilder();

        if (!id.matches("[a-zA-Z]{2}-[0-9]{4}"))
            temp.append("The employee ID must be in the format of AA-1234.\n");
        if (id.equals(""))
            temp.append("The employee ID must be filled in.\n");

        return String.valueOf(temp);
    }

    public String validateInput() {
        return validateFirst() + validateLast() + validateZip() + validateID();
    }
}
