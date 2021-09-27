/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zander Preston
 */

package baseline;

public class PaymentCalculator {

    //Create final bigDecimal variables balance, dailyRate, monthPayment

    PaymentCalculator(double balance, double apr, double monthPayment) {
        //Set balance equal to this balance, rounded up to next cent
        //Set dailyRate equal to apr / 365
        //Set monthPayment equal to this month payment, rounded up to next cent
    }

    public int calculateMonthsUntilPaidOff() {
        //monthstoPay is set equal to the formula for calculating months until the card is paid off.
            //i.e., n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
                //n = monthstoPay
                //i = dailyRate
                //b = balance
                //p = monthPayment
        //monthstoPay is rounded to the nearest integer and is returned.
        return 0;
    }
}
