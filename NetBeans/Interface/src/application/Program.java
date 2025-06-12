package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = r.nextLine();
        System.out.println("Retirada(dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(r.nextLine(), fmt);
        System.out.println("Retorno(dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(r.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter with price per hour: ");
        double pricePerHour = r.nextDouble();
        System.out.println("Enter with price per day: ");
        double pricePerDay = r.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        if (cr.getInvoice() != null) {
            System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
            System.out.println("Imposto: " + cr.getInvoice().getTax());
            System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
        } else {
            System.out.println("Fatura não disponível.");
        }

        r.close();

    }

}
