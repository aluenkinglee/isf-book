/**
 *
 */
package com.apress.isf.service;

import com.apress.isf.model.Document;
import com.apress.isf.model.Type;

import java.util.List;

/**
 * @author Felipe Gutierrez
 */
public interface SearchEngine {

    public List<Document> findByType(Type documentType);

    public List<Document> listAll();

    public List<Document> findByLocation(String location);
}
