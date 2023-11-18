package testingstuff;

public class exercise3drive {
    public static void main(String[] args) {
        exercise3 armstrong = new exercise3();
        int num = 370; 
        boolean result = armstrong.isArmstrong(num);
        if (result) {
            System.out.println("The number " + num + " is an Armstrong number");
        } else {
            System.out.println("The number " + num + " is not an Armstrong number");
        }
    }
}
