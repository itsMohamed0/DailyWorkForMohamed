package mypackage;

public class exercise4 {
    static int colorToValue(String color) {
        color = color.toLowerCase();
        if (color.equals("black")) {
            return 0;
        } else if (color.equals("brown")) {
            return 1;
        } else if (color.equals("red")) {
            return 2;
        } else if (color.equals("orange")) {
            return 3;
        } else if (color.equals("yellow")) {
            return 4;
        } else if (color.equals("green")) {
            return 5;
        } else if (color.equals("blue")) {
            return 6;
        } else {
            return -1; 
        }
    }

    public static String decoding(String color1, String color2) {
        int value1 = colorToValue(color1);
        int value2 = colorToValue(color2);

        if (value1 == -1 || value2 == -1) {
            return "Invalid color";
        }

        return String.valueOf(value1) + String.valueOf(value2);
    }
}

