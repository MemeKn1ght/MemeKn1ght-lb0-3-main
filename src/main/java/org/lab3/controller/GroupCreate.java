package org.lab3.controller;

import org.lab3.models.university.Group;
import org.lab3.models.university.Human;
import org.lab3.models.university.Student;

import java.util.List;


public interface GroupCreate {
    default Group create(List<Student> students, String name,Human boss){
        Group group = new Group();
        group.setBoss(boss);
        group.setName(name);
        group.setStudents(students);
        return group;
    }
}
