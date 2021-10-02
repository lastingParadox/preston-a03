package baseline;

public class ResponseStats {

    //Create private static int array "responseArray"

    ResponseStats(int[] responseArray) {
        //This responseArray is equal to the provided responseArray.
    }

    public String printList() {
        //Create new StringBuilder output
        //Append "Numbers: " to output

        //Loop for each value in responseArray:
            //Append "'current value', " to output
        //return String value of output

        return "";
    }

    public double average() {
        //Integer "size" is equal to length of responseArray
        //Create double "sum" and set it to 0.

        //Loop for each value in responseArray:
            //sum is added to by the current value.
        //return sum/size;
        return 0;
    }

    public int min() {
        //Integer "size" is equal to length of responseArray
        //Integer "minimum" is set to the first value of the array.

        //Loop for each value in responseArray except for the first one:
            //If the current value is smaller than minimum:
                //minimum is equal to the current value.

        //return minimum
        return 0;
    }

    public int max() {
        //Integer "size" is equal to length of responseArray
        //Integer "maximum" is set to the first value of the array.

        //Loop for each value in responseArray except for the first one:
            //If the current value is larger than maximum:
                //maximum is equal to the current value.

        //return maximum
        return 0;
    }

    public double std() {
        //Integer "size" is equal to length of responseArray
        //double "mean" is equal to average()
        //double standardSum is set to zero

        //For each value in responseArray:
            //standardSum is equal to ('current value' - mean) squared

        //return the square root of standardSum / size-1
        return 0;
    }
}
