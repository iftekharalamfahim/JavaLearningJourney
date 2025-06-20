package day5;
// Mini Challenge
/* Using a new for statement, call the calculateInterest method with the RMB amount of 100. And this time, use the
interest rates between 6.5 and 10, but increment by a quarter of a percent each time, meaning 0.25 percent.
And print the results to the console window.
 */
public class InterestRate {
    public static void main(String[] args) {
     for(double rate = 6.5; rate <= 10; rate += 0.25){
         double interestAmount = calculateInterest(100, rate);

//         if(interestAmount > 8.5){
//             break;
//         }
         System.out.println("$100.00 at " + rate + " % interest = $" +interestAmount);
     }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}

