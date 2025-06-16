package day4;

public class SwitchStatement {
    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else if (value == 3) {
            System.out.println("Value is 3");
        } else {
            System.out.println("Was not 1 or 2 or 3");
        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            default:
                System.out.println("Value was not 1 or 2 or 3");

        }
    }
}

