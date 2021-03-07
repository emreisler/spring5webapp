package com.example.demoubuntu.repositories;

import com.example.demoubuntu.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
