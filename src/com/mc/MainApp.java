/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
//      ApplicationContext context = new ClassPathXmlApplicationContext("Beans_Requried_Auto_Qualifier.xml");
//
//      Profile profile = (Profile) context.getBean("profile");
//      profile.printName();
//      profile.printAge() ;
////      
      //Test PostContructor and PreDestroy Annotations
      
      System.out.println("Testing PostContructor and PreDestroy Annotations");
      
      AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("Beans_PostCons_PreDestroy.xml");
      Student_PC_PD student = (Student_PC_PD) context2.getBean("student2");

      System.out.println("student Name : " + student.getName() );
      System.out.println("student Age : " + student.getAge() );
      
      context2.registerShutdownHook();

    }
    
}
