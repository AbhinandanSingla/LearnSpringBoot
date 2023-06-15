package com.learnspringboot.learnspringboot.dao;

import com.learnspringboot.learnspringboot.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    // access the functationality we have to extend this repository with crud or jpa
    // in crudRepos we have put first model class then its primary key datatype
    public List<User> findByName(String city);

    public List<User> findByNameAndCity(String name, String city);

    //Custom Queries
    // JPQL
    @Query("select u from User u")
    public List<User> getAllUser();

    @Query(value = "select * from User", nativeQuery = true)
    public List<User> getAllNativeUser();
}
