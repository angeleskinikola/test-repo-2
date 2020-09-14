package com.learnprogramming;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter street:");
        String street = scanner.nextLine();

        System.out.println("Enter street number:");
        int streetNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter city:");
        String city = scanner.nextLine();

        System.out.println("Enter zip code:");
        int zipCode = scanner.nextInt();

        try {
            Address address = new Address(street, streetNumber, city, zipCode);
            System.out.println(address.toString());
        } catch (ZipCodeException e) {
            System.out.println(e.getMessage());
        }


    }
}
