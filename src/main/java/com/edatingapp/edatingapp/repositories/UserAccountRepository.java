package com.edatingapp.edatingapp.repositories;

import com.edatingapp.edatingapp.entities.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    @Query(value = "select * from users where age=:age and city=:city and country=:country and id!=:id", nativeQuery = true)
    List<UserAccount> findMatches(@Param("age") int age, @Param("city") String city, @Param("country") String country, @Param("id") Long id);

}
