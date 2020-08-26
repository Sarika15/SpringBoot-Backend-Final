package com.example.SpringBootBackendFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringBootBackendFinal.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
