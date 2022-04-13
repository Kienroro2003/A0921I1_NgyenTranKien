package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    List<User> selectAllUser();

    List<User> search(String country) throws SQLException;

    List<User> sort() throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    void insertUser(User user);

    User selectUser(int id);

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permisions);

    void insertUpdateWithoutTransaction();

    void insertUpdateUseTransaction();

    List<User> procedureSelectAll();

    boolean updateUserProcedure(User user);

    boolean deleterUserProcedure(int id) throws SQLException;

}
