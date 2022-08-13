import java.util.Scanner;

public class TaxiPrice {
    public static void main(String[] args) {

        int km;
        double perKm, total;


        perKm = 2.20;
        total = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the KM: ");
        km = scanner.nextInt();

        total += (perKm * km);
        boolean minPrise = total <= 20;

        double price = minPrise ? 20 : total;
        System.out.println("Your payed: " + price);

    }
}
