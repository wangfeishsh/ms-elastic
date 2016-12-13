package com.bao.repository;

import com.bao.model.Book;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by asus on 2016/12/13.
 */
public interface BookRepository extends Repository<Book, String> {
    List<Book> findByNameAndPrice(String name, Integer price);
}
