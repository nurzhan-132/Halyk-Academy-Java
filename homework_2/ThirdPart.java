public class ThirdPart {
    final static String ROUNDS_PER_MINUTE = "15000rpm";
    /
    // final means it cannot be changed after declaration
    // and we need to initialize it immediately after declaring it.
    public static void main(String[] args) {
        String one = "15000rpm";
        String two = new String("15000rpm");

        System.out.println(one == ROUNDS_PER_MINUTE);
        System.out.println(two == ROUNDS_PER_MINUTE);
    }
}