package com.example.project.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.project.model.User;
import com.example.project.repository.UserRepository;
import com.example.project.service.UserService;
import com.example.project.util.DaoFactory;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DaoFactory daoFactory;
	

	
	public void UserSignUp(User user) 
		{

		//Storing User Data
			userRepository.save(user);

		}
	
	public void userUpdate(User user)
	
	{
		
		userRepository.save(user);
	}
	
	public User isValidUser(User user)
	{
		User userFromDatabase=userRepository.findByEmail(user.getEmail());
		if(userFromDatabase == null) {
			
			return null;
			
		}
		
		if(userFromDatabase.getPassword().equals(user.getPassword()))
		{
			return userFromDatabase;
		}
		else
		{
			return null;
		}
	}

	@Override
	public DataTablesOutput<User> findAll(@Valid DataTablesInput dataTablesInput) {
		return ((DataTablesOutput<User>) daoFactory.userRepository.findAll(dataTablesInput));
	}

	@Override
	public DataTablesOutput<User> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {
		return daoFactory.userRepository.findAll(dataTablesInput, new Specification<User>() {
			private static final long serialVersionUID = 1L;

			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				
			
			    Predicate active = criteriaBuilder.equal(root.get("active"),Boolean.TRUE);
				return  criteriaBuilder.and(active);
			}
		});
	}

	@Override
	public User findById(Long id) {
Optional<User> userDetails=daoFactory.getUserRepository().findById(id);
		
		if(userDetails.isPresent()) {
			return userDetails.get();
		}
		return null;
	}

	@Override
	public void saveUser(User us) {
		daoFactory.userRepository.save(us);
		
	}
	
	public int totalUser() {
		
		return daoFactory.userRepository.findAll().size();
		
	}

	@Override
	public int totalConnectedUser() {
		return daoFactory.userRepository.findAllByActive(true).size();
	}

	@Override
	public List<User> getAllUser() {
		return daoFactory.userRepository.findAll();
	}
	
	
}















