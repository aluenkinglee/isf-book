package com.apress.isf.spring.data;

import com.apress.isf.model.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepository implements DocumentDAO {
    private static final Logger log = LoggerFactory.getLogger(DocumentRepository.class);
    private List<Document> documents = null;

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    private void setDoc(Document doc) {
        if (documents == null) {
            documents = new ArrayList<Document>();
        }
        this.documents.add(doc);
    }

    public void setDoc1(Document doc) {
        setDoc(doc);
    }

    public void setDoc2(Document doc) {
        setDoc(doc);
    }

    public void setDoc3(Document doc) {
        setDoc(doc);
    }

    public void setDoc4(Document doc) {
        setDoc(doc);
    }

    public Document[] getAll() {
        if (log.isDebugEnabled())
            log.debug("Start <getAll> Params: ");
        Document[] result = documents.toArray(new Document[documents.size()]);

        if (log.isDebugEnabled())
            log.debug("End <getAll> Result:" + result);
        return result;
    }

}
