package com.codebakers.system.daoInterface;

import com.codebakers.system.model.User;

public interface UserRepositoryCustom {

	int enableUserById(int id);
	
	int disableuserbyId(int id);
}
