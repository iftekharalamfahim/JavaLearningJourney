package day3;

public class MethodOverloading {
    public static void main(String[] args) {
        int newPoint = calculatePoint("Jack", 500);
        System.out.println("New point is " + newPoint);

        calculatePoint(75);
        calculatePoint();
    }

    public static int calculatePoint(String playerName, int point){
        System.out.println("Player " + playerName +" got " + point + " points");
        return point * 1000;
    }

//    public static int calculatePoint(int point){
//        System.out.println("Unnamed player got " + point  + " points");
//        return point * 1000;
//    }

    public static int calculatePoint(int point){
        return calculatePoint("Anonymous ", point);
    }

    public static int calculatePoint(){
        System.out.println("No player name no player point.");
        return 0;
    }
}
