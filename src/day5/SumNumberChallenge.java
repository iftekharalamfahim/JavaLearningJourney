package day5;
/* Sum 3 and 5 Challenge
 * Create a for loop using a range of numbers from 1 to 1000 inclusive.
 * Sum all the numbers that can be divided by both 3 and 5.
 * Print out the numbers that have met the above conditions.
 * Break out of the loop once you have found 5 numbers that met the conditions above.
 * After breaking out of the loop, print the sum of the numbers that met the conditions above.
 * Note: Type all code in the main method.*/

public class SumNumberChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if( (i % 3  == 0) && (i % 5 == 0)){
                count++;
                sum +=i;
                System.out.println("The numbers that are divisible by both 3 & 5: " + i);
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
