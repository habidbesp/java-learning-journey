package fitness_zone.data;
import fitness_zone.domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static fitness_zone.connection.Connect.getConnection;

public class ClientDAO implements  IClientDAO{

    @Override
    public List<Client> listClients() {
        List<Client> clients = new ArrayList<>();
        // prepare statement
        PreparedStatement ps;
        // result set
        ResultSet rs;
        var sql = "SELECT * FROM client ORDER BY id";
        try(Connection connection = getConnection()) {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var client = new Client();
                client.setId(rs.getInt("id"));
                client.setFirstname(rs.getString("firstname"));
                client.setLastname(rs.getString("lastname"));
                client.setMembership(rs.getInt("membership"));
                clients.add(client);
            }
        } catch (Exception e) {
            System.out.println("Error while listing clients from db: " + e.getMessage());
        }
        return clients;
    }

    @Override
    public boolean getClientById(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        var sql = "SELECT * FROM client WHERE id = ?";
        try (Connection connection = getConnection()) {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            rs = ps.executeQuery();
            if(rs.next()){
                client.setFirstname(rs.getString("firstname"));
                client.setLastname(rs.getString("lastname"));
                client.setMembership(rs.getInt(("membership")));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error while getting a client by id: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean addClient(Client client) {
        PreparedStatement ps;
        String sql= "INSERT INTO client(firstname, lastname, membership)" +
                " VALUES(?, ?, ?)";

        try(Connection connection = getConnection()){
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getFirstname());
            ps.setString(2, client.getLastname());
            ps.setInt(3, client.getMembership());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error while adding client: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean modifyClient(Client client) {
        PreparedStatement ps;
        var sql = "UPDATE client SET firstname=?, lastname=?, membership=?" +
                " WHERE id = ?" ;

        try(Connection connection = getConnection()){
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getFirstname());
            ps.setString(2, client.getLastname());
            ps.setInt(3, client.getMembership());
            ps.setInt(4, client.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error while modifying client: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        PreparedStatement ps;
        var sql = "DELETE FROM client WHERE id = ?";
        try(Connection connection = getConnection()){
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error while deleting the client " + e.getMessage());
        }
        return false;
    }
}
