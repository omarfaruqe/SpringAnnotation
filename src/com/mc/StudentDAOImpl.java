/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Mihai Manole <mihai.manole77@gmail.com>
 */
@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO{

    @Override
    public Student createNewStudent() {
        Student s = new Student();
        s.setName("Mihai");
        s.setAge(38);
        return s;
    }
    
}
