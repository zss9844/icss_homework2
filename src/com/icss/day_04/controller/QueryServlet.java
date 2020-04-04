package com.icss.day_04.controller;

import com.icss.day_04.pojo.Employee;
import com.icss.day_04.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/QueryServlet")
public class QueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        System.out.println(num);
        //取对应数据删除
        EmployeeService es = new EmployeeService();
        List<Employee> emps = es.getAllEmployees();
        for(Employee e:emps){
            int flowid,type,idcard,grade;
            String examcard1,studentname,location;
            if (num.equals(e.getExamcard())||num.equals(e.getIdcard())){
                flowid=e.getFlowid();
                type=e.getType();
                idcard=e.getIdcard();
                examcard1=e.getExamcard();
                studentname=e.getStudentname();
                location=e.getLocation();
                grade=e.getGrade();
                //执行单独展示操作
                es.search(new Employee(flowid,type,idcard,examcard1,studentname,location,grade));
            }
        }
        //跳转
        request.getRequestDispatcher("NewShowServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
