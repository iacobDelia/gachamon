package com.delia.gachamon.controller;

import com.delia.gachamon.model.PokemonCaught;
import com.delia.gachamon.repository.CaughtRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/box")
@RestController
public class BoxController {
    private final CaughtRepository caughtRepository;

    public BoxController(CaughtRepository caughtRepository) {
        this.caughtRepository = caughtRepository;
    }
    @GetMapping("/all")
    public List<PokemonCaught> findAll(){
        return caughtRepository.findAll();
    }
}
