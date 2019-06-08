package com.example.demo.controller;

import com.example.demo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/***
 * https://thepracticaldeveloper.com/2017/07/31/guide-spring-boot-controller-tests/
 * What is Expected: of this Test
 *
 * 1) Test the controller is returning 200 or expected HttpStatus
 * 2) Based on the controller endpoint is the service/repository methods called as expected
 * 3)
 */
@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = {BookController.class,BookService.class})
@SpringBootTest
public class BookControllerTest {



    private MockMvc mockMvc;

    @Autowired
    private BookService mockBookService;



    /**
     * Returns list of Books
     */
    @Test
    public void getAllBooks_UnitTest() throws Exception {

    }

    /**
     * Returns Book
     */
    @Test
    public void addBook_UnitTest() {
        throw new UnsupportedOperationException("Code not implemented");
    }

}
