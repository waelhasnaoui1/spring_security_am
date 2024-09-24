package com.teachCode.springSecurity.repository;

import com.teachCode.springSecurity.entities.RefreshToken;
import com.teachCode.springSecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {

    Optional<RefreshToken> findByUser(User user);
    Optional<RefreshToken> findByToken(String token);

    void deleteByUser(User user);

}
