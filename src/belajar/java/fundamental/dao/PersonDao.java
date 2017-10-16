/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental.dao;

import belajar.java.fundamental.Person;

/**
 *
 * @author anggi
 */
public interface PersonDao {
    public void simpanPeserson(Person person);
    public Person getPersonByName(String name);
    public void updatePerson(String id, Person person);    
}
