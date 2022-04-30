import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] collection = str.toCharArray();
        subdivisionRecursion(collection, 0, "");
    }

    //Method that find subdivision of an array using Recursion
    private static void subdivisionRecursion(char[] collection, int i, String result) {
        if (i == collection.length) {
            System.out.print("{" + result + "}");
            return;
        }

        subdivisionRecursion(collection, i + 1, result);
        subdivisionRecursion(collection, i + 1, result + collection[i]);
    }
}
