package org.lab3.controller;

import org.lab3.models.university.Department;
import org.lab3.models.university.Group;
import org.lab3.models.university.Human;

import java.util.List;

public interface DepartmentCreate {
    default Department createDepartment(List<Group> groups,Human boss, String name){
        Department department = new Department();
        department.setBoss(boss);
        department.setName(name);
        department.setGroupList(groups);
        return department;
    }
}
