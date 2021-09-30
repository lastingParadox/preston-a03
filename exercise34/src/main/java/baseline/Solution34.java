package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {

    Scanner input = new Scanner(System.in);

    public String takeCapitalizedInput(String response) {
        //Takes the user's input and capitalizes it.
        //Appends characters to a StringBuilder and adds a capital letter for every space.
        StringBuilder capitalized = new StringBuilder();
        capitalized.append(Character.toUpperCase(response.charAt(0)));

        for(int i = 1; i < response.length();) {
            char ch = response.charAt(i);

            if(ch == ' ') {
                capitalized.append(' ');
                capitalized.append(Character.toUpperCase(response.charAt(i+1)));
                i += 2;
            }
            else {
                capitalized.append(ch);
                i++;
            }
        }
        return String.valueOf(capitalized);
    }

    public List createList() {
        //Creates the list of employees.
        List<String> employees = new ArrayList<>();

        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        return employees;

    }

    private void printList(List employees) {
        //Prints the list of employees, along with the number.
        System.out.printf("There are %d employees:%n", employees.size());

        for (Object employee : employees) System.out.println(employee);

        System.out.println();
    }

    public List deleteEmployee(String response, List employees) {
        //Deletes the employee based on the user's capitalized response.
        boolean deleted = false;
        for (int i = 0; i < employees.size(); i++) {
            if (response.equals(employees.get(i))) {
                employees.remove(employees.get(i));
                deleted = true;
            }
        }
        //If response isn't an employee name, throws an error message.
        if (!deleted)
            throw new IllegalArgumentException("Invalid name.");
        return employees;
    }

    public static void main(String[] arg) {
        //Create new instance Solution34 "lister"

        //List employees is equal to the employee list.
        //Print employees

        //Print "Enter an employee name to remove: "
        //String response takes in the input
        //Response is capitalized.

        //The employee is deleted if the name was typed correctly. (employees = deleteEmployee(response, employees))

        //Print a new line and the new list of employees.
    }
}
