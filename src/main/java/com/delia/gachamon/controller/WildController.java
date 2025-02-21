package com.delia.gachamon.controller;

import com.delia.gachamon.model.Pokemon;
import com.delia.gachamon.model.PokemonCaught;
import com.delia.gachamon.repository.CaughtRepository;
import com.delia.gachamon.repository.WildPokeRepository;
import jakarta.validation.Valid;
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
    private final CaughtRepository caughtRepository;
    private Random randomGenerator;

    public WildController(WildPokeRepository repository, CaughtRepository caughtRepository) {
        this.repository = repository;
        this.caughtRepository = caughtRepository;
        randomGenerator = new Random();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping("")
    public List<Pokemon> findAll(){
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
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/catch")
    public void create(@Valid @RequestBody PokemonCaught pokemon){
        caughtRepository.save(pokemon);
    }

}
