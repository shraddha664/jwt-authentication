package com.saru.jwtdemo.repository;

import com.saru.jwtdemo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {


    Optional<UserInfo> findByName(String username);
}
