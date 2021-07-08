package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection {

    public static void main(String[] args) {
        String enteredInput;
        boolean exit = false;

        ArrayList<String> cricketPlayers = new ArrayList<>();

        cricketPlayers.add("Position: 36, Player: Kusal Perera, Ratting: 508");
        cricketPlayers.add("Position: 56, Player: Danushka Gunathilaka, Ratting: 449");


        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Add a player...................Enter A");
            System.out.println("Display two best players... ...Enter B");
            System.out.println("Display two best bowlers.......Enter C");
            System.out.println("Display the best keeper........Enter D");
            System.out.println("View all players...............Enter V");
            System.out.println("Exit program...................Enter E");
            enteredInput = input.next();

            switch (enteredInput) {
                case "A":

                case "B":

                case "C":

                case "D":

                case "V":
                    
                case "E":
                    exit = true;
            }
        } while (!exit);
    }
}
