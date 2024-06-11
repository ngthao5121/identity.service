package com.nthao.identify.demo.controller;

import com.nthao.identify.demo.dto.request.APIResponse;
import com.nthao.identify.demo.dto.request.UserCreationRequest;
import com.nthao.identify.demo.dto.request.UserUpdateRequest;
import com.nthao.identify.demo.entity.User;
import com.nthao.identify.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    APIResponse<User> createUser(@RequestBody @Valid UserCreationRequest request) {
        APIResponse<User> apiResponse = new APIResponse<>();
        apiResponse.setResult(userService.createRequest(request));


        return apiResponse;
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping ("/{userId}")
    User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @PutMapping ("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest userUpdateRequest) {
        return userService.updateUser(userId, userUpdateRequest);
    }
    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been Deleted";
    }

}
