package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Vasya", "Petrov", (byte) 21);
        userService.saveUser("Ivan", "Sidorob", (byte) 40);
        userService.saveUser("Dmitriy", "Sinichkin", (byte) 11);
        userService.saveUser("Petr", "Lebedev", (byte) 0);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.closeConnection();
    }
}


