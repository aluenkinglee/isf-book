/**
 *
 */
package com.apress.isf.spring.service;

import com.apress.isf.model.Document;
import com.apress.isf.model.Type;
import com.apress.isf.service.SearchEngine;
import com.apress.isf.spring.data.DocumentDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Felipe Gutierrez
 */
public class SearchEngineService implements SearchEngine {
    private DocumentDAO documentDAO;


    public SearchEngineService() {
    }

    public DocumentDAO getDocumentDAO() {
        return documentDAO;
    }

    public void setDocumentDAO(DocumentDAO documentDAO) {
        this.documentDAO = documentDAO;
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
