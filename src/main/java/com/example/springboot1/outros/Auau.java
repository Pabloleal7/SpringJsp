package com.example.springboot1.outros;

import com.example.springboot1.outros.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class Auau {

    @GetMapping("/")
    public List<User> olaMundo() {
        List<User> ai = new ArrayList<>();
        User p = new User("pablo", "humano");
        User m = new User("Monica", "Humana");
        User c = new User("Cat","Cadela");
        User b = new User("Buiu", "Cadelo");

        ai.add(p);
        ai.add(m);
        ai.add(c);
        ai.add(b);


        return ai;

    }

}
