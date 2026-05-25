package com.jairius.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //The repository is responsible for handling CRUD operations
public interface UserRepository extends JpaRepository<User, Long> {
}