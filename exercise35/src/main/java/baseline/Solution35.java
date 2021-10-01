package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    private String takeInput() {
        return input.nextLine();
    }

    public int getRandValue(ArrayList names) {
        int index = names.size();
        return random.nextInt(index);
    }

    public List<String> makeList() {
        ArrayList<String> names = new ArrayList<>();
        String response = "null";

        while(!response.equals("")) {
            System.out.print("Enter a name: ");
            response = takeInput();
            if (!response.equals(""))
                names.add(response);
        }
        return names;
    }

    public static void main(String[] arg) {
        //Create instance of Class Solution35 "lister"
        //Print "Type in names and the program will pick a winner. Press enter whenever you are finished."

        //ArrayList names is set equal to makeList()
        //While names is empty:
            //Output you need to input at least one name!
            //names = makeList()

        //Integer index is set equal to getRandValue(names)

        //Print "The winner is... 'names.get(index)'."
    }
}
