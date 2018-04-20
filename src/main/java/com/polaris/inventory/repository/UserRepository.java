package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
