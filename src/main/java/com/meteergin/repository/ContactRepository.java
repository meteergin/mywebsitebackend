/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meteergin.repository;

import com.meteergin.entity.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mete Ergin <mete.ergin@outlook.com>
 */

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
