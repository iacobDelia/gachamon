package com.delia.gachamon.repository;

import com.delia.gachamon.model.Pokemon;
import org.springframework.data.repository.ListCrudRepository;

public interface WildPokeRepository extends ListCrudRepository<Pokemon, Integer> {
}
