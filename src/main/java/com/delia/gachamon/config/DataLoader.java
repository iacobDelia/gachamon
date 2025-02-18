package com.delia.gachamon.config;

import com.delia.gachamon.model.Pokemon;
import com.delia.gachamon.repository.WildPokeRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final WildPokeRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(WildPokeRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if(repository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/Pokemon.json")) {

                repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Pokemon>>(){}));
            }
        }
    }
}
