package com.example.day14ce2.adhishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce2.adhishmodel.Book;


@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    
}
