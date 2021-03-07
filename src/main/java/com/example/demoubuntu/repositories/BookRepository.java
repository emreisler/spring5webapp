package com.example.demoubuntu.repositories;

import com.example.demoubuntu.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
