package com.delia.gachamon.repository;

import com.delia.gachamon.model.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


public interface WildPokeRepository extends ListCrudRepository<Pokemon, Integer> {
}
