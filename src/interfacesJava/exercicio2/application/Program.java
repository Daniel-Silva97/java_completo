package interfacesJava.exercicio2.application;

import interfacesJava.exercicio2.model.entities.Contract;
import interfacesJava.exercicio2.model.entities.Installment;
import interfacesJava.exercicio2.model.services.ContractService;
import interfacesJava.exercicio2.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        Date contractDate = sdf.parse(sc.next());

        System.out.print("Contract value: ");
        Double valueContract = sc.nextDouble();

        Contract contract = new Contract(number, contractDate, valueContract);


        System.out.print("Enter number of installments: ");
        Integer installments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }
        sc.close();
    }
}
