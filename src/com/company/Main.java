package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // scanner
        int crib_id = SQLExecution.nextCribId("crib"); // gets maximum id from crib table
        int client_id = SQLExecution.nextCribId("client"); // gets maximum id from client table

        while (true) {  // loop for choosing options until you exit the program
            System.out.println("\nMenu\n1. Build a crib\n2. Cribs\n3. Head Masters\n4. Ozbeks\n5. Clients\n6. Exit\nChoose one: "); // menu for choosing option

            int option_menu = in.nextInt(); // chosen option
            boolean isExit = false; // to exit the program

            switch (option_menu) {  // statements for each option
                case 1 -> { // option for building new house
                    HouseOzbek bender = new HouseOzbek();
                    bender.setId(RandomNumber.generate(101, 106));  // choosing new builder by random id
                    HeadMaster boss = new HeadMaster(bender);
                    boss.setId(RandomNumber.generate(201, 204));  // choosing new boss by random id

                    System.out.println("Fill the documents of your new house");

                    Client newClient = new Client();  // creating new Client object
                    newClient.setId(client_id);
                    System.out.println("Insert your first name: ");
                    newClient.setFirstName(in.next());  // program asks user to input his/her first name
                    System.out.println("Insert your last name: ");
                    newClient.setLastName(in.next());  // program asks user to input his/her second name
                    System.out.println("Your address: ");
                    String new_address = in.next();  // program asks user to input his/her address

                    System.out.println("Select which type of crib you want to build:\n1. S1mple\n2. Standard\n3. Euro");

                    int option_build = in.nextInt();  // requesting a user to input which type of crib
                    switch (option_build) {
                        case 1:
                            boss.makeSimple();  // if 1 is selected, then boss commands his builder to make a s1mple crib
                            break;
                        case 2:
                            boss.makeStandard();  // if 2 is selected, then boss commands his builder to make a standard crib
                            break;
                        case 3:
                            boss.makeEuro();  // if 3 is selected, then boss commands his builder to make a euro crib
                            break;
                    }

                    newClient.setMyCrib(bender.getNewBuiltCrib());  // giving the new built crib to client
                    newClient.getMyCrib().setAddress(new_address);  // setting new address for the new crib

                    // saving the new crib into database
                    SQLExecution.executeQuery("insert into crib(values(" + crib_id + ", \'" + newClient.getFirstName() + "\', \'" +
                            newClient.getLastName() + "\', \'" + new_address + "\', '" + (newClient.getMyCrib().isWalls() ? "Yes" : "No") + "\', \'" +
                            (newClient.getMyCrib().isDoors() ? "Yes" : "No") + "\', \'" + (newClient.getMyCrib().isWindows() ? "Yes" : "No") + "\', \'" + (newClient.getMyCrib().isRoof() ? "Yes" : "No") + "\', \'" +
                            (newClient.getMyCrib().isGarage() ? "Yes" : "No") + "\', \'" + (newClient.getMyCrib().isFence() ? "Yes" : "No") + "\', \'" + (newClient.getMyCrib().isPool() ? "Yes" : "No") + "\', " +
                            (bender.getId()) + ", " + (boss.getId()) + "));", 'c', false);

                    // saving the new client into database
                    SQLExecution.executeQuery("insert into client(values(" + crib_id + ", \'" + newClient.getFirstName() + "\', \'" + newClient.getLastName() + "\', " + crib_id + "));", 'p', false);
                }
                case 2 -> {  // option for printing list of crib from database
                    SQLExecution.executeQuery("select * from crib;", 'c', true);
                }
                case 3 -> {  // option for printing list of headmaster from database
                    SQLExecution.executeQuery("select * from headmaster;", 'h', true);
                }
                case 4 -> {  // option for printing list of ozbek from database
                    SQLExecution.executeQuery("select * from ozbek;", 'o', true);
                }
                case 5 -> {  // option for printing list of client from database
                    SQLExecution.executeQuery("select * from client;", 'p', true);
                }
                case 6 -> { // option for exiting the program
                    isExit = true;
                }
                default -> { // if different option was selected, program requires to reselect again
                    System.out.println("Please, try again!");
                }
            }
            if (isExit) { // if isExit is true, program will shut down
                break;
            }
        }
    }
}
