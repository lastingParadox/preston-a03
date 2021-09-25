package baseline;

public class Password {

    public boolean hasNumber(String password) {
        //Using regEx, create a pattern of numbers: "[0-9]"
        //Create a matcher instance to read if password has a number in it.
        //If password has a number in it:
            //Return true.
        //Else return false.
        return false;
    }

    public boolean hasLetter(String password) {
        //Using regEx, create a pattern of numbers: "[a-zA-z]"
        //Create a matcher instance to read if password has a number in it.
        //If password has a number in it:
            //Return true.
        //Else return false.
        return false;
    }

    public boolean hasSpecial(String password) {
        //Using regEx, create a pattern of numbers: "[!@#$%&*()_+=|<>?{}\\[\\]~-]"
        //Create a matcher instance to read if password has a number in it.
        //If password has a number in it:
        //Return true.
        //Else return false.
        return false;
    }

    private int greaterPasswordAssigner(boolean number, boolean letter, boolean special) {
        //Returns a number based on various circumstances of a password greater than eight characters.
        //Used only in passwordValidator(password) and for organization.

        //Whereas 0 = "unknown", 1 = "very weak", 2 = "weak", 3 = "strong", 4 = "very strong":
            //If number and letter and special = true:
                //Return 4
            //Else if (number and special) or (letter and special) = true:
                //Return 0
            //Else if number and letter = true:
                //Return 3
            //Else
                //Return 0
        return 0;
    }

    private int lesserPasswordAssigner(boolean number, boolean letter, boolean special) {
        //Returns a number based on various circumstances of a password greater than eight characters.
        //Used only in passwordValidator(password) and for organization.

        //Whereas 0 = "unknown", 1 = "very weak", 2 = "weak", 3 = "strong", 4 = "very strong":
            //If (number and letter or special) or (letter and number or special) or special = true:
                //Return 0
            //Else if number = true:
                //Return 1
            //Else if letter = true:
                //Return 2
        return 0;
    }

    public int passwordValidator(String password) {
        //Create boolean variables number, letter, special
            //Set them equal to hasNumber(password), hasLetter(password), and hasSpecial(password) respectively.

            //If the password is eight characters or greater:
                //Return greaterPasswordAssigner(number, letter, special)
            //Else:
                //Return lesserPasswordAssigner(number, letter, special)

        return 0;
    }
}