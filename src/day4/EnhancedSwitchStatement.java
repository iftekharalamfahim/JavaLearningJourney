package day4;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {

        //Switch Enhanced
        int switchValue = 4;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            default -> System.out.println("Value was not 1 or 2 or 3");
        }
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        // enhanced switch expression
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
//            default -> "bad";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
                //yield is used as a replacement of return in the code block of switch statement
            }
        };
    }
}
