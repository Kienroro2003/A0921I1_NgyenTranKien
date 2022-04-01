package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    List<User> selectAllUser();
    List<User> search(String country) throws SQLException;
    List<User> sort() throws SQLException;
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;
    void insertUser(User user);
    User selectUser(int id);

}
