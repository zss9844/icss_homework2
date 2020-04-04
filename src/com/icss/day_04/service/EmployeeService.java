package com.icss.day_04.service;

import com.icss.day_04.dao.EmployeeDao;
import com.icss.day_04.pojo.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDao ed = new EmployeeDao();

    public List<Employee> getAllEmployees(){
        return ed.getAll();
    }

    public List<Employee> getSoloEmployees(){
        return ed.getSolo();
    }

    public void addEmployee(Employee employee){
        ed.add(employee);
    }
//
    public void deleteEmployee(Employee employee){
        ed.delete(employee);
    }
    public void search(Employee employee){
        ed.newadd(employee);
    }
//
//    public void updateEmployee(Employee employee){
//        ed.update(employee);
//    }
}
