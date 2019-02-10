package by.vladyka.epam.dao.impl;

import by.vladyka.epam.dao.UserDAO;
import java.sql.*;


public class DBUserDAO implements UserDAO {
    @Override
    public void getUser(String login, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load class.");
            e.printStackTrace();
        }


    }

}

