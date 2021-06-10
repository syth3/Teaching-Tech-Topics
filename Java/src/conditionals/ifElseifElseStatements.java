package conditionals;

public class ifElseifElseStatements {
    public static void main(String[] args) {
        System.out.println("If/Elseif/Else Statement with strings");
        String weather = "Rainy";
        if (weather.equals("Rainy")) {
            System.out.println("Bring your umbrella!");
        } else if (weather.equals("Sunny")) {
            System.out.println("Don't bring your umbrella");
        }
        else {
            System.out.println("Not sure what to do");
        }
    }
}
