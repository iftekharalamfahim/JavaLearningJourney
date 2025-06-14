package day3;

//Challenge (Method Overloading)

/* Create two methods with the same name: convertToCentimeters
* The fist method has one parameter of type int, which represents the entire height in inches. You'll convert inches to
  cm, in this method, and pass back the number of cm, as a double.
* The second method has two parameters of type of int, one to represent height in ft, and one to represent the remaining
  height in inches. So if a person is a 5 ft, 6 inches, the values 5 for ft and 6 for inches would be passed to this
  method. This method will convert ft and inches to just inches, then call the first method, to get the number of cm,
  also returning the value as a double.
* Both method should return a real number or decimal value for total height in cm.
* Call both methods, and print out the results
* The conversion formula from inches to cm is 1 inch = 2.54 cm. 1 ft = 12 inches/
 */

public class CentimeterConversion {
    public static void main(String[] args) {
        System.out.println("5 ft, 8 in= " +convertToCentimeters(5, 6) + "cm");
        System.out.println("67 inches = " + convertToCentimeters(67) + "cm");
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters( int feet, int inches){
        //return ((feet * 12) + inches) * 2.54;

        return convertToCentimeters((feet*12) + inches);

//        int feetToInches = feet * 12;
//        int totalInches = feetToInches + inches;
//        double result = convertToCentimeters(totalInches);
//        return result;
    }
}
