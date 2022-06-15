import database_control.ClientControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import static sun.misc.Version.print;

public class main {
    public static void main(String[] args) throws SQLException {
        ClientControl clientControl = new ClientControl();
        clientControl.getAllClients();
        clientControl.getClient(2);
        clientControl.addClient("sfgdhf","asg","afgh");
        clientControl.uppdateClient(1,"666");
        clientControl.getAllClients();
        clientControl.deleteClient("asg");
        clientControl.getAllClients();
    }
}
