package com.bookshopping.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookshopping.model.User;
import com.bookshopping.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;
	@Transactional
	public User save(@NotNull @Valid final User user) {
		return userrepository.save(user);
	}

	@GetMapping
	public List<User> findAll() {
		
		return userrepository.findAll();
	}
	@Transactional
    public User login(String name,String password) {
        return userrepository.loginUser(name,password);
    }
	


}
