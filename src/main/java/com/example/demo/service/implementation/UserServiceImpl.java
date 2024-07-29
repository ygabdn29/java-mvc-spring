package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService{
  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> get() {
    return userRepository.findAll();
  }

  @Override
  public User get(Integer id) {
    return userRepository.findById(id).orElse(null);
  }

  @Override
  public Boolean save(User entity) {
    userRepository.save(entity);
    return userRepository.findById(entity.getId()).isPresent();
  }

  @Override
  public Boolean delete(Integer id) {
    userRepository.deleteById(id);
    return userRepository.findById(id).isEmpty();
  }
  
}