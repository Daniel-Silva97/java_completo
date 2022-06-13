package secaoArraysListas.exercicios.vetores.application;

import secaoArraysListas.exercicios.vetores.entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberRooms = 10;
        Room[] vect = new Room[numberRooms];

        System.out.print("How many rooms will be rented? (1 - 10): ");
        int rent = sc.nextInt();

        for (int i = 0; i < rent; i++) {
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room Number (0 - 9): ");
            int roomNumber = sc.nextInt();

            if (vect[roomNumber] == null) {
                vect[roomNumber] = new Room(name, email);
            } else {
                i--;
                System.out.println("Room unavailable!");
            }
        }

        // Output rents
        System.out.println();
        System.out.println("Busy Rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
