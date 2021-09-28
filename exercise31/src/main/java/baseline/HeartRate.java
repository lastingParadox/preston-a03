/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HeartRate {
    private final int age;
    private final int restingHR;

    HeartRate(int age, int restingHR) {
        //Constructor
        this.age = age;
        this.restingHR = restingHR;
    }

    public int round(double target) {
        BigDecimal temp = BigDecimal.valueOf(target);
        temp = temp.setScale(0, RoundingMode.HALF_UP);
        return temp.intValue();
    }

    public double calcTargetHR(double intensity) {
        return (((220 - age) - restingHR) * intensity) + restingHR;
    }

    private StringBuilder createTargetTableHeader() {
        StringBuilder temp = new StringBuilder();

        temp.append(String.format("Resting Pulse: %d", restingHR));
        temp.append(String.format("%11s: %d%n%n", "Age", age));
        temp.append(String.format("Intensity%5s Rate%n-------------|--------%n", "|"));

        return temp;
    }

    public String createTargetTable() {
        double intensity;
        int target;

        StringBuilder temp = createTargetTableHeader();

        for(int i = 55; i<=95; i+=5) {
            temp.append(String.format("%d%% %10s ", i, "|"));
            intensity = ((double)i/100);
            target = round(calcTargetHR(intensity));
            temp.append(String.format("%d bpm%n", target));
        }
        return String.valueOf(temp);
    }
}
