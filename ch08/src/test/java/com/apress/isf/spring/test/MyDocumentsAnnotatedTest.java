/**
 *
 */
package com.apress.isf.spring.test;

import com.apress.isf.model.Document;
import com.apress.isf.model.Type;
import com.apress.isf.service.SearchEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Felipe Gutierrez
 *         gradle -Dtest.single=MyDocumentsAnnotatedTest test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/mydocuments-annotations-context.xml")
public class MyDocumentsAnnotatedTest {

    @Autowired
    private ApplicationContext context;
    private SearchEngine engine;
    private Type webType;

    @Test
    public void testWithAnnotationsAll() {
        engine = context.getBean(SearchEngine.class);
        webType = context.getBean(Type.class);

        List<Document> documents = engine.findByType(webType);
        assertNotNull(documents);
        assertTrue(documents.size() == 1);
        assertEquals(webType.getName(), documents.get(0).getType().getName());
        assertEquals(webType.getDesc(), documents.get(0).getType().getDesc());
        assertEquals(webType.getExtension(), documents.get(0).getType().getExtension());

        engine = context.getBean(SearchEngine.class);

        documents = engine.listAll();
        assertNotNull(documents);
        assertTrue(documents.size() == 4);
    }
}
