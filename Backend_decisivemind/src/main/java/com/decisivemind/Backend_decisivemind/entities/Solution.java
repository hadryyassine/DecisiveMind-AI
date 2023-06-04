package com.decisivemind.Backend_decisivemind.entities;

import javax.persistence.*;

@Entity
@Table(name = "solutions")
public class Solution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="problem_id", nullable = false)
    private Problem problem;

    @Column(nullable = false)
    private String prompt;

    @Column(nullable = false)
    private String solution;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String successpercentage;


    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuccessPercentage() {
        return successpercentage;
    }

    public void setSuccessPercentage(String successpercentage) {
        this.successpercentage = successpercentage;
    }

    // constructor

    public Solution() {

    }
    public Solution(Long id, Problem problem, String prompt, String solution) {
        this.id = id;
        this.problem = problem;
        this.prompt = prompt;
        this.solution = solution;
    }
}
