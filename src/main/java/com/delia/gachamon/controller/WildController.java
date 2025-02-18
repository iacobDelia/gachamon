package com.delia.gachamon.controller;

import com.delia.gachamon.model.Pokemon;
import com.delia.gachamon.repository.WildPokeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/wild")
public class WildController {
    private final WildPokeRepository repository;
    private Random randomGenerator;

    public WildController(WildPokeRepository repository) {
        this.repository = repository;
        randomGenerator = new Random();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping("")
    public List<Pokemon> findAll(){
        System.out.println(repository.findAll());
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Pokemon findById(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This pokemon doesn't exist!"));
    }
    @GetMapping("/getPoke")
    public Optional<Pokemon> getRandomPoke(){
        int randomIndex = randomGenerator.nextInt((int)repository.count());
        return repository.findById(randomIndex);
    }

}
