package com.codebakers.system.daoImplementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.codebakers.system.daoInterface.UserRepositoryCustom;
import com.codebakers.system.model.User;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepositoryCustom{

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public  int enableUserById(int id) {
		   Query query = entityManager.createNativeQuery("UPDATE users SET is_disabled = 0 WHERE id = ?", User.class);
	        query.setParameter(1, id );
	        
		return query.executeUpdate();
	}

	@Override
	public int disableuserbyId(int id) {
		Query query = entityManager.createNativeQuery("UPDATE users SET is_disabled = 1 WHERE id = ?", User.class);
        query.setParameter(1, id );
        
	return query.executeUpdate();
		
	}

}
