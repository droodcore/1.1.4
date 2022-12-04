package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl uSI = UserServiceImpl.getInstance();

        uSI.saveUser("Korben", "Dallas", (byte) 29);
        uSI.saveUser("Chuck", "Norris", (byte) 63);
        uSI.saveUser("Steven", "Seagal", (byte) 59);
        uSI.saveUser("Kolya", "Ohotkin", (byte) 32);

        List<User> userList = uSI.getAllUsers();
        userList.forEach(System.out::println);

        uSI.cleanUsersTable();
        uSI.dropUsersTable();
    }
}
