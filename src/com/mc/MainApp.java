/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author faruqe
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//      Student student = (Student) context.getBean("student2");
//
//      System.out.println("Name : " + student.getName() );
//      System.out.println("Age : " + student.getAge() );
      
       Profile profile = (Profile) context.getBean("profile");
       profile.printName();
       profile.printAge() ;
       
       
       
   
    }
    
}
