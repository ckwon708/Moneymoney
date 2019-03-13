import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class moneymoney {

    // Java version 11.
    // private static Map<String, Integer> presidentsToDenomination = new HashMap<>();
    // private static Map<Integer, String> denominationToPresidents = new HashMap<>();

    // Java version 1.8 (aka 8)
    private static Map<String, Integer> presidentsToDenomination = new HashMap<String, Integer>();
    private static Map<Integer, String> denominationToPresidents = new HashMap<Integer, String>();

    public static void main(String[] args) {
        presidentsToDenomination.put("Washington", 1);
        presidentsToDenomination.put("Hamilton", 10);
        presidentsToDenomination.put("Franklin", 100);

        denominationToPresidents.put(1, "Washington");
        denominationToPresidents.put(10, "Hamilton");
        denominationToPresidents.put(100, "Franklin");

        System.out.println("Welcome to Moneymoney!");

        Scanner reader = new Scanner(System.in);
        boolean hasCorrectAnswer = false;

        while (!hasCorrectAnswer) {
            System.out.print("Please enter '1' for denomination or '2' for last name: ");
            int response = reader.nextInt();

            if (response == 1) {
                int dollar = 0;

                while (!denominationToPresidents.containsKey(dollar)) {
                    System.out.print("Please enter 1, 10, or 100: ");
                    dollar = reader.nextInt();
                }

                String presName = "";

                while (!presidentsToDenomination.containsKey(presName) || presidentsToDenomination.get(presName) != dollar) {
                    System.out.print("Which president appears on the $" + dollar + " bill? ");
                    presName = reader.next();

                    if (presidentsToDenomination.containsKey(presName) && presidentsToDenomination.get(presName) == dollar) {
                        System.out.println("Correct!");
                        hasCorrectAnswer = true;
                    } else {
                        System.out.println("Incorrect, please try again.");
                    }
                }

            } else if (response == 2) {
                String name = "";

                while (!presidentsToDenomination.containsKey(name)) {
                    System.out.print("Please enter last name (e.g. Washington, Hamilton, or Franklin): ");
                    name = reader.next();
                }

                int denomination = 0;
                while (!denominationToPresidents.containsKey(denomination) || !denominationToPresidents.get(denomination).equals(name)) {
                    System.out.print("Which denomination does " + name + " appear on? ");
                    denomination = reader.nextInt();

                    if (denominationToPresidents.containsKey(denomination) && denominationToPresidents.get(denomination).equals(name)) {
                        System.out.println("Correct!");
                        hasCorrectAnswer = true;
                    } else {
                        System.out.println("Incorrect, try again.");
                    }
                }
            }
        }
    }
}