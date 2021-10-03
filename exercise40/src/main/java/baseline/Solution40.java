/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.util.List;
import java.util.Map;

public class Solution40 {

    private String takeInput() {
        //Returns the user's input.
        return "";
    }

    public Map<String, String> createMap(String first, String last, String position, String separation) {
        //Create map of Strings with keys Strings "map"

        //Put "first_name", 'first' in map
        //Put "last_name", 'last' in map
        //Put "position", 'position' in map
        //Put "sd", 'separation' in map

        //return map
        return null;
    }

    public void sortList(List<Map<String, String>> employees) {
        //Using Collections.sort() with employees and a Comparator:
        //Compare Map1 to Map2 last_name, using a lambda
        //The Comparator will sort it, no need for a return value.
    }

    public void printTable(List<Map<String, String>> employees, String response) {
        //Create new StringBuilder "output"
        //Append header of table to output
        //i.e., "Name                | Position          | Separation Date\n"
        //Append underline of header to output
        //i.e., "--------------------|-------------------|----------------\n"
        //For each value in employees (employee):
            //If employee's first_name or last_name (in lowercase) contains user's response:
                //Append employee
                    //i.e., "'first_Name' 'lastName' | 'position'       | 'sd'         \n"

        //Print output
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