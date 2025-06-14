package day3;

public class MethodUse {
    public static void main(String[] args) {   // this is one kind of method named "main" method

        int highPoint = calculatePoint(true, 80, 5, 10);
        // the values inside the brackets are the argument for the methods
        System.out.println("The highest point is " + highPoint);

//        calculatePoint( true, 80, levelCompleted, bonus); //this one is also valid in java

        System.out.println("The next highest point is " +
                calculatePoint(true, 1000, 8, 20));
        //passing a method call as an argument to the println statement
    }

//    public static void calculatePoint(boolean gameOver, int point, int levelCompleted, int bonus){
//
//        int finalPoint = point;
//
//        if(gameOver){
//            finalPoint += (levelCompleted * bonus);
//            finalPoint += 100;
//            System.out.println("Your final point was: " + finalPoint);
//         }
//
//     }
//  }

    //method with parameters and return type

    public static int calculatePoint(boolean gameOver, int point, int levelCompleted, int bonus) {
        int finalPoint = point;

        if (gameOver) {
            finalPoint += (levelCompleted * bonus);
            finalPoint += 100;
        }
        return finalPoint;
    }
}