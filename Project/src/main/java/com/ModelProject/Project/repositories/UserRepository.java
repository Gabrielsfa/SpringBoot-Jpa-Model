package com.ModelProject.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ModelProject.Project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
