package mypackage;

public class exercise2 {
    public static String convert(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "Pling";
        }
        if (number % 5 == 0) {
            result += "Plang";
        }
        if (number % 7 == 0) {
            result += "Plong";
        }
        if (result.equals("")) {
            result = Integer.toString(number);
        }

        return result;
    }
}
