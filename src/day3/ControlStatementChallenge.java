package day3;

// Challenge (if then else)
/*
Write a code segment for a gaming point counter:
- set the point variable to 1000;
- set the levelCompleted variable to 8;
- set the bonus variable to 20;
- use the if condition. meaning if gameOver is true, then you want to perform the calculation,
and print out the value of the finalPoint variable;

input: finalPoint += (levelCompleted * bonus)
output: Your final point is: #####;
*/

public class ControlStatementChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int point = 1000;
        int levelCompleted = 8;
        int bonus = 20;

        int finalPoint = point;

        if (gameOver) {
            finalPoint += (levelCompleted * bonus); // finalPoint = finalPoint + (levelCompleted * bonus)
            System.out.println("Your final point was: " + finalPoint);
        }
    }

}
