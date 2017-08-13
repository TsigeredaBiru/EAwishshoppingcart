package edu.mum.service;

import edu.mum.entity.User;
import edu.mum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    //create
    public void saveUser(User User) {
        userRepository.save(User);
    }

    //delete
    public void deleteUser(int userId) {
        userRepository.delete(userId);
    }

    //read
    public List<User> getAllUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public User getUser(int userId) {
        return userRepository.findOne(userId);
    }

    //update
    public void updateUser(int userId, User user) {
        userRepository.save(user);
    }
}
