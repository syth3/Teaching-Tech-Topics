package conditionals;

public class nestedIfStatements {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        if (x == 30) {
            if (y == 40) {
                System.out.println("X = 30 and Y = 40");
            }
        }
        else {
            System.out.println("X is not equal to 30");
        }
    }
}
