package data_structures;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Create and initialize an array in one line");
        String[] names = {"Ted", "James", "Sally"};
        System.out.println("names[0]: " + names[0]);
        System.out.println("names[1]: " + names[1]);
        System.out.println("names[2]: " + names[2]);

        System.out.println();

        System.out.println("Create an array with data and initialize later");
        int[] numbers;
        numbers = new int[] {15, 47, 983};
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);

        System.out.println();

        System.out.println("Creating an array with size and initialize later");
        double[] prices;
        prices = new double[3];
        prices[0] = 10;
        prices[1] = 5.9;
        prices[2] = 2.45;
        System.out.println("prices[0]: " + prices[0]);
        System.out.println("prices[1]: " + prices[1]);
        System.out.println("prices[2]: " + prices[2]);

        System.out.println();

        System.out.println("Get an array length with <array_name>.length");
        String[] stringArray = new String[3];
        System.out.println("stringArray.length: " + stringArray.length);

        System.out.println();

        System.out.println("Changing an array element");
        String[] partyList = {"Todd", "Bethany", "Olivia"};
        System.out.println("partyList[1]: " + partyList[1]);
        partyList[1] = "Sophia";
        System.out.println("partyList[1]: " + partyList[1]);

        System.out.println();

        System.out.println("Multidimensional Arrays");
        char[][] ticTacToeBoard = { {'-', 'X', 'O'}, {'X', '-', 'O'}, {'O', 'X', '-'}};
        System.out.println("ticTacToeBoard[0][1]: " + ticTacToeBoard[0][1]);
    }
}
