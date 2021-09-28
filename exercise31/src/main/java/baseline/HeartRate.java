/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class HeartRate {
    //Create static integers age and restingHR

    HeartRate(int age, int restingHR) {
        //Constructor
        //Set this.age equal to age
        //Set this.restingHR equal to restingHR
    }

    public int round(double target) {
        //Create temporary BigDecimal "temp"
        //Round BigDecimal to the next integer.
        //Return the integer value of temp.
        return 0;
    }

    public double calcTargetHR(double intensity) {
        //Return formula for target heart rate
            //(((220 - age) - restingHR) * intensity) + restingHR
        return 0;
    }

    private StringBuilder createTargetTableHeader() {
        //Create new StringBuilder "temp"
        //Append "Resting Pulse: 'restingHR'" to temp
        //Append formatted "Age: 'age'\n" with eight spaces in front of it ("%12s: %d\n", "Age:", age) to temp
        //Append formatted "Intensity    | Rate\n-------------|--------\n" ("Intensity%5s
                                                                          //Rate\n-------------|--------\n", "|") to temp
        //return temp
        return new StringBuilder();
    }

    public String createTargetTable() {
        //Create double intensity
        //Create int target
        //StringBuilder temp is set equal to createTargetTableHeader()

        //Loop from 55 to 95 in increments of 5 (i)
            //Append formatted "i%          | " ("%d%% %10s ", i, "|") to temp
            //intensity = i/100
            //target = round(calcTargetHR(intensity))
            //Append formatted "'target' bpm\n" ("%d bpm\n) to temp
        //Return String value of temp
        return "";
    }
}
