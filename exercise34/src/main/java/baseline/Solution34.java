package baseline;

import java.util.List;

public class Solution34 {

    //Create new instance Scanner "input"

    public String takeCapitalizedInput() {
        //String "response" Takes in the user's input in lowercase.
        //Create a String "responseCapitalized"
        //Add the capitalized first letter of "response" to "responseCapitalized"
        //Loop for every character in "response"
            //If the character is whitespace:
                //Add the whitespace + the capitalized character afterwards to responseCapitalized
                //Increase the loop by two
            //Else:
                //Add the current character to responseCapitalized
                //Increase the loop
        return "";
    }

    public List createList() {
        //Create new string list "employees"
        //Add to employees:
            //John Smith
            //Jackie Jackson
            //Chris Jones
            //Amanda Cullen
            //Jeremy Goodwin
        //return employees
        return null;
    }

    private void printList(List employees) {
        //Print "There are 'employees.size()' employees:"
        //Loop for the number of employees (i)
            //Print the employee's name on a new line
                //i.e., println(employees.get(i))
        //Print a new line
    }

    public List deleteEmployee(String response, List employees) {
        //Create boolean deleted = false
        //Loop for all of the employees
            //If response is equal to employees.get(i):
                //Remove the employee from the list
                //deleted = true
        //If deleted is false:
            //Throw an IllegalArgumentException
                //"Invalid name"
        //return employees
        return null;
    }

    public static void main(String[] arg) {
        //Create new instance Solution34 "lister"

        //List employees is equal to the employee list.
        //Print employees

        //Print "Enter an employee name to remove: "
        //String response takes in the input, capitalized.

        //The employee is deleted if the name was typed correctly. (employees = deleteEmployee(response, employees))

        //Print a new line and the new list of employees.
    }
}
