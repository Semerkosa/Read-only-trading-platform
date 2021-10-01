package io.trivial.web.controllers;

import io.trivial.models.binding.UserRegisterBindingModel;
import io.trivial.models.binding.UserUpdateBindingModel;
import io.trivial.models.views.UserViewModel;
import io.trivial.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class UserController {

    private final ModelMapper modelMapper;
    private final UserService userService;

    @Autowired
    public UserController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @GetMapping(
            value = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserViewModel> register(UserRegisterBindingModel inUser) {
        //TODO
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(
            value = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserViewModel> getUserById(@PathVariable String id) {
        //TODO
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(
            value = "/{email}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserViewModel> getUserByEmail(@PathVariable String email) {
        //TODO
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(
            value = "/update",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserViewModel> updateUser(UserUpdateBindingModel inUser) {
        //TODO
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}