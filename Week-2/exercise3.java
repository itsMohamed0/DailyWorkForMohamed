package testingstuff;

public class exercise3 {
    public boolean isArmstrong(int num) {
        int originalNumber = num;
        int remainder, result = 0, n = 0;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;

        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        return result == num;
    }
}
