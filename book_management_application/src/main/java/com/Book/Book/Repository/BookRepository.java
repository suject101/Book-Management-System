package com.Book.Book.Repository;

import com.Book.Book.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer> {
}
