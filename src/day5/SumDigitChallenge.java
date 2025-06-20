package day5;
/*In this challenge, your task is to write a method with the name sumDigits that has a single parameter named number, of
 * type int, and it should return an int.
 * The method should only take a number that is a positive number.
 * If a negative number is passed, it should return -1, meaning, an invalid value was passed.
 * The method should parse out each digit from the number and sum the digits up.
 * So, if 125 is the value passed to the method, the code should sum each digit, in this case, 1 + 2 + 5, and return 8,
 * as a value.
 * And another example, if the value is 1000, the code should sum each digit, 1 + 0 + 0 + 0, and return 1 as a value.
 * If the number is a single digit number, simply return the number itself as the result.
 *
 * hint:
 *  use N modulo 10 to extract the least significant digit or the rightmost digit.
 *  And use N equals N divided by 10 to drop the last digit as you are looping.
 * */

public class SumDigitChallenge {
    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

    }
    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;

        while (number > 9){
            sum += (number % 10); //sum = sum + (number % 10); means: 1234 % 10= 4
            number = number / 10; // means 1234 / 10 = 123; then repeat
        }
        sum += number;

        return sum;
    }
}
