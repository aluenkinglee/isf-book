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
public interface DocumentService {
    public void createNewType(Type type);

    public void updateType(Type type);

    public void removeTypeById(String id);

    public List<Type> getAllDefinedTypes();

    public Type getTypeById(String id);

    public void createNewDocument(Document document);

    public void removeDocumentById(String id);

    public void updateDocument(Document document);

    public void updateLocationFromDocumentId(String documentId, String location);
}
