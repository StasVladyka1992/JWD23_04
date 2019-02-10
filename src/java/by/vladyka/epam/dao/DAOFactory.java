package by.vladyka.epam.dao;

import by.vladyka.epam.dao.impl.DBUserDAO;

public class DAOFactory {
    private static final DAOFactory factory = new DAOFactory();

    private DAOFactory() {
    }

    public DAOFactory getInstance(){
        return factory;
    }

    public UserDAO getUserDAO(){
        return new DBUserDAO();
    }

}
