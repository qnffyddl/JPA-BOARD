package com.blucean.solution.repositories;

import com.blucean.solution.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = { "boards" })
    List<User> findAll();
    User findByUsername(String username);

    @Query("select u from User u where u.username like %?1%")//첫번째 파라미터라는 의미 ?1
    List<User> findByUsernameQuery(String username);

    @Query(value = "select * from User u where u.username like %?1%", nativeQuery = true)//원하는 순수Sql 문장 입력가능
    List<User> findByUsernameNativeQuery(String username);
}
