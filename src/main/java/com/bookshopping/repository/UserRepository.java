package com.bookshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookshopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	 @Query(value="select * from user where name=?1 and password=?2",nativeQuery=true)

	User loginUser(String name, String password);

}
