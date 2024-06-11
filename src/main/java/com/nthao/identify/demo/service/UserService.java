package com.nthao.identify.demo.service;

import com.nthao.identify.demo.dto.request.UserCreationRequest;
import com.nthao.identify.demo.dto.request.UserUpdateRequest;
import com.nthao.identify.demo.entity.User;
import com.nthao.identify.demo.exception.AppException;
import com.nthao.identify.demo.exception.ErrorCode;
import com.nthao.identify.demo.mapper.UserMapper;
import com.nthao.identify.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    public User createRequest(UserCreationRequest object) {


        if(userRepository.existsByUsername(object.getUsername()))
//            throw new RuntimeException("NAN NN!!!");
            throw new AppException(ErrorCode.USER_EXISTED);

        User user  = userMapper.toUser(object);

        userRepository.save(user);
        return user;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser( String id, UserUpdateRequest request){
        User user = getUser(id);
        user.setPassword(request.getPassword());
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setDod(request.getDod());

        userRepository.save(user);
        return user;
    }

    public void deleteUser(String uid){
        userRepository.deleteById(uid);
    }
}
