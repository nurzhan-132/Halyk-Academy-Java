import java.util.Arrays;

public class SecondTask {
    public static int[] numbers = new int[20];

    static {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("The max of " + num1 + " and " + num2 + " is: " + Math.max(num1, num2));
        System.out.println("------------------------");
        System.out.println(printArray(numbers));
    }

    static String printArray(int[] arr) {
        return Arrays.toString(arr);
    }
}
