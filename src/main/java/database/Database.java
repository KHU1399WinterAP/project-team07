package database;

import config.DatabaseConfig;
import models.User;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    private Connection connection;
    public Database () throws SQLException {
        connection = DriverManager.getConnection(DatabaseConfig.CONNECTION_URL, DatabaseConfig.USERNAME,DatabaseConfig.PASSWORD);
    }
    public ArrayList<User> selectAllUsers () {
        try {
            var users = new ArrayList<User>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user ");
                while(resultSet.next()){
                    User user = new User(resultSet.getString("username") , resultSet.getString("pass"));
                    users.add(user);
                }
                return users;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return  new ArrayList<>();

        }


    }
    public void insertIntoUser(User user){
            try{
                Statement statement= connection.createStatement();
                ResultSet resultset = statement.executeQuery("INSERT INTO user VALUES('"+user.username+"' , '"+user.password +"')");
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
    }
}

