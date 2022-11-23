package org.lab3.controller;

import org.lab3.models.university.Human;
import org.lab3.models.university.Student;



public interface StudentCreate {

    default Student create(Human person){
        Student newStudent = new Student();
        newStudent.setName(person.getName());
        newStudent.setLastName(person.getLastName());
        newStudent.setGender(person.getGender());

        return newStudent;
    }



}
