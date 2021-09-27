/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class EmployeeField {

    private final String firstName;
    private final String lastName;
    private final String zipcode;
    private final String id;

    EmployeeField(String firstName, String lastName, String zipcode, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.id = id;
    }

    public String validateFirst() {
        //Create a new StringBuilder named "temp"
        //If the first name entered is less than two characters:
            //Append "The first name must be at least 2 characters long.\n" to temp.
        //Else
            //Append "" to temp.
        //If the last name entered is blank:
            //Append "The first name must be filled in.\n" to temp.
        //Return temp
        return "";
    }

    public String validateLast() {
        //Create a new StringBuilder named "temp"
        //If the last name entered is less than two characters:
            //Append "The last name must be at least 2 characters long.\n" to temp.
        //Else
            //Append "" to temp.
        //If the last name entered is blank:
            //Append "The last name must be filled in.\n" to temp.
        //Return temp
        return "";
    }

    public String validateZip() {
        //Create a new StringBuilder named "temp"
        //If the zip code entered is blank:
            //Append "The zipcode must be filled in.\n" to temp.
        //If the zip code entered is less than five characters or is not numerical:
            //Append "The zipcode must be a 5 digit number.\n"
        //Else
            //Append "" to temp.
        //Return temp
        return "";
    }

    public String validateID() {
        //Create a new StringBuilder named "temp"
        //If the id entered does not match the format AA-1234:
            //Append "The employee ID must be in the format of AA-1234\n" to temp.
        //Else
            //Append "" to temp.
        //Return temp
        return "";
    }

    public String validateInput() {
        //Create a new StringBuilder named "temp"
        //Append validateFirst() to temp
        //Append validateLast() to temp
        //Append validateZip() to temp
        //Append validateID() to temp

        //Return temp
        return "";
    }
}
