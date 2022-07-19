package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.User;

@Repository
public interface UserRepository extends DataTablesRepository<User, Long> {

	
	/*
	 * @Query(value="select u.* from User u where u.id=:id",nativeQuery = true)
	 * public User getByUserId(@Param("id") Long id);
	 */
	

	//User getById(User user);

	

	User findByEmail(String email);

	User findByEmailAndPassword(String email, String password);

	User getById(long id);
	
	List<User> findAll();
	
	List<User> findAllByActive(boolean active);
}
