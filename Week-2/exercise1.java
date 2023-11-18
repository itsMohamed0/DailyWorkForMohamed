package testingstuff;

public class exercise1 {
    public static void main(String[] args) {
        int num = 24; 
        String result = classifyNumber(num);
        System.out.println("The number " + num + " is " + result);
    }

    public static String classifyNumber(int num) {
    	 int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return "perfect";
        } else if (sum > num) {
            return "abundant";
        } else {
            return "deficient";
        }
    }
}
