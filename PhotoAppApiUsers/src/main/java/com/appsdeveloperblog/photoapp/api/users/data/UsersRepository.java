package com.appsdeveloperblog.photoapp.api.users.data;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity, Integer> {
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
}
