package com.edatingapp.edatingapp.repositories;

import com.edatingapp.edatingapp.entities.UserInterest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterestRepository extends JpaRepository<UserInterest, Long> {
}
