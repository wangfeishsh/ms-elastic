package com.bao;

import com.bao.model.Book;
import com.bao.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by baochunyu on 2016/12/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MsElasticApplicationTests {

    @Autowired
    BookRepository repository;

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void bookTest() {
        Book book = new Book();
        book.setId("2");
        book.setName("es");
        book.setPrice(10);
        repository.save(book);

        Iterable<Book> it = repository.findAll();
        it.forEach(node-> System.out.println(node.getName()));

    }

}
