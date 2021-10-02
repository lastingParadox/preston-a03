import java.util.List;

public class Password {

    //Private final List of Characters alphabetList
    //Private final List of Characters specialList
    //Private final List of Integers numberList

    //Private instance of Random "random"

    Password(List<Character> alphabet, List<Character> special, List<Integer> numbers) {
        //Constructor for the class
        //alphabetList is equal to alphabet
        //specialList is equal to special
        //numberList is equal to numbers
    }

    public String createPassword(int minLength, int numSpecial, int numNumbers) {
        //Create integer numCharacters
        //If 2*(special + numNumbers) is less than minLength:
            //numCharacters is equal to minLength
        //Else if 2*(special + numNumbers) is greater than or equal to minLength:
            //numCharacters is equal to 2(special + numNumbers)

        //Create integer "coinFlip"
        //Create integer specialCnt = 0
        //Create integer numCnt = 0
        //Create String password = ""
        //Loop:
            //coinFlip is equal to a random number between 0 and 1
            //If coinFlip is 0:
                //coinFlip is equal to a random number between 0 and 1
                //If coinFlip is 0 and specialCnt is not equal to numSpecial:
                    //specialCnt++
                    //Add the random character that is gained from a random index between 0 and size of specialList in specialList
                //If coinFlip is 1 and numCnt is not equal to numNumbers:
                    //numCnt++
                    //Add the random number that is gained from a random index between 0 and 9 in numberList
            //If coinFlip is 1:
                //Add the random character that is gained from a random index between 0 and size of alphabetList in alphabetList

            //If size of password is greater than or equal to numCharacters, specialCnt = numSpecial, and numCnt = numNumbers:
                //return password
        return "";
    }
}
