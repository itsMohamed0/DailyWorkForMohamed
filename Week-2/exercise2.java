package testingstuff;

public class exercise2 {
    public static void main(String[] args) {
        int side1 = 5; 
        int side2 = 3; 
        int side3 = 3; 
        String result = triangle(side1, side2, side3);
        System.out.println("The triangle is " + result);
    }

    public static String triangle(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}