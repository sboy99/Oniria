package app.oniria.server.repositories;

import app.oniria.server.domain.enums.Role;
import app.oniria.server.domain.records.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UsersRepository {
    private  final List<User> userList= new ArrayList<User>();

    public  void create(User user){
        userList.add(user);
    }
    public  List<User> list(){
        return userList;
    }

    public Optional<User> findById(String id){
        return userList.stream().filter(user -> user.id().equals(id)).findFirst();
    }

    @PostConstruct
    public void construct(){
        User user1 = new User(
                "1",
                "John Doe",
                "john-doe",
                 new Role[]{Role.USER},
                null,
                null
        );
        User user2 = new User(
                "2",
                "Jane Doe",
                "jane-doe",
                new Role[]{Role.ADMIN,Role.USER},
                null,
                null
        );
        User user3 = new User(
                "3",
                "Admin",
                "admin",
                new Role[]{Role.ADMIN},
                null,
                null
        );

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }
}
