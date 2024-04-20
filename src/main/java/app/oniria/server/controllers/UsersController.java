package app.oniria.server.controllers;

import app.oniria.server.domain.records.User;
import app.oniria.server.repositories.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private  final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping()
    public List<User> list(){
        return usersRepository.list();
    }
}
