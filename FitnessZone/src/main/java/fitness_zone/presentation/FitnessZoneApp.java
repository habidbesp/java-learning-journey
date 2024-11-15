package fitness_zone.presentation;

import fitness_zone.data.ClientDAO;
import fitness_zone.data.IClientDAO;
import fitness_zone.domain.Client;
import fitness_zone.helpers.UpdateUserHelper;

import java.util.Scanner;

public class FitnessZoneApp {
    public static void main(String[] args) {
        fitnessZone();
    }

    public static void fitnessZone(){
        var exit = false;
        var console = new Scanner(System.in);

        IClientDAO clientDAO = new ClientDAO();

        System.out.println("*** Fitness Zone App ***");
        while (!exit){
            try {
                var option = showMenu(console);
                exit = executeOptions(option, console, clientDAO);
            } catch (Exception e) {
                System.out.println("An error has occurred: " + e.getMessage());
            }
            finally {
                System.out.println(); // Print a new line after each operation
            }
        }

    }

    private static int showMenu(Scanner console) {
        System.out.print("""
                Menu:
                1. List all clients
                2. Register a client
                3. Update client info
                4. Delete a client
                5. Logout (close app)
                Choose an option:\s""");
        return Integer.parseInt(console.nextLine());
    }

    private static boolean executeOptions(int option, Scanner console, IClientDAO clientDAO){
        var exit = false;
        switch (option){
            case 1 -> listAllClients(clientDAO);
            case 2 -> registerClient(console, clientDAO);
            case 3 -> updateClientInfo(console, clientDAO);
            case 4 -> deleteClient(console, clientDAO);
            case 5 -> {
                System.out.println("Thanks for visiting Fitness Zone, come back anytime!");
                exit = true;
            }
            default -> System.out.println("Invalid Option: " + option);
        }
        return exit;
    }

    private static void listAllClients(IClientDAO clientDAO){
        var clients = clientDAO.listClients();
        clients.forEach(System.out::println);
    }

    private static void registerClient(Scanner console, IClientDAO clientDAO){
        try{
            System.out.print("Provide a firstname: ");
            var firstname = console.nextLine();
            if (firstname.trim().isEmpty())
                throw new Exception("Provide a valid firstname");

            System.out.print("Provide a lastname: ");
            var lastname = console.nextLine();
            if (lastname.trim().isEmpty())
                throw new Exception("Provide a valid lastname");

            System.out.print("Provide a membership number: ");
            String membershipInput = console.nextLine();
            if (membershipInput.trim().isEmpty())
                throw new Exception("Membership number cannot be empty.");
            int membership;
            try {
                membership = Integer.parseInt(membershipInput);
            } catch (NumberFormatException e) {
                throw new Exception("Membership number must be a valid number.");
            }

            var newClient = new Client(firstname, lastname, membership);

            var isRegistered = clientDAO.addClient(newClient);

            if (isRegistered)
                System.out.println(newClient.getFirstname() + " was registered successfully!");
            else
                System.out.println(newClient.getFirstname() + " was not registered.");

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static void updateClientInfo(Scanner console, IClientDAO clientDAO){
        System.out.print("Provide client's id: ");
        var id = Integer.parseInt(console.nextLine());
        var clientById = new Client(id);
        var isClientInDb = clientDAO.getClientById(clientById);


        if(isClientInDb){
            System.out.println();
            var exit = false;
            while (!exit){
                try{
                    var option = UpdateUserHelper.showUpdateUserMenu(console);
                    exit = UpdateUserHelper.executeOptionsMenu(option, console, clientDAO, clientById);
                }
                catch (Exception e) {
                    System.out.println("An error has occurred: " + e.getMessage());
                }
                finally {
                    System.out.println(); // Print a new line after each operation
                }
            }
        }
        else{
            System.out.println("Client with id " + clientById.getId() + " not found."  );
        }
    }

    private static void deleteClient(Scanner console, IClientDAO clientDAO){
        try{
            System.out.print("To delete a client, provide client id: ");
            String idInput = console.nextLine();
            if (idInput.trim().isEmpty())
                throw new Exception("Id number cannot be empty.");
            int id;
            try {
                id = Integer.parseInt(idInput);
            } catch (NumberFormatException e) {
                throw new Exception("Id must be a valid number.");
            }

            var clientToDelete = new Client(id);

            var isClientDeleted = clientDAO.deleteClient(clientToDelete);

            if(isClientDeleted)
                System.out.println("Client was successfully deleted");
            else
                System.out.println("Client was not deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
