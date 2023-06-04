package com.decisivemind.Backend_decisivemind.repositories;

import com.decisivemind.Backend_decisivemind.entities.Problem;
import com.decisivemind.Backend_decisivemind.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findByUser(User user);
    Optional<Problem> findByIdAndUser(Long id, User user);

}