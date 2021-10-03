/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution40 {

    //Added final static variables for each map key
    private static final String FIRST = "first_name";
    private static final String LAST = "last_name";
    private static final String POSITION = "position";
    private static final String SEPARATION = "sd";

    private static final Scanner input = new Scanner(System.in);

    private String takeInput() {
        //Returns the user's input in lowercase
        return input.nextLine().toLowerCase();
    }

    public Map<String, String> createMap(String first, String last, String position, String separation) {
        //Reduces the clutter of creating and adding values to a map
        Map<String, String> map = new HashMap<>();

        map.put(FIRST, first);
        map.put(LAST, last);
        map.put(POSITION, position);
        map.put(SEPARATION, separation);

        return map;
    }

    public void sortList(List<Map<String, String>> employees) {
        //Uses List.sort to sort the maps one by one in the List.
        //Uses a lambda expression as a callback for comparing each map's last_name key.
        employees.sort(Comparator.comparing(map -> map.get(LAST)));
    }

    public void printTable(List<Map<String, String>> employees, String response) {
        //Prints the table based on the user's response
        StringBuilder output = new StringBuilder();

        //Prints the header
        output.append(String.format("Results:%n%n"));
        output.append(String.format("Name%17s Position%11s SeparationDate%n", "|", "|"));
        output.append(String.format("--------------------|-------------------|----------------%n"));

        //Prints an employee if their first or last name contains the user's response.
        for (Map<String, String> employee : employees) {
            if (employee.get(LAST).toLowerCase().contains(response) || employee.get(FIRST).toLowerCase().contains(response)) {
                output.append(String.format("%-20s| %-18s| %s%n",
                        employee.get(FIRST) + " " + employee.get(LAST),
                        employee.get(POSITION), employee.get(SEPARATION)));
            }

        }

        System.out.println(output);
    }

    public static void main(String[] arg) {
        //Create new instance Solution39 "sorter"
        //Create new list of maps "employeeList"

        //Map of strings with string keys "temp" is equal to createMap("John", "Johnson", "Manager", "2016-12-31")
        //Add temp to employeeList

        //temp is equal to createMap("Tou", "Xiong", "Software Engineer", "2016-10-05")
        //Add temp to employeeList

        //temp is equal to createMap("Michaela", "Michaelson", "District Manager", "2015-12-19")
        //Add temp to employeeList

        //temp is equal to createMap("Jake", "Jacobson", "Programmer", "")
        //Add temp to employeeList

        //temp is equal to createMap("Jacquelyn", "Jackson", "DBA", "")
        //Add temp to employeeList

        //temp is equal to createMap("Sally", "Webber", "Web Developer", "2015-12-18")
        //Add temp to employeeList

        //employeeList is sorted
        //i.e., employeeList = sortList(employeeList)

        //Prompt the user to enter a search string
            //String "response" stores in the response in lowercase

        //Print output via printTable(employeeList, temp)
    }
}