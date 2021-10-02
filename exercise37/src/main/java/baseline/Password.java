package baseline;

import java.util.List;
import java.util.Random;

public class Password {

    private final List<Character> alphabetList;
    private final List<Character> specialList;
    private final List<Integer> numberList;

    Random random = new Random();

    Password(List<Character> alphabet, List<Character> special, List<Integer> numbers) {
        alphabetList = alphabet;
        specialList = special;
        numberList = numbers;
    }

    public String createPassword(int minLength, int numSpecial, int numNumbers) {
        int numCharacters = Math.max(2 * (numSpecial + numNumbers), minLength);

        int roll;
        int specialCnt = 0;
        int numCnt = 0;
        StringBuilder password = new StringBuilder();

        while(true) {
            if(specialCnt == numSpecial && numCnt == numNumbers && password.length() >= numCharacters)
                break;
            else {
                roll = random.nextInt(3);
                if(roll == 0 && specialCnt != numSpecial) {
                    specialCnt++;
                    password.append(specialList.get(random.nextInt(specialList.size())));
                }
                else if(roll == 1 && numCnt != numNumbers) {
                    numCnt++;
                    password.append(numberList.get(random.nextInt(numberList.size())));
                }
                else
                    password.append(alphabetList.get(random.nextInt(alphabetList.size())));
            }
        }

        return String.valueOf(password);
    }
}
