/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Mihai Manole <mihai.manole77@gmail.com>
 */
@Controller("studentController")
public class StudentController {
    @Autowired
    StudentManager manager;
    public Student createNewStudent() {
        return manager.createNewStudent();
    }
}
