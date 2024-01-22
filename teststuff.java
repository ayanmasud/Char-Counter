/*
Enter a sentence and get how many letters of each letter there are.
Ayan Masud
1/21/24
 */

import java.util.*;

public class teststuff {
    Scanner scanner;
    String input = "";
    int[] store = new int[25];

    public teststuff(){
        scanner = new Scanner(System.in);
        input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if((int)(character) >= 97 && (int)(character) <= 123){ // lowercase
                int letter = (int)(character) - 97;
                store[letter] += 1;
            }
            if((int)(character) >= 65 && (int)(character) <= 91){ // uppercase
                int letter = (int)(character) - 65;
                store[letter] += 1;
            }
        }

        for (int i = 0; i < 25; i++) {
            if (store[i] != 0) {
                char letter = (char)(i + 97);
                System.out.println(letter + " : " + store[i]);
            }
        }
    }

    public static void main(String[] args){
        new teststuff();
    }

}
