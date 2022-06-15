package database_control;

import database.Client;

import java.sql.*;

public class ClientControl {
    public void getAllClients() throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pomanem", "root", "1111")){
            Statement st = connection.createStatement();
            String query = "SELECT * FROM client";
            ResultSet resultSet= st.executeQuery(query);
            System.out.println("ID\tname\tlogin\tpassword");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("IDclient")+"\t"
                        +resultSet.getString("name")+"\t\t"
                        +resultSet.getString("login")+"\t\t"
                        +resultSet.getString("password"));
            }
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void getClient(int id) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pomanem", "root", "1111")){
            Statement st = connection.createStatement();
            String query = "SELECT * FROM client";
            ResultSet resultSet= st.executeQuery(query);
            System.out.println("ID\tname\tlogin");
            while(resultSet.next()){
                if (resultSet.getInt("IDclient") == id)
                    System.out.println(resultSet.getInt("IDclient")+"\t"+resultSet.getString("name")+"\t\t"+resultSet.getString("login"));
            }
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addClient(String l, String n, String p) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pomanem", "root", "1111")){
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO client(name, login, password) VALUES ('"+ n + "', '"+ l +"', '" + p+ "');");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void uppdateClient(int id, String p) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pomanem", "root", "1111")){
            Statement statement = connection.createStatement();
            String updSql = "update client set password='" +p+ "' WHERE IDclient = '" + id + "';";
            statement.executeUpdate(updSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteClient(String n) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pomanem", "root", "1111")){
            Statement statement = connection.createStatement();
            String updSql = "delete from client WHERE name = '" + n + "';";
            statement.executeUpdate(updSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
