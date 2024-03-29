package excecoesEmJava.exercicios.hotel.application;

import excecoesEmJava.exercicios.hotel.model.entities.Reservation;
import excecoesEmJava.exercicios.hotel.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    // Quando utilizado o throws ParseException significa que o método main não precisa tratar este tipo
    //  de exceção quando acontecer, e sim propagar ela quando acontecer, as subclasses que acessarem o main
    //  podem tratar ou adicionar o throws também se achar necessário.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();

            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid Date Format");
        } catch (DomainException e) {
            System.out.println("Error in Reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!" + e.getMessage());
        }

        sc.close();
    }
}
