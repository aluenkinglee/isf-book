/**
 *
 */
package com.apress.isf.spring.data;

import com.apress.isf.model.Document;

/**
 * @author Felipe Gutierrez
 */
public interface DocumentDAO {
    public Document[] getAll();
}
