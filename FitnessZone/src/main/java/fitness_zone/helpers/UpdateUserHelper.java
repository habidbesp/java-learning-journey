package fitness_zone.helpers;

import fitness_zone.data.IClientDAO;
import fitness_zone.domain.Client;

import java.util.Scanner;

public class UpdateUserHelper {
    public static int showUpdateUserMenu(Scanner console){
        System.out.print("""
                Update Client Menu:
                1. Update firstname
                2. Update lastname
                3. Update membership number
                4. Back to menu
                Choose an option:\s""");
        return Integer.parseInt(console.nextLine());
    }

    public static boolean executeOptionsMenu(
            int option,
            Scanner console,
            IClientDAO clientDAO,
            Client clientById
    ){
        var exit = false;

        switch (option){
            case 1 -> updateFirstname(console, clientDAO, clientById);
            case 2 -> updateLastname(console, clientDAO, clientById);
            case 3 -> updateMembership(console, clientDAO, clientById);
            case 4 -> exit = true;
            default -> System.out.println("Invalid Option: " + option);
        }
        return exit;
    }

    public static void updateFirstname(Scanner console,
                                       IClientDAO clientDAO, Client clientById){
        try{
            System.out.print("Provide a new firstname: ");
            var newFirstname = console.nextLine();
            if (newFirstname.trim().isEmpty())
                throw new Exception("Provide a valid new firstname");

            var clientToUpdate = new Client(clientById.getId(), newFirstname,
                    clientById.getLastname(), clientById.getMembership());
            var isClientUpdated = clientDAO.modifyClient(clientToUpdate);

            if(isClientUpdated)
                System.out.println("Firstname: " + clientToUpdate.getFirstname() + ", successfully updated!");
            else
                System.out.println("Firstname was not updated");

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static void updateLastname(Scanner console,
                                       IClientDAO clientDAO, Client clientById){
        try{
            System.out.print("Provide a new lastname: ");
            var newLastname = console.nextLine();
            if (newLastname.trim().isEmpty())
                throw new Exception("Provide a valid new lastname");

            var clientToUpdate = new Client(clientById.getId(), clientById.getFirstname(),
                    newLastname, clientById.getMembership());
            var isClientUpdated = clientDAO.modifyClient(clientToUpdate);

            if(isClientUpdated)
                System.out.println("Lastname: " + clientToUpdate.getLastname() + ", successfully updated!");
            else
                System.out.println("Lastname was not updated");

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void updateMembership(Scanner console,
                                        IClientDAO clientDAO, Client clientById){
        try {
            System.out.print("Provide a new membership number: ");
            String membershipInput = console.nextLine();

            if (membershipInput.trim().isEmpty())
                throw new Exception("Membership number cannot be empty.");
            int membership;
            try {
                membership = Integer.parseInt(membershipInput);
            } catch (NumberFormatException e) {
                throw new Exception("Membership number must be a valid number.");
            }

            var clientToUpdate = new Client(clientById.getId(), clientById.getFirstname(),
                    clientById.getLastname(), membership);
            var isClientUpdated = clientDAO.modifyClient(clientToUpdate);

            if(isClientUpdated)
                System.out.println("Membership number:" + clientToUpdate.getMembership() + ", successfully updated!");
            else
                System.out.println("Membership number was not updated");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
