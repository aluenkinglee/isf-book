/**
 *
 */
package com.apress.isf.service;

/**
 * @author Felipe Gutierrez
 */
public interface Login {
    public boolean isAuthorized(String email, String pass);
}
