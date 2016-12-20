package com.bao.repository;

import com.bao.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by asus on 2016/12/13.
 */
public interface BookRepository extends ElasticsearchRepository<Book, String> {
    List<Book> findByNameAndPrice(String name, int price);
}
