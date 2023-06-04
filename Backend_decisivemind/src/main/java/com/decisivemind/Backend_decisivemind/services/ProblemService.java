package com.decisivemind.Backend_decisivemind.services;


import com.decisivemind.Backend_decisivemind.entities.Problem;
import com.decisivemind.Backend_decisivemind.entities.User;
import com.decisivemind.Backend_decisivemind.exception.ResourceNotFoundException;
import com.decisivemind.Backend_decisivemind.repositories.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    public Problem createProblem(Problem problem, User user) {
        // Link the problem with the user
        problem.setUser(user);
        return problemRepository.save(problem);
    }

    public List<Problem> findProblemsByUser(User user) {
        return problemRepository.findByUser(user);
    }

    // Additional methods related to Problem (e.g., updateProblem, deleteProblem) can be added here

    public Problem updateProblem(Long id, Problem newProblemData) {
        Problem existingProblem = problemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Problem", "id", id));

        existingProblem.setDescription(newProblemData.getDescription());
        existingProblem.setDomain(newProblemData.getDomain());
        // Update other fields as necessary

        return problemRepository.save(existingProblem);
    }

    public void deleteProblem(Long id) {
        Problem existingProblem = problemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Problem", "id", id));

        problemRepository.delete(existingProblem);
    }
}
