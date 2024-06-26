package com.shoheb.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.shoheb.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
