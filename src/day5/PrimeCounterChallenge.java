package day5;
/*Create a prime number counter variable, that will keep count of how many prime numbers were found.
Create a for statement, using any range of numbers, where the maximum number is <= 1000.
For each number in the range:
  - Check to see if it's a prime number using the isPrime method.
  - If the number is prime, print it out and increment the prime number counter variable.
  - Once the prime number counter equals three, exit the loop (hint: use the break statement to exit)
 */

public class PrimeCounterChallenge {
    public static void main(String[] args) {
        int count = 0;
        for( int i = 10; count < 3 && i<=50; i++){
            if( isPrime(i)){
                System.out.println("number " + i + " is a prime number.");
                count++;
//                if (count == 3){
//                    System.out.println("Found 3 - Exiting for loop");
//                    break;
//                }
            }
        }

    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return wholeNumber == 2;
        }
        for(int number = 2; number < wholeNumber; number++){
            if( wholeNumber % number == 0 ){
                return false;
            }
        }

        return true;
    }
}
