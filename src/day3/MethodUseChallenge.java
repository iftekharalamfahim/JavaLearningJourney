package day3;

// Challenge (Method)
/* In this challenge we're going to create two methods:
 * The first method should be named displayHighPointPosition.
 * This method should have two parameters, one for a player's name, and one for a player's position in a high point list.
 * This method should print a message like "Kafka managed to get into position 2 on the high point list".
 *
 * This second method should be named calculateHighPointPosition.
 * This method should have only one parameter, the player's point.
 * This method should return a number between 1 and 4, based on the point values shown in the table.
 *
 * Point greater than or equal to 100 ----------------------- 1
 * Point greater than or equal to 50 but less than 100 ----- 2
 * Point greater than or equal to 10 but less than 50 ------ 3
 * All other points ------------------------------------------ 4
 *
 * Finally, we'll call both methods and display the results for the following points: 1500, 1000, 500, 100, 25. */

public class MethodUseChallenge {

    public static void main(String[] args) {
        int playerPosition = calculateHighPointPosition(150);
        displayHighPointPosition("Mohsin", playerPosition);

        playerPosition = calculateHighPointPosition(100);
        displayHighPointPosition("Redx", playerPosition);

        playerPosition = calculateHighPointPosition(50);
        displayHighPointPosition("Rain", playerPosition);

        playerPosition = calculateHighPointPosition(10);
        displayHighPointPosition("Sunle", playerPosition);

        playerPosition = calculateHighPointPosition(5);
        displayHighPointPosition("Sam", playerPosition);
    }

    public static void displayHighPointPosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high point list");
    }

    public static int calculateHighPointPosition(int playerPoint) {
        int position = 4;

        if (playerPoint >= 100) {
            //return 1;
            position = 1;
        } else if (playerPoint >= 50) {
            //else if (playerPoint >= 50 && playerPoint < 100) {
            //return 2;
            position = 2;
        } else if (playerPoint >= 10) {
            //else if (playerPoint >= 10 && playerPoint < 50) {
            //return  3;
            position = 3;
        }

//        else {
//            return 4;
//        }
        //return 4;
        return position;
    }

}
