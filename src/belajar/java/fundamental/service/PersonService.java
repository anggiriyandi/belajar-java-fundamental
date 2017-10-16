/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental.service;

import belajar.java.fundamental.Person;
import belajar.java.fundamental.dao.PersonDao;
import belajar.java.fundamental.dao.impl.PersonDaoImpl;

/**
 *
 * @author anggi
 */
public class PersonService {
    
    public void simpanDataPerson(Person person){
        //disini logic nya
        
        PersonDao personDao = new PersonDaoImpl();
       
    }
}
