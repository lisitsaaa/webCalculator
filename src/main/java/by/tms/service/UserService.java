package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.JDBCUserStorage;

import java.util.Optional;

public class UserService {
    private static UserService userService;
    private final JDBCUserStorage storage = new JDBCUserStorage();

    private UserService(){}

    public static UserService getInstance(){
        if(userService == null){
            userService = new UserService();
        }
        return userService;
    }

    public void create(User user) {
        Thread thread = new Thread(() -> {
            storage.save(user);
        });
        thread.start();
    }

    public void changeNameByUSerName(String username, String name){
        Thread thread = new Thread(() -> {
            storage.changeNameByUserName(username,name);
        });
        thread.start();
    }

    public Optional<User> findByUsername(String username) {
        return storage.findByUserName(username);
    }
}
