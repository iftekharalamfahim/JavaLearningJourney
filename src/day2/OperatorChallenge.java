package day2;

/* CHALLENGE
 * Step-1: create a double variable with a value of 40.00
 * Step-2: create a second variable of type double with a value of 160.00
 * Step-3: add both numbers together, then multiply by 100.00
 * Step-4: use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 80.00 will be.
 * Step-5: create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
 * Step-6: output the boolean variable just to see what the result is.
 * Step-7: write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.
 * */

public class OperatorChallenge {
    public static void main(String[] args) {
        double firstDoubleVariable = 35.00d;
        double secondDoubleVariable = 90.00d;
        //Step-3:
        double stepThree = (firstDoubleVariable + secondDoubleVariable) * 100.00d;
        System.out.println("The result of the step three is: " +stepThree);
        //Step-4:
        double stepFour = stepThree % 60.00d;
        System.out.println("The result of the step four is: " +stepFour);;
        //Step-5 & 6:
        boolean isNoRemainder = (stepFour == 0) ? true : false;
        System.out.println("inNoRemainder = " +isNoRemainder);
        //Step -7:
        if(!isNoRemainder){
            System.out.println("Got Some Remainder");
        }
    }
}
