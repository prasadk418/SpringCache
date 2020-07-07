package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
