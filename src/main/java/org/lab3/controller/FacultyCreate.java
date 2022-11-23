package org.lab3.controller;

import org.lab3.models.university.Department;
import org.lab3.models.university.Faculty;
import org.lab3.models.university.Human;


import java.util.List;


public interface FacultyCreate {

    default Faculty create(List<Department> departments, Human boss, String facultyName) {
        Faculty faculty = new Faculty();
        faculty.setBoss(boss);
        faculty.setDepartments(departments);
        faculty.setName(facultyName);

        return faculty;

    }
}
