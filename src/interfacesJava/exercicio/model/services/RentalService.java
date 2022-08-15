package interfacesJava.exercicio.model.services;

import interfacesJava.exercicio.model.entities.CarRental;
import interfacesJava.exercicio.model.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService brazilTaxService;

    public RentalService() {
    }

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
        long miliDateStart = carRental.getStart().getTime();
        long miliDateFinish = carRental.getFinish().getTime();
        // Converte para segundos (1000) minutos (60) horas (60)
        double hours = (double) (miliDateFinish - miliDateStart) / 1000 / 60 / 60;
        double basicPayment;
        if (hours <= 12) {
            //Math.ceil arredonda pra cima
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
