package com.MainApp.Repo;

import org.springframework.data.repository.CrudRepository;


import com.MainApp.Pojo.User;


public interface UserRepo extends CrudRepository<User, String>{

	User findByUserNameAndPassword(String u, String p);
}
