package dao;
import models.*;
import org.*;
import org.sql2o.Sql2o;

import  java.util.List;
public class sql2oUserDao implements UserDao {
    private final Sql2o sql2o;
    public sql2oUserDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public List<User> getAllUsersByDepartment(int departmentId) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
