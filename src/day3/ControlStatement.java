package day3;

public class ControlStatement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int point = 50;
        int levelCompleted = 5;
        int bonus = 10;

        if (point == 1000) {
            System.out.println("Your point was 1000");
        }

        if (point < 1000) {
            System.out.println("Your point is less than 1000");

            if (point <= 1000) {
                System.out.println("Your point is less than equal to 1000");
            } else {
                System.out.println("Got here");
            }

            if (point < 1000 && point > 500) {
                System.out.println("Your point is less than 1000 but greater than 500");
            } else if (point < 500) {
                System.out.println("Your point is less than 500");
            } else {
                System.out.println("Got here");
            }
        }
    }
}
