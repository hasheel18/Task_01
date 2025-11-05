import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy? : ");
        String item = scanner.nextLine();
        System.out.print("What is the price for each? : ");
        double price = scanner.nextDouble();
        System.out.print("How many would you like? : ");
        int quantity = scanner.nextInt();

        System.out.print("You have bought " + quantity + " " + item + "/s\n");
        System.out.print("Your total is $" + price + "\n");
    }
}