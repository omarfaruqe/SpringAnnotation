/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mihai Manole <mihai.manole77@gmail.com>
 */
@Service("studentManager")
public class StudentManagerImpl implements StudentManager{
    @Autowired
    StudentDAO dao;

    @Override
    public Student createNewStudent() {
        return dao.createNewStudent();
    }
    
}
