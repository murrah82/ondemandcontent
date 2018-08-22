package com.murrah.ondemandcontent;

import com.murrah.com.murrah.engine.htmlengine;
import com.murrah.model.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
public class htmlengineTest {

    @Test
    public void generateHTML() {

        Map<String, Object> model;
        List<Book> books;
/*
books = new ArrayList<Book>();
books.add(new Book("The Hitchhiker's Guide to the Galaxy", 5.70));
books.add(new Book("Life, the Universe and Everything", 5.60));
books.add(new Book("The Restaurant at the End of the Universe", 5.40));

model = new HashMap<String, Object>();
model.put("books", books);
model.put("pageName", "My Bookshelf");
*/

        htmlengine objhtmlengine = new htmlengine();
//        Assert.assertNotNull(objhtmlengine.generateHTML(model));
        int i = 10000;
        while (i>1){
            books = new ArrayList<>();
            books.add(new Book("The Hitchhiker's Guide to the Galaxy:"+(i-1), 5.70+i, i % 2 == 0));
            books.add(new Book("Life, the Universe and Everything:"+(i-1), 5.60+i, i % 2 == 0));
            books.add(new Book("The Restaurant at the End of the Universe:"+(i-1), 5.40+i, i % 2 == 0));

            model = new HashMap<>();
            model.put("books", books);
            model.put("pageName", "My Bookshelf");

            Assert.assertNotNull(objhtmlengine.generateHTML(model));
            i--;
        }


    }

}
