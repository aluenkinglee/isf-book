/**
 *
 */
package com.apress.isf.spring.annotated.service;

import com.apress.isf.model.Document;
import com.apress.isf.model.Type;
import com.apress.isf.service.SearchEngine;
import com.apress.isf.spring.data.DocumentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Felipe Gutierrez
 */
@Service("engine")
@Scope
public class AnnotatedSearchEngine implements SearchEngine {

    @Autowired
    private DocumentDAO documentDAO;

    public AnnotatedSearchEngine() {
    }

    public List<Document> findByType(Type documentType) {
        List<Document> result = new ArrayList<Document>();
        for (Document doc : listAll()) {
            if (doc.getType().getName().equals(documentType.getName()))
                result.add(doc);
        }
        return result;
    }

    public List<Document> listAll() {
        List<Document> result = Arrays.asList(documentDAO.getAll());
        return result;
    }

    public List<Document> findByLocation(String location) {
        throw new UnsupportedOperationException("findByLocation not yet implemented.");
    }
}
