package com.decisivemind.Backend_decisivemind.repositories;

import com.decisivemind.Backend_decisivemind.entities.Problem;
import com.decisivemind.Backend_decisivemind.entities.Solution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
    List<Solution> findByProblem(Problem problem);
    Optional<Solution> findByIdAndProblem(Long id, Problem problem);

}

