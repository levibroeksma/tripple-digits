package nl.novi.trippledigits;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Variabele
        int firstDigit;
        int secondDigit;
        int thirdDigit;

    // Randomizer

        Random randomizer = new Random();

        int maximum = 9;

    // Genereer willekeurige getallen

        firstDigit = randomizer.nextInt(maximum) + 1;
        secondDigit = randomizer.nextInt(maximum) + 1;
        thirdDigit = randomizer.nextInt(maximum) + 1;

    // Som en product

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;

    // Uitkomst tonen

        System.out.println("Som: " + sumOfDigits);
        System.out.println("Product: " + productOfDigits);

    // Voeg for loop toe om meerdere rondes te kunnen spelen

        int maxTimesToPlay = 3;
        Scanner userInput = new Scanner(System.in);

        while(true) {
        boolean hasPlayerWon = false;

        while(hasPlayerWon == false) {
            // Lees de input van de gebruiker

            System.out.println("Voer achter elkaar drie getallen in");



            int userChoise1 = userInput.nextInt();
            int userChoise2 = userInput.nextInt();
            int userChoise3 = userInput.nextInt();

            System.out.println("Je hebt de volgende getallen ingevuld:");
            System.out.println("Getal 1: " + userChoise1);
            System.out.println("Getal 2: " + userChoise2);
            System.out.println("Getal 3: " + userChoise3);

            int sumOfPlayer = userChoise1 + userChoise2 + userChoise3;
            int productOfPlayer = userChoise1 * userChoise2 * userChoise3;

            // Win conditie

            hasPlayerWon = sumOfPlayer == sumOfDigits && productOfPlayer == productOfDigits;

            if(hasPlayerWon) {
                System.out.println("Gefeliciflapstaard, je kunt rekenen!");
                break;
            } else {
                System.out.println("Mwop Mowp Mwop, you suck at this!");
            }
        }

        // voeg een keuze toe
        boolean continuePlaying = true;

        // wil je doorspelen?

        System.out.println("Wil je doorspelen? Toets y/n");

        // lees de keuze uit

        String continuePlayingUserChoise = userInput.next();

        // maar beslissing op basis van keuze

        switch (continuePlayingUserChoise) {
            case "y" : {
                System.out.println("Je hebt ervoor gekozen om door te spelen.");
                continuePlaying = true;
                break;
            }
            case "n" : {
                System.out.println("Je hebt ervoor gekozen om het spel te stoppen.");
                continuePlaying = false;
                break;
            }
            default:{
                System.out.println("Je hebt een ongeldige waarde ingevoerd.");
                break;
            }
        }

        if(!continuePlaying) {
            break;
        }
        }
         System.out.println("Het spel is afgelopen, bedankt voor het spelen.");
    }
}
