package day2;

public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello Jim");
        boolean isHuman = false;
        if (!isHuman)
            System.out.println("It is not a Human!");

        int topMark = 80;
        if (topMark == 100){
            System.out.println("You have got the Top Marks!");
        }

        int secondTopmark = 60;
            if (topMark > secondTopmark && topMark < 100){
                System.out.print("Greater than second top mark and less than 100");
            }
        int nextTopMark = 81;
        if ((topMark > 90) || (nextTopMark <= 90)) {
            System.out.println("Both got a good mark");
        }
        int newValue = 50;
        if (newValue == 50){
        /* if (newValue = 50) is an error.
        because we are not assigning a value here, instead we want to test if the value is equal to
        so keep in check when to use '=' (assignment op) and when to use '==' (equality op)*/

            System.out.println("This is true!");
        }

        boolean isHouse = false;
        if(isHouse == true){
            System.out.println("This is not supposed to happen");
        }

        boolean isBike = false;
        if (!isBike){
            System.out.println("I will not go from School.");
        }

        // The Ternary Operator, aka Conditional Operator (Condition ?: Operator)
        // operand1 ? operand2 : operand3

        String makeOfBike = "Honda";
        boolean isDomestic = makeOfBike == "Honda" ? false : true;

        if(isDomestic){
            System.out.println("The car is made in domestic");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);


        int ageOfCustomer = 20;
        String ageText = (ageOfCustomer >= 18) ? "Over Eighteen" : "Still a Kid";
        System.out.println("Our client is " + ageText);
    }
}
