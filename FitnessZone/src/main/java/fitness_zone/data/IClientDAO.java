package fitness_zone.data;

import fitness_zone.domain.Client;

import java.util.List;

public interface IClientDAO {
    List<Client> listClients();
    boolean getClientById(Client client);
    boolean addClient(Client client);
    boolean modifyClient(Client client);
    boolean deleteClient(Client client);
}
