package guru.tour.service;

import java.util.List;


import guru.tour.entity.UserEntity;

public interface UserEntityManager {
	List<UserEntity> getUserByName(String name);
	List<UserEntity> getUserByPhone(String phone);
	UserEntity saveUser(UserEntity user);
	List<UserEntity> getAll();
	List<UserEntity> getAllViaDiaDiem(String diadiem);
	boolean isUserExist(UserEntity userEntity);
	void updateByUsername(UserEntity user);
	UserEntity getUserById(int id);
	void updatePasswordByUsername(UserEntity user);
	void updateComment(String username, String comment);
}