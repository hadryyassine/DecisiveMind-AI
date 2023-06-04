package com.decisivemind.Backend_decisivemind.services;


import com.decisivemind.Backend_decisivemind.entities.Problem;
import com.decisivemind.Backend_decisivemind.entities.Solution;
import com.decisivemind.Backend_decisivemind.exception.ResourceNotFoundException;
import com.decisivemind.Backend_decisivemind.repositories.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolutionService {

    @Autowired
    private SolutionRepository solutionRepository;

    public Solution createSolution(Solution solution, Problem problem) {
        // Link the solution with the problem
        solution.setProblem(problem);
        return solutionRepository.save(solution);
    }

    public List<Solution> findSolutionsByProblem(Problem problem) {
        return solutionRepository.findByProblem(problem);
    }


    public Solution updateSolution(Long id, Solution newSolutionData) {
        Solution existingSolution = solutionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Solution", "id", id));

        existingSolution.setSolution(newSolutionData.getSolution());
        existingSolution.setSuccessPercentage(newSolutionData.getSuccessPercentage());
        // Update other fields as necessary

        return solutionRepository.save(existingSolution);
    }

    public void deleteSolution(Long id) {
        Solution existingSolution = solutionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Solution", "id", id));

        solutionRepository.delete(existingSolution);
    }
}
