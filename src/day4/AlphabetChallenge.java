package day4;
/* Use the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
 * In radio transmissions, the word car, "C", "A", "R" would be read, "Charlie Able Rager", for clarity.
 * We'll take a single character, and return the matching word from the NATO phonetic alphabet, shown below.
 *
 * NATO phonetic alphabet:
 * A = Able, B = Baker, C = Charlie, D = Dog, E = Easy
 * F = Fox, G = George, H = How, I = Item, J = Jig,
 * K = King, L = Love, M = Mike, N = Nan, O = Oboe,
 * P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare
 * U = Uncle, V = Victor, W = William, X = X-ray, Y = Yoke, Z = Zebra
 *
 * To do this:
 *   1. Create a new char variable
 *   2. Use the TRADITIONAL switch statement that tests the value in the variable from step 1.
 *   3. Display a message in each case block, with the letter and the NATO word, then break.
 *   4. Add a default block, which displays the letter with a message saying not found.
 * */
public class AlphabetChallenge {
    //TRADITIONAL SWITCH STATEMENT

    public static void main(String[] args) {
        char charValue = 'B';

        switch (charValue){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " +charValue+ " was not found!");
        }
    }
}
