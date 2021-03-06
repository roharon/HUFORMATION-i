package com.roharon.huformationi.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByUserKey(String userKey);
}
