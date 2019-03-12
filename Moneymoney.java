import java.util.Scanner;
public class moneyoeweufhw {

    public static void main(String[] args) {
        System.out.println("Welcome to Moneymoney! Press 1 to continue.");
        String name;
        String presName;

        Scanner reader = new Scanner(System.in);
        int response = reader.nextInt();

        while (response != 1 || response != 2)
        break;{
            System.out.println("Please enter denomination as 1, or last name as 2");
            response = reader.nextInt();
            if (response == 1) {
                System.out.println("Please enter 1, 10, 100");
                int dollar = reader.nextInt();

                if (dollar == 1) {
                    System.out.println("Which president appears on the $1 bill?");
                    presName = reader.next();
                    if (presName.equals("Washington")) {
                        System.out.println("Correct!");
                    } else {
                        while (!presName.equals("Washington")) {
                            System.out.print("Incorrect. Please enter a valid response: ");
                            presName = reader.next();
                            System.out.println("Correct!");
                        }
                    }
                } else if (dollar == 10) {
                    System.out.println("Which president appears on the $10 bill?");
                    presName = reader.next();
                    if (presName.contentEquals("Hamilton")) {
                        System.out.println("Correct!");
                    } else {
                        while (!presName.equals("Hamilton")) {
                            System.out.println("Incorrect. Please enter a valid response: ");
                            presName = reader.next();
                            System.out.println("Correct!");
                        }
                    }
                } else if (dollar == 100) {
                    System.out.println("Which president appears on the $100 bill?");
                    presName = reader.next();
                    if (presName.contentEquals("Franklin")) {
                        System.out.println("Correct!");
                    } else {
                        while (!presName.equals("Franklin")) {
                            System.out.println("Incorrect. Please enter a valid response: ");
                            presName = reader.next();
                            System.out.println("Correct!");
                        }
                    }
                }
            }

                else if (response == 2) {
                    System.out.println("Please enter last name: ex. Washington, Hamilton, or Franklin.");
                    name = reader.next();

                    if (name.equals("Washington")) {
                        System.out.println("Which denomination does Washington appear on?");
                        int responseNew = reader.nextInt();
                        if (responseNew == 1) {
                            System.out.println("Correct!");
                        } else {
                            System.out.println("Incorrect.");

                        }
                    } else if (name.equals("Hamilton")) {
                        System.out.println("Which denomination does Hamilton appear on?");
                        int responseNew = reader.nextInt();
                        if (responseNew == 10) {
                            System.out.println("Correct!");
                        } else {
                            System.out.println("Incorrect.");
                        }
                    } else if (name.equals("Franklin")) {
                        System.out.println("Which denomination does Franklin appear on?");
                        int responseNew = reader.nextInt();
                        if (responseNew == 100) {
                            System.out.println("Correct!");
                        } else {
                            System.out.println("Incorrect.");
                        }
                    }
                }
            }
        }
    }

