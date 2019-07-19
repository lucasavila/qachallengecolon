package com.colonbackend.colon.controllers;

import com.colonbackend.colon.model.User;
import com.colonbackend.colon.model.UserDTO;
import com.colonbackend.colon.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PingControllers {

    @GetMapping("ping")
    public ResponseEntity<String> get200Eze(){
        return new ResponseEntity("pong",HttpStatus.OK);
    }

}


